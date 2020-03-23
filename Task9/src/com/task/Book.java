package com.task;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearPublishing;
    private int numberOfPages;
    private double price;
    private String bindingType;

    Book(int Id, String name, String Author, String Publisher, int yearPublishing, int numberOfPages, double Price, String bindingType) {
        this.id = Id;
        this.name = name;
        this.author = Author;
        this.publisher = Publisher;
        this.yearPublishing = yearPublishing;
        this.numberOfPages = numberOfPages;
        this.price = Price;
        this.bindingType = bindingType;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return ("book: " + name + "  author: " + author + " Publisher " + publisher + " year of publishing " + yearPublishing + " price " + price + " binding type " + bindingType);
    }
}
