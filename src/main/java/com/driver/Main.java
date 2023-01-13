package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = "Some name"; // This line would cause an error, as 'name' is private and can't be accessed directly

        obj.setName("Some name");
        String name = obj.getName();
        System.out.println(name); // prints "Some name"
    }
}