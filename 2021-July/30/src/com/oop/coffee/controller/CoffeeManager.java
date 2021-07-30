package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

/**
 * CoffeeManager
 */
public class CoffeeManager {

    private final int MAX_COFFEE = 3;
    private Coffee[] arrCoffee = new Coffee[MAX_COFFEE];

    Scanner sc = new Scanner(System.in);

    public void inputCoffee() {

        boolean stop = false;

        for (int i = 0; i < arrCoffee.length; i++) {

            Coffee coffee = new Coffee();
            System.out.print("Coffee origin: ");
            coffee.setOrigin(sc.next());

            System.out.print("Coffee location: ");
            coffee.setLocation(sc.next());

            arrCoffee[i] = coffee;

            if (i < arrCoffee.length - 1) {
                System.out.print("Stop? (Y/N(Default)):");
                stop = Character.toUpperCase(sc.next().charAt(0)) == 'Y' ? true : false;

                if (stop)
                    break;
            }
        }
        return;
    }

    public void printCoffee() {
        System.out.println("<세계 3대 커피>");
        System.out.println("---------------------------");
        System.out.println("원산지\t지역");
        System.out.println("---------------------------");
        for (Coffee coffee : arrCoffee) {
            if (coffee == null)
                break;
            System.out.println(coffee.getCoffeInfo());
        }
        System.out.println("---------------------------");
        return;
    }
}