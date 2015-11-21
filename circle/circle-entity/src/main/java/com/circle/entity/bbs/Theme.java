package com.circle.entity.bbs;

import com.circle.entity.base.BaseEntity;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by Administrator on 2015/11/21.
 */
public class Theme extends BaseEntity{

	private Long tid;
	private Long fid;
	private String title;
	private String content;
	private Long authorId;
	private BigInteger postsNum;
	private List<Post> posts;

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public BigInteger getPostsNum() {
		return postsNum;
	}

	public void setPostsNum(BigInteger postsNum) {
		this.postsNum = postsNum;
	}

	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
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

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
