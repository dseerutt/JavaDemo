package dseerutt.demo.domaine.animal.impl.dauphin;

import dseerutt.demo.domaine.animal.Animal;

public class Dauphin extends Animal {

    private EspeceDauphin especeDauphin;

    public Dauphin(String nom, int age, EspeceDauphin typeDauphin) {
        super(nom, age);
        this.especeDauphin = typeDauphin;
    }

    public EspeceDauphin getEspeceDauphin() {
        return especeDauphin;
    }

    public void setEspeceDauphin(EspeceDauphin especeDauphin) {
        this.especeDauphin = especeDauphin;
    }

    @Override
    public String toString() {
        return "Dauphin{" + super.toString() +
                ", typeDauphin=" + especeDauphin +
                '}';
    }
}
