package com.movie.database.creationalDesingPattern.singletonPattern;

import java.util.Objects;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass() {

    }

//    synchronized at method level it's create unnecassary locking, even we have already intialized the instance, so for that.

//    double locking check,
    public static SingletonClass getSingletonClass() {
        if(Objects.isNull(singletonClass)) {
            synchronized (SingletonClass.class){
                if(singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}


// in springboot you want to create a single instance of your service class, -- @componet and @bean
// , @service scope by default is singleton.