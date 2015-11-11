package base;

import com.sun.javafx.geom.transform.Identity;

import java.util.Date;

/**
 * Created by bixiaofeng on 2015/11/11.
 */
public class BaseEntity extends IdEntity{

	private Date createdDate;
	private Date modifiedDate;

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
