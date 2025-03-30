package com.movie.database.creationalDesingPattern.factory;

/**
 * it's creational design pattern, it will create object based on input condition.
 *
 */
public class FactoryPattern {

    public Safe getSafeObject(String  type) {

        if(type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if(type.equalsIgnoreCase("Triangle")){
            return new Triangle();
        } else {
            return new Rectangle();
        }
    }

}
