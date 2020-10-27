package com.minibean.timewizard.model.biz;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minibean.timewizard.model.dao.UserTodoDao;
import com.minibean.timewizard.model.dto.UserTodoDto;

@Service
public class UserTodoBizImpl implements UserTodoBiz {

	@Autowired
	private UserTodoDao userTodoDao;
	
	@Override
	public List<UserTodoDto> selectList(int user_no) {
		return userTodoDao.selectList(user_no);
	}
	
	@Override
	public List<UserTodoDto> selectList(HashMap<String, Object> params) {
		return userTodoDao.selectList(params);
	}

	@Override
	public UserTodoDto selectOne(int todo_no) {
		return userTodoDao.selectOne(todo_no);
	}

	@Override
	public int insert(UserTodoDto dto) {
		return userTodoDao.insert(dto);
	}
	
	@Override
	public int insertExample(int user_no) {
		return userTodoDao.insertExample(user_no);
	}

	@Override
	public int update(UserTodoDto dto) {
		return userTodoDao.update(dto);
	}

	@Override
	public int delete(int todo_no) {
		return userTodoDao.delete(todo_no);
	}

}