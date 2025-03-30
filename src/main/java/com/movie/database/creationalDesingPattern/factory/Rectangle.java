package com.movie.database.creationalDesingPattern.factory;

public class Rectangle implements Safe{
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
