package com.circle.web.bbs;

import com.circle.entity.bbs.Forum;
import com.circle.service.bbs.ForumService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2015/11/21.
 */
@Controller
public class ForumController extends MultiActionController{

	@Resource
	private ForumService forumService;

	public void getForumNode(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		PrintWriter printWriter = response.getWriter();
		String fup = request.getParameter("fup");
		List<Forum> children = forumService.getChildForums(fup);
		JSONObject json = JSONObject.fromObject(children);
		printWriter.print(json);
	}
}
