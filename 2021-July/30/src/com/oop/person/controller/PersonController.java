package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

/**
 * PersonController
 */
public class PersonController {

    private int p = 0;
    public static final int MAX_PERSON = 5;
    private Person[] arrPerson = new Person[MAX_PERSON];

    Scanner sc = new Scanner(System.in);

    public void inputPerson() {

        boolean stop = false;

        while (true) {
            Person person = new Person();

            System.out.print("Name: ");
            person.setName(sc.next());

            System.out.print("Age: ");
            person.setAge(sc.nextInt());

            System.out.print("Height: ");
            person.setHeight(sc.nextFloat());

            System.out.print("Weight: ");
            person.setWeight(sc.nextFloat());

            System.out.print("Asset: ");
            person.setAsset(sc.nextLong());

            arrPerson[p++] = person;

            if (p < arrPerson.length) {
                System.out.print("Stop? (Y/N(Default)):");
                stop = Character.toUpperCase(sc.next().charAt(0)) == 'Y' ? true : false;

                if (stop)
                    break;
            }
        }
        return;
    }

    public void printPerson() {
        // for (Person person : arrPerson) {
        System.out.println("===============================================");
        System.out.printf("Name\t\tAge\tHeight\tWeight\tAsset%n");
        for (int i = 0; i < p; i++) {
            if (p != 0)
                System.out.println(arrPerson[i].information());
        }
        System.out.println("===============================================");
        System.out.println();
    }

    /**
     * ? No Callback, Function Pointer, Delegate alternative for Java?
     */
    // public float getAverage() {
    // float total = 0;
    // if (p != 0) {
    // for (int i = 0; i < p; i++) {
    // total += arrPerson[i].getAge();
    //
    // }
    // }
    // return total / p;

    // }

    public void printAverages() {

        float totalAge = 0.0f;
        float totalHeight = 0.0f;
        float totalWeight = 0.0f;
        float totalAsset = 0.0f;

        for (int i = 0; i < p; i++) {
            totalAge += arrPerson[i].getAge();
            totalHeight += arrPerson[i].getHeight();
            totalWeight += arrPerson[i].getWeight();
            totalAsset += arrPerson[i].getAsset();
        }

        System.out.println("==========Average==========");
        System.out.printf("Age:\t%.2f%n", totalAge / p);
        System.out.printf("Height:\t%.2fcm%n", totalHeight / p);
        System.out.printf("Weight:\t%.2fkg%n", totalWeight / p);
        System.out.printf("Asset:\t$%.2f%n", totalAsset / p);
        System.out.println("===========================");

    }
}