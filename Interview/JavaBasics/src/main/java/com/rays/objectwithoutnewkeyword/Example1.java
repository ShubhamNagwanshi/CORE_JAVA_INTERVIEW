package com.rays.objectwithoutnewkeyword;

public class Example1 {
    public void display() {
        System.out.println("Object created using Class.forName() and newInstance()");
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.rays.objectwithoutnewkeyword.Example1");
            Example1 example = (Example1) clazz.getDeclaredConstructor().newInstance();
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}