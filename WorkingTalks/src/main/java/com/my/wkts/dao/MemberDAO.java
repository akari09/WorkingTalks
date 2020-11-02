package com.my.wkts.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.wkts.vo.MemberListVO;
import com.my.wkts.vo.MemberVO;

@Repository
public class MemberDAO implements MemberMapper {
	
	@Autowired
	SqlSession sqlsession;

	//ID存在チェック
	@Override
	public MemberVO isId(String user_id) {
			
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		MemberVO mem = mapper.isId(user_id);
			
		return mem;
	}

	@Override
	public ArrayList<MemberListVO> getMemberList(String user_cd) {
		
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		ArrayList<MemberListVO> memlist = mapper.getMemberList(user_cd);
		
		return memlist;
	}
	
	@Override
	public int insertCustomer(MemberVO vo) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		int res=0;
		
		try{
			res = mapper.insertCustomer(vo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res; //成功 1, 失敗 0
	}
	
	@Override
	public MemberVO getCustomer(String searchId) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		MemberVO vo = null;
		
		try{
			vo = mapper.getCustomer(searchId);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return vo;
	}
	
	@Override
	public int infoUpdate(MemberVO info_vo) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		int res=0;
		
		try{
			res = mapper.infoUpdate(info_vo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
	
	@Override
	public ArrayList<MemberVO> usersearch(String searchText) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		ArrayList<MemberVO> vo = null;
		
		try{
			vo = mapper.usersearch(searchText);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return vo;
	}
	
	@Override
	public MemberVO isNum(String randomNum) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		MemberVO vo = null;
		
		try{
			vo = mapper.getCustomer(randomNum);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return vo;
	}
	
}
