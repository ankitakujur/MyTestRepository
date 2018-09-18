package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addme")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddBookServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String author=request.getParameter("author");
		
		int isbn= Integer.parseInt(request.getParameter("ISBN"));

		float price=Float.parseFloat(request.getParameter("price"));
		String bookname=request.getParameter("bookname");
		String publication=request.getParameter("publication");
		Book book=new Book(bookname,isbn,price,publication,author);
		//Book b = new Book(bookName, iSBN, price, publication, author)
		BookDAO dao=new BookDAOImpl();
		int rows=dao.addBook(book);
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		if(rows>0)
		{
			System.out.println("book inserted successfully");
		}
		else
		{
			String message="Sorry cannot enter book please retry";
			request.setAttribute("mymessage", message);
			RequestDispatcher dispatcher = request.getRequestDispatcher("addbook.jsp");
			dispatcher.forward(request, response);
		}
	writer.println("</body>");
	writer.println("</html>");
	}
	
	

}
