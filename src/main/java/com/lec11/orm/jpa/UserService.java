package com.lec11.orm.jpa;

import java.util.List;

import com.lec11.orm.jpa.entity.UserEntity;

public interface UserService {	
	public UserEntity svcUserLogin(String userId, String userPw);
	public List<UserEntity> svcUserList();
	UserEntity svcUserDetail(Long userSeq);
	void svcUserUpdate(UserEntity userEntity);
	void svcUserDelete(Long userSeq);
}
