package com.collection.list.arraylist.book;

import java.time.LocalDate;
import java.util.SplittableRandom;


public class BookDto {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private LocalDate bookPublishedDate;
    private Double bookPrice;

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
     }

    public LocalDate  getBookPublishedDate() {
        return bookPublishedDate;
    }

    public void setBookPublishedDate(LocalDate  bookPublishedDate) {
        this.bookPublishedDate = bookPublishedDate;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}
