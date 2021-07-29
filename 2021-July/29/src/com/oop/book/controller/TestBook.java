package com.oop.book.controller;

import com.oop.book.model.Book;

/**
 * TestBook
 */
public class TestBook {

    public static void main(String[] args) {

        int discountPrice = 0;

        Book[] book = new Book[2];
        book[0] = new Book();
        book[1] = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤");

        System.out.println("Step 1 ==============");
        for (Book b : book) {
            b.bookInformation();
        }
        System.out.println();

        System.out.println("Step 2 ==============");
        book[0].setTitle("자바의 정석");
        book[0].setPrice(35000);
        book[0].setDiscountRate(0.1);
        book[0].setAuthor("윤상섭");

        for (Book b : book) {
            b.bookInformation();
        }
        System.out.println();

        System.out.println("Step 3 ==============");
        for (Book b : book) {
            discountPrice = (int) (b.getPrice() * (1 - b.getDiscountRate()));
            System.out.printf("도서명: %s%n", b.getTitle());
            System.out.printf("할인된 가격: %d%n", discountPrice);

        }

    }
}