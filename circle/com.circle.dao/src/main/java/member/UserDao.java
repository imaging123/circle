package member;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Repository;
import utils.SqlUtil;

import javax.annotation.Resources;
import java.util.Map;

/**
 * Created by bixiaofeng on 2015/11/11.
 */
public class UserDao {

	private SqlSessionFactory sqlSessionFactory;

	public User selectUserByParams(Map<String, Object> params){
		return null;
	}

	public SqlSession getSession(){
		return sqlSessionFactory.openSession();

	}

	public void setSqlSessionFactoryBean(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory= sqlSessionFactory;
	}
}
