package com.my.wkts.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.wkts.vo.ChattingListVO;

@Repository
public class ChattingDAO implements ChattingMapper{
	
	@Autowired
	SqlSession sqlsession;

	@Override
	public ArrayList<ChattingListVO> getChattingList(String user_cd) {
		
		ChattingMapper mapper = sqlsession.getMapper(ChattingMapper.class);
		ArrayList<ChattingListVO> chatList = mapper.getChattingList(user_cd);
		
		return chatList;
	}

}
