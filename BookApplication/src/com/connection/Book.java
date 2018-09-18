package com.connection;

public class Book {
		private String bookName;
		private int ISBN;
		private double price;
		private String Publication;
		private String Author;

	
		
		

		

		public Book(String bookName, int ISBN, float price, String publication, String author) {
			super();
			this.bookName = bookName;
			this.ISBN = ISBN;
			this.price = price;
			this.Publication = publication;
			Author = author;
		}






		@Override
		public String toString() {
			// toString is necessary otherwise only the hashcodes will be printed when a
			// print statement is invoked from elsewhere
			return "\nbook [bookName=" + bookName + ", ISBN=" + ISBN + ", price=" + price + "]";
		}






		public String getBookName() {
			return bookName;
		}






		public void setBookName(String bookName) {
			this.bookName = bookName;
		}






		public int getISBN() {
			return ISBN;
		}






		public void setISBN(int iSBN) {
			ISBN = iSBN;
		}






		public double getPrice() {
			return price;
		}






		public void setPrice(double price) {
			this.price = price;
		}






		public String getPublication() {
			return Publication;
		}






		public void setPublication(String publication) {
			Publication = publication;
		}






		public String getAuthor() {
			return Author;
		}






		public void setAuthor(String author) {
			Author = author;
		}
		
}
		