package com.oop.person.run;

import com.oop.person.controller.PersonController;

/**
 * Run
 */
public class Run {

    public static void main(String[] args) {
        Run main = new Run();
        main.test();
    }

    public void test() {
        PersonController controller = new PersonController();
        controller.inputPerson();
        controller.printPerson();
        controller.printAverages();

    }
}