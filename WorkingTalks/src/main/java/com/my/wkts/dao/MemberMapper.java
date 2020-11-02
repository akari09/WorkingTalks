package com.my.wkts.dao;

import java.util.ArrayList;

import com.my.wkts.vo.MemberListVO;
import com.my.wkts.vo.MemberVO;

public interface MemberMapper {
	
	//ID存在チェック
	public MemberVO isId(String user_id);
	
	//ユーザーのメンバー目録
	public ArrayList<MemberListVO> getMemberList(String user_cd);

	public int insertCustomer(MemberVO vo);
	
	public MemberVO getCustomer(String searchId);

	public int infoUpdate(MemberVO vo);

	public ArrayList<MemberVO> usersearch(String searchText);

	public MemberVO isNum(String randomNum);
	
}
