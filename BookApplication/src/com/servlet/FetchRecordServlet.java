package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.Book;
import com.paos.BookDAO;
import com.paos.BookDAOImpl;

/**
 * Servlet implementation class FetchRecordServlet
 */
@WebServlet("/fetch")
public class FetchRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchRecordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		BookDAO dao= new BookDAOImpl();
		List<Book> list=dao.findAllBooks();
		for (Book b : list) {
			System.out.println(b.toString());
		}
		request.setAttribute("books", list);
		RequestDispatcher dispatcher= request.getRequestDispatcher("update.jsp");
		dispatcher.forward(request, response);
	}

}
