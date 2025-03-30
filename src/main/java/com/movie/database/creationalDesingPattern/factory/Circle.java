package com.movie.database.creationalDesingPattern.factory;

public class Circle implements Safe{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
