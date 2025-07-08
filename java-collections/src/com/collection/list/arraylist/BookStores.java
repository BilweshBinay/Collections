package com.collection.list.arraylist;

import com.collection.list.arraylist.book.BookDto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookStores {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");

        List<BookDto> books = new ArrayList<>();
//        List<BookDto> books = new LinkedList<>();

        BookDto book = new BookDto();
        book.setBookId(101);
        book.setBookName("The Alchemist");
        book.setBookAuthor("Paulo Coelho");
        book.setBookPublishedDate(LocalDate.parse("1988/4/15", formatter));
        book.setBookPrice(499.00);

        BookDto book1 = new BookDto();
        book1.setBookId(102);
        book1.setBookName("Ikiga");
        book1.setBookAuthor("Francesc Miralles & Hector Garcia");
        book1.setBookPublishedDate(LocalDate.parse("2016/2/1", formatter));
        book1.setBookPrice(350.00);

        BookDto book2 = new BookDto();
        book2.setBookId(103);
        book2.setBookName("Rich Dad Poor Dad");
        book2.setBookAuthor("Robert T. Kiyosaki");
        book2.setBookPublishedDate(LocalDate.parse("1997/4/1", formatter));
        book2.setBookPrice(399.00);

        BookDto book3 = new BookDto();
        book3.setBookId(104);
        book3.setBookName("Sapiens: A Brief History of Humankind");
        book3.setBookAuthor("Yuval Noah Harari");
        book3.setBookPublishedDate(LocalDate.parse("2011/1/1", formatter));
        book3.setBookPrice(550.00);

        BookDto book4 = new BookDto();
        book4.setBookId(105);
        book4.setBookName("Think and Grow Rich");
        book4.setBookAuthor("Napoleon Hill");
        book4.setBookPublishedDate(LocalDate.parse("1937/8/1", formatter));
        book4.setBookPrice(299.00);

        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        books.sort(Comparator.comparing(BookDto::getBookPublishedDate));

        System.out.println("Books Sorted by Published Date:");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        for (BookDto b : books) {
            System.out.println("ID: " + b.getBookId()
                    + ", Name: " + b.getBookName()
                    + ", Author: " + b.getBookAuthor()
                    + ", Date: " + b.getBookPublishedDate().format(outputFormat)
                    + ", Price: ₹" + b.getBookPrice());
        }

        books.sort(Comparator.comparing(BookDto::getBookPublishedDate).reversed());

        System.out.println("Books Sorted by Published Date in reversed order :");
        for (BookDto b : books) {
            System.out.println("ID: " + b.getBookId()
                    + ", Name: " + b.getBookName()
                    + ", Author: " + b.getBookAuthor()
                    + ", Date: " + b.getBookPublishedDate().format(outputFormat)
                    + ", Price: ₹" + b.getBookPrice());
        }

        books.sort(Comparator.comparing(BookDto::getBookName));
        System.out.println("Books Sorted by Book Name :");
        for (BookDto b : books) {
            System.out.println("ID: " + b.getBookId()
                    + ", Name: " + b.getBookName()
                    + ", Author: " + b.getBookAuthor()
                    + ", Date: " + b.getBookPublishedDate().format(outputFormat)
                    + ", Price: ₹" + b.getBookPrice());
        }
    }
}
