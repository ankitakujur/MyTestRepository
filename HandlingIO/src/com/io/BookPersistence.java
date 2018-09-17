package com.io;
import com.beans.Book;

public interface BookPersistence {
boolean writeBooks(Book[] books);//serialization
Book[] readBooks();//deserialization

}
