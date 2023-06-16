package dseerutt.demo.domaine.animal.impl.ours;

import dseerutt.demo.domaine.animal.Animal;

public class Ours extends Animal {

    private boolean puces;

    public Ours(String nom, int age) {
        super(nom, age);
        puces = false;
    }

    public boolean isPuces() {
        return puces;
    }

    public void setPuces(boolean puces) {
        this.puces = puces;
    }

    @Override
    public String toString() {
        return "Ours{" + super.toString() +
                ", puces=" + puces +
                '}';
    }

    public void donnerPuces() {
        puces = true;
    }
}
