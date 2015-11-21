package com.circle.dao.mappers.member;

import com.circle.entity.member.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2015/11/16.
 */
public interface UserMapper{

	public User getUserByPassword(@Param("username")String username, @Param("password")String password);


}
