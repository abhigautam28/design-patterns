package com.movie.database;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

import java.util.*;
import java.util.function.Predicate;

class Main {
    public static class Employee {
        private String name;
        private Integer sal;

        Employee(String name, Integer sal) {
            this.name = name;
            this.sal = sal;
        }

        public Integer getSal() {
            return sal;
        }
    }
    public static void main(String[] args) {

//        List<Employee> emp = new ArrayList<>();
//        to create imutable list we can use List.of or Arrays.asList() , they will create a fixed length imutable class.
//        here Array.asList() we can modifiy the value of any index but will not able to increase size or decrease it. emp.set(1,e5)
//        with List.of() everything will be imutable.
       Employee e1 = new Employee("abhi", 3400);
        Employee e2 =new Employee("dhic", 10000);
        Employee e3 = new Employee("dhic", 40000);
        Employee e4 = new Employee("hui", 50000);
        Employee e5 = new Employee("hui", 50000);
        List<Employee> emp = Arrays.asList(e1,  e2, e3, e4);
//        emp.add(1, e5);
        emp.set(1, e5);

        Predicate<Employee> predi = (empl) -> empl.getSal()>10000;
        Predicate<Employee> predi2 = (empl) -> empl.getSal()<50000;
        Predicate<Employee> combined = predi.and(predi2);

        List<Employee> f = emp.stream().filter(combined).toList();
        f.forEach(n -> {
            System.out.println(n.getSal());
        });

    }
}