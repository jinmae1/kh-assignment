package com.oop.coffee.model.dto;

/**
 * Coffee
 */
public class Coffee {

    private String origin;
    private String location;

    public Coffee() {

    }

    public Coffee(String origin, String location) {
        this.origin = origin;
        this.location = location;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCoffeInfo() {
        return this.origin + "\t" + this.location;
    }

}