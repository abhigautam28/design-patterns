package com.movie.database.creationalDesingPattern.factory;

public class Triangle implements Safe{
    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
