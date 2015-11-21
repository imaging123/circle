package com.circle.entity.base;

import java.util.Date;

/**
 * Created by bixiaofeng on 2015/11/11.
 */
public class BaseEntity {

	private Date createdDate;
	private Date modifiedDate;
	private Integer deletedFlag;

	public Integer getDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(Integer deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
