package org.example.component;

import org.springframework.stereotype.Component;

@Component
public class Fromage {

    private String cheddar = "cheddar";

    public String afficher(){
        return "du " + this.cheddar;
    }
}
