package dseerutt.demo.domaine.soigneur.impl;

import dseerutt.demo.domaine.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class SoigneurImpl implements Soigneur {

    private List<Animal> animaux;

    public SoigneurImpl() {
        animaux = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    @Override
    public String toString() {
        return "Soigneur{" +
                "animaux=" + animaux +
                '}';
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }

    public void soigner(Animal animal) {
        System.out.println("Le soigneur a soigné " + animal.getNom());
    }

    @Override
    public void nourrir(Animal animal) {
        System.out.println("Le soigneur a nourri " + animal.getNom());
    }
}
