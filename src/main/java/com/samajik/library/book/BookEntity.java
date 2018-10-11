package com.samajik.library.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    private Integer bookCode;

    private String authorName;
    private String bookName;

    private String bookSem;
    private Integer bookStockNumber;
    private String bookEdition;

    public Integer getBookCode() {
        return bookCode;
    }

    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String booName) {
        this.bookName = booName;
    }

    public String getBookSem() {
        return bookSem;
    }

    public void setBookSem(String bookSem) {
        this.bookSem = bookSem;
    }

    public Integer getBookStockNumber() {
        return bookStockNumber;
    }

    public void setBookStockNumber(Integer bookStockNumber) {
        this.bookStockNumber = bookStockNumber;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }
}

