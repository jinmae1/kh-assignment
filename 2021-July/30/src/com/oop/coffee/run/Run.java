package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManager;

/**
 * Run
 */
public class Run {

    public static void main(String[] args) {

        Run main = new Run();
        main.test();

    }

    public void test() {
        CoffeeManager manager = new CoffeeManager();
        manager.inputCoffee();
        manager.printCoffee();
    }
}