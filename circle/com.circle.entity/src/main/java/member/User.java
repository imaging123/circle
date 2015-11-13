package member;

import annotation.Table;
import base.BaseEntity;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by bixiaofeng on 2015/11/11.
 */
@Table("member_user")
public class User extends BaseEntity{

	public static Integer i = 5;
	static {
		i = 6;
	}

	private String nickname;
	private String password;
	private Date birthday;
	private Integer gender;
	private String phone;
	private String email;

	public static User convert(List<Map<String, Object>> maps){
		return null;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
