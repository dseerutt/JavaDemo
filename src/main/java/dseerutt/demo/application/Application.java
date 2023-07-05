package dseerutt.demo.application;

import dseerutt.demo.domaine.animal.impl.calamar.Calamar;
import dseerutt.demo.domaine.animal.impl.ours.EspeceOurs;
import dseerutt.demo.domaine.soigneur.impl.SoigneurImpl;
import dseerutt.demo.domaine.animal.impl.dauphin.Dauphin;
import dseerutt.demo.domaine.animal.impl.dauphin.EspeceDauphin;
import dseerutt.demo.domaine.animal.impl.ours.Ours;

public class Application {

    public static void main(String[] args) {
        System.out.println("Lancement de l'application");

        // construction des objets
        System.out.println("Creation d'un ours :");
        Ours ours = new Ours("Nounours", 2);
        System.out.println(ours);
        System.out.println("On donne des puces a l'ours");
        ours.donnerPuces();
        System.out.println(ours);

        System.out.println("Creation d'un dauphin :");
        Dauphin dauphin = new Dauphin("Flipper", 5, EspeceDauphin.DAUPHIN_D_AMAZONIE);
        System.out.println(dauphin);

        System.out.println("Creation d'un soigneur :");
        SoigneurImpl soigneur = new SoigneurImpl();
        System.out.println(soigneur);

        System.out.println("On ajoute des animaux au soigneur :");
        soigneur.addAnimal(ours);
        soigneur.addAnimal(dauphin);
        System.out.println(soigneur);

        System.out.println("Le soigneur soigne le dauphin :");
        soigneur.soigner(dauphin);

        // Exercice 1
        System.out.println("\nExercice 1 :");
        System.out.println("Creer un dauphin joueur");
        dauphin.setJoueur(true);
        System.out.println(dauphin);

        // Exercice 2
        System.out.println("\nExercice 2 :");
        System.out.println("Creation d'un ours brun :");
        Ours oursBrun = new Ours("Brun", 5, EspeceOurs.OURS_BRUN);
        System.out.println(oursBrun);

        // Exercice 3
        System.out.println("\nExercice 3 :");
        System.out.println("Le soigneur essaie de jouer avec un animal non joueur :");
        soigneur.jouer(ours);
        System.out.println("Le soigneur joue avec un animal joueur :");
        soigneur.jouer(dauphin);

        // Exercice 4
        System.out.println("\nExercice 4 :");
        System.out.println("Creation d'un calamar qui change de couleur :");
        Calamar calamar = new Calamar("Georges", 10, true);
        System.out.println(calamar);


    }
}
