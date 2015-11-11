package utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by bixiaofeng on 2015/11/11.
 */
public class SqlUtil {

	public final static String getParamsSql(Map<String, Object> params){
		StringBuffer sql = new StringBuffer();
		Set<String> keys = params.keySet();
		Iterator<String> iterator = keys.iterator();
		boolean first = true;
		while(iterator.hasNext()){
			String key = iterator.next();
			Object value = params.get(key);
			if (!first){
				sql.append(" and");
			}else{
				first = false;
			}
			sql.append(" " + key + " = '" + value + "'");
		}
		return sql.toString();
	}

}
