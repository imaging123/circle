package com.circle.dao.mappers.bbs;

import com.circle.entity.bbs.Forum;

import java.util.List;

public interface ForumMapper{
	Long insertForum(Forum forum);
	Forum selectForum(Long fid);
	Long deleteForum(Long fid);
	List<Forum> selectChildForumList(Long fup);
}
