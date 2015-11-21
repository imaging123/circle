package com.circle.entity.bbs;

import com.circle.entity.base.BaseEntity;

/**
 * Created by Administrator on 2015/11/21.
 */
public class Post extends BaseEntity{
	private Long pid;
	private Long tid;
	private Long fid;
	private String content;
	//回复的上一回复的ID
	private Long rid;
	private Long authorId;

	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}
}
