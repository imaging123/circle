package com.circle.service.bbs;

import com.alibaba.druid.util.StringUtils;
import com.circle.dao.mappers.bbs.ThemeMapper;
import com.circle.entity.bbs.Theme;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/11/21.
 */
@Service
@Transactional
public class ThemeService {
	@Resource
	private ThemeMapper themeMapper;
	public Theme getThemeById(String id){
		if (StringUtils.isEmpty(id)){
			return null;
		}
		Long tid = Long.parseLong(id);
		Theme theme = themeMapper.selectTheme(tid);
		return theme;
	}

}
