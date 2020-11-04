package com.my.wkts.dao;

import java.util.ArrayList;

import com.my.wkts.vo.ChattingListVO;

public interface ChattingMapper {
	
	public ArrayList<ChattingListVO> getChattingList(String user_cd);

}
