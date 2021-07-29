package com.oop.book.model;

/**
 * Book
 */
public class Book {

    private String title;
    private int price;
    private double discountRate;
    private String author;

    public Book() {

    }

    public Book(String title, int price, double discountRate, String author) {
        this.title = title;
        this.price = price;
        this.discountRate = discountRate;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPrice() {
        return this.price;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public String getAuthor() {
        return this.author;
    }

    public void bookInformation() {
        System.out.printf("%-40s", this.title);
        System.out.printf("%-10d", this.price);
        System.out.printf("%-10.2f", this.discountRate);
        System.out.printf("%-20s", this.author);
        System.out.println();
    }

}