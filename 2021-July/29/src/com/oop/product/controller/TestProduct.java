package com.oop.product.controller;

import com.oop.product.model.Product;

/**
 * TestProduct
 */
public class TestProduct {

    public static void main(String[] args) {

        int includeTax = 0;

        Product[] product = new Product[3];
        product[0] = new Product("ssgnote6", "갤럭시노트6", "경기도수원", 960_000, 10.0);
        product[1] = new Product("lgxnote5", "LG스마트폰5", "경기도평택", 780_000, 0.7);
        product[2] = new Product("ktnorm3", "KT일반폰3", "서울시강남", 25_000, 0.3);

        System.out.println("Step 1 ==============");
        for (Product p : product) {
            p.information();
        }
        System.out.println();

        System.out.println("Step 2 ==============");
        for (Product p : product) {
            p.setPrice(1_200_000);
            p.setTax(0.05);
            p.information();

        }
        System.out.println();

        System.out.println("Step 3 ==============");
        for (Product p : product) {
            p.setTax(0.05);
            includeTax = (int) (p.getPrice() * (1 + p.getTax()));
            System.out.printf("상품명: %s%n", p.getProductName());
            System.out.printf("부가세 포함 가격: %s원%n", includeTax);

        }

    }
}