package org.example.register;

import org.springframework.stereotype.Component;


public class Fromage {

    private String cheddar = "cheddar";

    public String afficher(){
        return "du " + this.cheddar;
    }
}
