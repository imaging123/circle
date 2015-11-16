package com.circle.service.member;

import com.circle.dao.mappers.member.UserMapper;
import com.circle.entity.member.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by bixiaofeng on 2015/11/13.
 */
@Service
@Transactional
public class UserService {

	@Resource
	private UserMapper userMapper;

	public User getUserByUsernameAndPassword(String username, String password){
		return userMapper.getUserByPassword(username, password);
	}



}
