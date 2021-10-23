package com.example.bookstorebackend.model;

import org.springframework.data.annotation.Id;

public class Book {
    @Id
    private String id;
    private String title;
    private String category;
    private String author;
    private double price;

    public Book()  {

    }
    public Book(String title,String category,String author,double price){
        this.title=title;
        this.category=category;
        this.price=price;
        this.author=author;
    }

    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", desc=" + category + ", author=" + author + ", price=" + price +"]";
    }
}
