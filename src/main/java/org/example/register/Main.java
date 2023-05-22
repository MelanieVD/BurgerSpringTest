package org.example.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.register(Fromage.class, Burger.class, Pain.class, Salade.class, Steak.class);
        Burger burger = context.getBean(Burger.class);
        burger.afficher();
    }
    }