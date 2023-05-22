package org.example.config;


public class Burger {
    private Fromage fromage;
    private Pain pain;
    private Salade salade;
    private Steak steak;

    public Burger(Fromage fromage, Pain pain, Salade salade, Steak steak) {
        this.fromage = fromage;
        this.pain = pain;
        this.salade = salade;
        this.steak = steak;
    }

    public void afficher(){
        System.out.println("Le burger contient" + pain.afficher() + ", " + steak.afficher() + ", " + fromage.afficher() + " et " + salade.afficher()+ ".");
    }
}
