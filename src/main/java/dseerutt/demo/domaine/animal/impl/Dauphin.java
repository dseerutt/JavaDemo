package dseerutt.demo.domaine.animal.impl;

import dseerutt.demo.domaine.animal.Animal;

public class Dauphin extends Animal {

    private boolean eauDouce;

    public Dauphin(String nom, int age, boolean eauDouce) {
        super(nom, age);
        this.eauDouce = eauDouce;
    }

    public boolean isEauDouce() {
        return eauDouce;
    }

    public void setEauDouce(boolean eauDouce) {
        this.eauDouce = eauDouce;
    }

    @Override
    public String toString() {
        return "Dauphin{" + super.toString() +
                ", eauDouce=" + eauDouce +
                '}';
    }
}
