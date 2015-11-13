package member;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import utils.SqlUtil;

import java.util.Map;

/**
 * Created by bixiaofeng on 2015/11/11.
 */
public class UserDao {

	private SqlSessionFactoryBean sqlSessionFactoryBean;

	public User selectUserByParams(Map<String, Object> params){
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member_user where ");
		sql.append(SqlUtil.getParamsSql(params));
		return null;
	}

	public SqlSession getSession(){
		return sqlSessionFactoryBean.
	}

	public void setSqlSessionFactoryBean(SqlSessionFactoryBean sqlSessionFactoryBean) {
		this.sqlSessionFactoryBean = sqlSessionFactoryBean;
	}
}
