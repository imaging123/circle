package com.circle.web.bbs;

import com.circle.entity.bbs.Theme;
import com.circle.service.bbs.ThemeService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2015/11/21.
 */
@Controller
@RequestMapping("/theme")
public class ThemeController extends MultiActionController{
	@Resource
	private ThemeService themeService;

	@RequestMapping("/detail")
	public void detail(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String tid = request.getParameter("tid");
		Theme theme = themeService.getThemeById(tid);
		JSONObject json = JSONObject.fromObject(theme);
		PrintWriter out = response.getWriter();
		out.print(json);
		out.flush();
		out.close();
	}

}
