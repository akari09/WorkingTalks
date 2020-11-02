package com.my.wkts.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.my.wkts.dao.MemberDAO;
import com.my.wkts.util.CodeManager;
import com.my.wkts.vo.MemberListVO;
import com.my.wkts.vo.MemberVO;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	private static CodeManager cdmgr;
	
	@Autowired
	MemberDAO mDao;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String user_id, String user_pw, HttpSession session, Model model) {
		
		MemberVO mVo = mDao.isId(user_id);
		
		if (mVo != null && mVo.getUser_pw().equals(user_pw)){
			session.setAttribute("loginID", user_id);
			session.setAttribute("loginCode", mVo.getUser_cd());
			
			return "indexMain/templatepage";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
		session.removeAttribute("loginID");
		session.removeAttribute("loginCode");
		
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping(value = "/userlist", method = RequestMethod.POST)
	public ArrayList<MemberListVO> userlist(String user_cd) {
		
		ArrayList<MemberListVO> mlistVo = mDao.getMemberList(user_cd);
		
		return mlistVo;
	}
	
	//会員登録処理
		@RequestMapping(value = "/join", method = RequestMethod.POST)
		public String join(MemberVO vo){
			String randomNum = "";
			MemberVO checkVO = null;
			while(true){
				randomNum = "";
				randomNum = cdmgr.randomNum();
				checkVO = mDao.isNum(randomNum);
				if(checkVO == null){
					vo.setUser_cd(randomNum);
					break;
				}
			}
			
			mDao.insertCustomer(vo);
			logger.debug("登録情報：　", vo);
			return "redirect:/";
		}
		
		//会員情報の表示処理
		@ResponseBody
		@RequestMapping(value = "/info", method = RequestMethod.POST)
		public MemberVO info(HttpSession session, Model model){
			String loginId = (String) session.getAttribute("loginID");
			logger.debug("ID：　", loginId);
			System.out.println(loginId);
			MemberVO vo = mDao.getCustomer(loginId);
			logger.debug("vo：　", vo.toString());
			System.out.println(vo.toString());
			return vo;
		}
		
		//会員情報の修正処理
		@RequestMapping(value = "/infoUpdate", method = RequestMethod.POST)
		public String infoUpdate(HttpSession session, MemberVO vo){
			String loginId = (String) session.getAttribute("loginID");
			mDao.infoUpdate(vo);
			MemberVO info_vo = mDao.getCustomer(loginId);
			System.out.println("修正後：　" + info_vo.toString());
			return "redirect:/login?pageChange=userPage/UserInfo.jsp";
		}
		
		//会員検索の処理
		@RequestMapping(value = "/usersearch", method = RequestMethod.POST)
		public String usersearch(HttpServletRequest request, RedirectAttributes redirectAttributes, String searchText){
			ArrayList<MemberVO> vo = null;
			vo = mDao.usersearch(searchText);
			System.out.println("入力値：　" + searchText);
			redirectAttributes.addFlashAttribute("searchResult", vo);
			System.out.println("検索結果：　" + vo);
			return "redirect:/login?pageChange=userPage/UserSearch.jsp";
		}
	
}
