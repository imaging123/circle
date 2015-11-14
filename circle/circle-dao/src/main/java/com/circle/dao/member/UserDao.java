package com.circle.dao.member;

import com.circle.entity.member.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by bixiaofeng on 2015/11/11.
 */
public interface UserDao {

	@Select({"select * from member_user where username = "})
	public User selectUserByParams(@Param("username")String username, @Param("password")String password);

}
