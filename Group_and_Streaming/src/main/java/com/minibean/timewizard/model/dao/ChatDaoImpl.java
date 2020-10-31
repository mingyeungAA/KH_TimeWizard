package com.minibean.timewizard.model.dao;

import java.util.ArrayList;
import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.minibean.timewizard.model.dto.ChatDto;


@Repository
public class ChatDaoImpl implements ChatDao{

    @Autowired
	private SqlSessionTemplate sqlSession;
    
  
	@Override
	public List<ChatDto> selectList() {
		// TODO Auto-generated method stub
		List<ChatDto> list = new ArrayList<ChatDto>();
		try {
			list = sqlSession.selectList(namespace+"selectList");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insert(ChatDto chat) {
		// TODO Auto-generated method stub
		int res = 0;
		try {
			res = sqlSession.insert(namespace+"insert",chat);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}



	@Override
	public ChatDto selectOne(String name) {
		// TODO Auto-generated method stub
		ChatDto room = new ChatDto();
		try {
			room = sqlSession.selectOne(namespace+"selectOne",name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return room;
	}

}
