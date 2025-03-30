package com.movie.database.creationalDesingPattern.factory;

public class FactaryMain {

    public static void main(String arg[]) {
        FactoryPattern factoryPattern = new FactoryPattern();
        Safe safe = factoryPattern.getSafeObject("circle");
        safe.draw();
    }
}
