package org.example.register;

import org.springframework.stereotype.Component;


public class Pain {

    private String pain = "au sésame";
        public String afficher(){
        return "du pain " + this.pain;
    }
}
