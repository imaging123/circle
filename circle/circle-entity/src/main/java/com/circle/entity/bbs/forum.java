package com.circle.entity.bbs;

import com.circle.entity.base.BaseEntity;

import java.math.BigInteger;

/**
 * Created by Administrator on 2015/11/21.
 */
public class Forum extends BaseEntity{

	private Long fid;
	private String name;
	private String fup;
	private BigInteger themesNum;
	private BigInteger postsNum;

	public BigInteger getPostsNum() {
		return postsNum;
	}

	public void setPostsNum(BigInteger postsNum) {
		this.postsNum = postsNum;
	}

	public String getFup() {
		return fup;
	}

	public void setFup(String fup) {
		this.fup = fup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getThemesNum() {
		return themesNum;
	}

	public void setThemesNum(BigInteger themesNum) {
		this.themesNum = themesNum;
	}

	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}
}
