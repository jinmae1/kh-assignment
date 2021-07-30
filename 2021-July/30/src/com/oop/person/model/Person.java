package com.oop.person.model;

/**
 * Person
 */
public class Person {

    private String name;
    private int age;
    private float height;
    private float weight;
    private long asset;

    public Person() {

    }

    public Person(String name, int age, float height, float weight, long asset) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.asset = asset;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public long getAsset() {
        return this.asset;
    }

    public void setAsset(long asset) {
        this.asset = asset;
    }

    public String information() {
        // return "this.name\t"
        // TODO:
        return String.format("%-10s\t%d\t%.1f\t%.2f\t%d", this.name, this.age, this.height, this.weight, this.asset);
    }

}