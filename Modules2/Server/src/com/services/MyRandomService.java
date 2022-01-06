package com.services;

public class MyRandomService implements RandomService{
    @Override
    public void speak() {
        System.out.println("My random service");
    }
}
