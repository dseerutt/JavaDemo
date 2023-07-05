package dseerutt.demo.domaine.animal.impl.ours;

import dseerutt.demo.domaine.animal.Animal;

public class Ours extends Animal {

    private boolean puces;

    private EspeceOurs especeOurs;


    // ce constructeur est conserve uniquement pour que le code avant l'exercice 2 fonctionne toujours
    // attention, il initialise a null l'espece
    public Ours(String nom, int age) {
        super(nom, age);
        puces = false;
    }

    public Ours(String nom, int age, EspeceOurs especeOurs) {
        super(nom, age);
        puces = false;
        this.especeOurs = especeOurs;
    }

    public boolean isPuces() {
        return puces;
    }

    public void setPuces(boolean puces) {
        this.puces = puces;
    }

    @Override
    public String toString() {
        // gerer le cas de l'espece nulle
        String especeOursTxt = (especeOurs == null) ? "" : ", especeOurs=" + especeOurs.name();
        return "Ours{" + super.toString() +
                ", puces=" + puces + especeOursTxt +
                '}';
    }

    public void donnerPuces() {
        puces = true;
    }
}
