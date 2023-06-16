package dseerutt.demo.application;

import dseerutt.demo.domaine.soigneur.impl.SoigneurImpl;
import dseerutt.demo.domaine.animal.impl.dauphin.Dauphin;
import dseerutt.demo.domaine.animal.impl.dauphin.EspeceDauphin;
import dseerutt.demo.domaine.animal.impl.ours.Ours;

public class Application {

    public static void main(String[] args) {
        System.out.println("Lancement de l'application");

        // construction des objets
        Ours ours = new Ours("Nounours", 2);
        Dauphin dauphin = new Dauphin("Flipper", 5, EspeceDauphin.DAUPHIN_D_AMAZONIE);
        SoigneurImpl soigneur = new SoigneurImpl();

        System.out.println(dauphin);
        System.out.println(ours);

        // actions
        ours.donnerPuces();
        soigneur.addAnimal(ours);
        soigneur.addAnimal(dauphin);

        System.out.println(soigneur);
    }
}
