package com.etc.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.etc.entity.Admin;
import com.etc.service.AdminService;
import com.etc.service.impl.AdminServiceImpl;



/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 创建Service对象
	AdminService as = new AdminServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置请求的编码 ,位置应该在request.getParameter之前
		request.setCharacterEncoding("utf-8");
		//得到参数op
		String op = request.getParameter("op");
		if ("login".equals(op)) {
			// 得到用户输入的用户名和密码
			String adminAccount = request.getParameter("adminAccount");
			String adminPwd = request.getParameter("adminPwd");
			// 调用userService的方法
			Admin a = as.adminLogin(adminAccount, adminPwd);
			
			if (null !=a) {
				// 用户名和密码正确
				
			
					// 将用户登录的信息存储在session中
					HttpSession session = request.getSession();
					// 将用户信息存储在session对象中
					session.setAttribute("Admin", a);
					session.setAttribute("adminAccount", adminAccount);
					// 登录成功 跳转后台的界面
				
					// 1 转发
					//request.getRequestDispatcher("admin/index.jsp").forward(request, response);
					// 2重定向
				
				response.sendRedirect("admin/index.jsp");
			
			} else {
				// 用户名或者密码错误 ,跳转到登录页面去
				// 1 转发
				// 2重定向
				
				response.sendRedirect("admin/login.jsp");

			}

		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
