package com.circle.service.bbs;

import com.circle.dao.mappers.bbs.ForumMapper;
import com.circle.entity.bbs.Forum;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2015/11/21.
 */
@Service
@Transactional
public class ForumService {
	@Resource
	private ForumMapper forumMapper;
	public boolean addForum(Forum forum){
		if("".equals(forum.getName())){
			return false;
		}
		Long ok = forumMapper.insertForum(forum);
		if (ok != null && ok > 0){
			return true;
		}
		return false;
	}
	public boolean deleteForum(Long fid){
		if(fid == null){
			return false;
		}
		long ok = forumMapper.deleteForum(fid);
		if(ok > 0){
			return true;
		}
		return false;
	}

	public Forum getForumById(long fid){
		return forumMapper.selectForum(fid);
	}

	public List<Forum> getChildForums(String fup){
		Long parentId = Long.parseLong(fup);
		List<Forum> children = new ArrayList<Forum>();
		children = forumMapper.selectChildForumList(parentId);
		if (children == null){
			return null;
		}
		return children;
	}

}
