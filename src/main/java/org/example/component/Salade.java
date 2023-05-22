package org.example.component;

import org.springframework.stereotype.Component;

@Component
public class Salade {

    private String iceberg = "iceberg";

    public String afficher(){
        return "de la salade " + this.iceberg;
    }
}
