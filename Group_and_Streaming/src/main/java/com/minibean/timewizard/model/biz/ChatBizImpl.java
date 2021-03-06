package com.minibean.timewizard.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minibean.timewizard.model.dao.ChatDao;
import com.minibean.timewizard.model.dao.ChatDaoImpl;
import com.minibean.timewizard.model.dto.ChatDto;

@Service
public class ChatBizImpl implements ChatBiz{

	@Autowired
	ChatDao dao = new ChatDaoImpl();

	@Override
	public int insert(ChatDto chat) {
		// TODO Auto-generated method stub
		return dao.insert(chat);
	}

	@Override
	public List<ChatDto> selectList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	@Override
	public ChatDto selectOne(String name) {
		// TODO Auto-generated method stub
		return dao.selectOne(name);
	}
	
	@Override
	public int clientplus(String name) {
		return dao.clientplus(name);
	}
	@Override
	public int kaboom(String name) {
		return dao.kaboom(name);
	}

	@Override
	public int clientminus(String name) {
		// TODO Auto-generated method stub
		return dao.clientminus(name);
	}

	@Override
	public ChatDto clientnum(String name) {
		// TODO Auto-generated method stub
		return dao.clientnum(name);
	}
	
	 
	 


}
