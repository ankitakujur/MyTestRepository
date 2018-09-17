package com.io;

import com.beans.Book;

public interface BookOperations {
 public Book[] findAllbooks();
 public Book findBookbyISBN(int name);
 public Book[] findBookbyAuthor(String name);
 
}
