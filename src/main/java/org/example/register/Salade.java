package org.example.register;

import org.springframework.stereotype.Component;


public class Salade {

    private String iceberg = "iceberg";

    public String afficher(){
        return "de la salade " + this.iceberg;
    }
}
