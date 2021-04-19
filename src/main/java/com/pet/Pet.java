package com.pet;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    //constructor 1 empty
    public Pet() {

    }
    //constructor 2
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    //get method
    public String getName() {

        return name;
    }
    //set method
    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }


}