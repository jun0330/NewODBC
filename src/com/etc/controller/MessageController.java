package com.etc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.entity.Message;
import com.etc.service.MessageService;
import com.etc.service.impl.MessageServiceImpl;

/**
 * Servlet implementation class MessageController
 */
@WebServlet("/MessageController")
public class MessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MessageService ms = new MessageServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String op = request.getParameter("op");
		if("query".equals(op)) {
			doQueryMessage(request, response);
		}
	}
	protected void doQueryMessage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Message> list = ms.getAllMessage();
		
		
		request.setAttribute("list", list);
		for (Message message : list) {
			System.out.println(message);
		}
		
		request.getRequestDispatcher("admin/Message.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
