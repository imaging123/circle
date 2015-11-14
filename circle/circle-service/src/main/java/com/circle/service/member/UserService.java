package com.circle.service.member;

import com.circle.entity.member.User;
import com.circle.entity.member.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bixiaofeng on 2015/11/13.
 */
@Service
@Transactional
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserByUsernameAndPassword(String username, String password){
		return userMapper.getUserByPassword(username, password);
	}



}
