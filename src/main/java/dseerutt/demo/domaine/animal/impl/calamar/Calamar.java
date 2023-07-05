/**
 * Copyright (c) 2023 by Synamedia. All rights reserved.
 */
package dseerutt.demo.domaine.animal.impl.calamar;

import dseerutt.demo.domaine.animal.Animal;

public class Calamar extends Animal {

    private boolean changeCouleur;
    public Calamar(String nom, int age, boolean changeCouleur) {
        super(nom, age);
        this.changeCouleur = changeCouleur;
    }

    public boolean isChangeCouleur() {
        return changeCouleur;
    }

    public void setChangeCouleur(boolean changeCouleur) {
        this.changeCouleur = changeCouleur;
    }

    @Override
    public String toString() {
        return "Calamar{" + super.toString() +
                       ", changeCouleur=" + changeCouleur +
                       '}';
    }
}
