package com.circle.entity.member.mappers;

import com.circle.entity.member.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/11/14
 */
@Component
public interface UserMapper {

	public User getUserByPassword(@Param("username")String username, @Param("password")String password);

}
