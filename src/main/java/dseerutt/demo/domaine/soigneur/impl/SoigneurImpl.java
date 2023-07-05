package dseerutt.demo.domaine.soigneur.impl;

import dseerutt.demo.domaine.animal.Animal;
import dseerutt.demo.domaine.soigneur.SoigneurBeauval;

import java.util.ArrayList;
import java.util.List;

public class SoigneurImpl implements SoigneurBeauval {

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

    @Override
    public void soigner(Animal animal) {
        System.out.println("Le soigneur a soigné " + animal.getNom());
    }

    @Override
    public void jouer(Animal animal) {
        if (animal.isJoueur()) {
            System.out.println("Le soigneur a joué avec " + animal.getNom());
        } else {
            System.out.println("Impossible de jouer car l'animal " + animal.getNom() + " n'est pas joueur");
        }
    }

    @Override
    public void nourrir(Animal animal) {
        System.out.println("Le soigneur a nourri " + animal.getNom());
    }
}
