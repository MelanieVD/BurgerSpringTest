package org.example.component;

import org.springframework.stereotype.Component;

@Component
public class Pain {

    private String pain = "au sésame";

    public String afficher(){
        return "du pain " + this.pain;
    }
}
