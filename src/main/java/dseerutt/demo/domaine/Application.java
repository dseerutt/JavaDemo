package dseerutt.demo.domaine;

import dseerutt.demo.domaine.animal.impl.Dauphin;
import dseerutt.demo.domaine.animal.impl.Ours;

public class Application {

    public static void main(String[] args) {
        System.out.println("Lancement de l'application");

        Ours ours = new Ours("Nounours", 2);
        Dauphin dauphin = new Dauphin("Flipper", 5, false);

        System.out.println(dauphin);
        System.out.println(ours);
        ours.donnerPuces();
        System.out.println(ours);
    }
}
