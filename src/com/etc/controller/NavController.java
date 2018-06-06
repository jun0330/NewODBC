package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.entity.Nav;
import com.etc.service.NavService;
import com.etc.service.impl.NavServiceImpl;

/**
 * Servlet implementation class NavController
 */
@WebServlet("/NavController")
public class NavController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    NavService ns=new NavServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String op="query";
		if(null!=request.getParameter("op")) {
			op=request.getParameter("op");
		}
		if("query".equals(op)) {
			/**
			 * 处理查询请求
			 */
			List<Nav> navList=ns.getNav();
			request.setAttribute("navList", navList);
			request.getRequestDispatcher("admin/nav-list.jsp").forward(request, response);
		}else if("checkNavName".equals(op)) {
			/**
			 * 处理检查是否已存在导航
			 */
			String navName=request.getParameter("navName");
			PrintWriter pw=response.getWriter();
			if(ns.checkNavName(navName)) {
				pw.print("f");
			}else{
				pw.print("t");	
			}
			pw.close();
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String op="query";
		if(null!=request.getParameter("op")) {
			op=request.getParameter("op");
		}
		if("addNav".equals(op)) {
			String navName="";
			String navPage="";
			if(null!=request.getParameter("navName") && null!=request.getParameter("navPage")) {
				navName=request.getParameter("navName");
				navPage=request.getParameter("navPage");
				
				Nav n=new Nav(navName, navPage, 5);
				PrintWriter pw=response.getWriter();
				if(ns.addNav(n)) {
					pw.print("ok");
				}
				
			}
		}
	}

}
