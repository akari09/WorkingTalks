package com.my.wkts.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.wkts.dao.ChattingDAO;
import com.my.wkts.vo.ChattingListVO;

@Controller
public class ChattingController {
	
	@Autowired
	ChattingDAO cDao;
	
	@ResponseBody
	@RequestMapping(value = "/chatlist", method = RequestMethod.POST)
	public ArrayList<ChattingListVO> userlist(String user_cd) {
		
		ArrayList<ChattingListVO> clistVo = cDao.getChattingList(user_cd);
		
		return clistVo;
	}
	
	@ResponseBody
	@RequestMapping(value = "/chatstart", method = RequestMethod.POST)
	public String startApp() {
		
		System.out.println("채팅 서버 접속 메소드 테스트");
		
		return "/";
	}

}
