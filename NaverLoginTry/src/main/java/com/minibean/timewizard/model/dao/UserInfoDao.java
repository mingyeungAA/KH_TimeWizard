package com.minibean.timewizard.model.dao;

import java.util.List;

import com.minibean.timewizard.model.dto.UserInfoDto;

public interface UserInfoDao {

	String NAMESPACE = "com.minibean.timewizard.userinfo.";
	
	public List<UserInfoDto> selectList();
	public UserInfoDto selectOne(int user_no); /* session용 */
	public UserInfoDto selectOne(UserInfoDto dto); /* 기타용 */
	public int insert(UserInfoDto dto);
	public int update(UserInfoDto dto);
	public int delete(int user_no);
	
}
