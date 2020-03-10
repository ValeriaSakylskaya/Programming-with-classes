package com.task;

public class Book {
    private  int Id;
    private String name;
    private String Author;
    private  String Publisher;
    private  int yearPublishing;
    private int numberPages;
    private double Price;
    private String bindingType;
    Book ()
    {

    }
    Book ( int Id, String name, String Author, String Publisher, int yearPublishing, int numberPages, double Price, String bindingType )
    {
        this.Id = Id;
        this.name = name;
        this.Author = Author;
        this.Publisher = Publisher;
        this.yearPublishing = yearPublishing;
        this.numberPages = numberPages;
        this.Price = Price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public double getPrice() {
        return Price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    public  void infoBook ()
    {
        System.out.println("");
    }
    @Override
    public  String toString()
    {
        return ("book: " + name + "  author: " + Author + " Publisher " + Publisher +" year of publishing " + yearPublishing + " price " + Price + " binding type " + bindingType);
    }
}
