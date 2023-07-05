package dseerutt.demo.domaine.animal;

public abstract class Animal {

    private String nom;
    private int age;

    private boolean joueur = false;

    protected Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isJoueur() {
        return joueur;
    }

    public void setJoueur(boolean joueur) {
        this.joueur = joueur;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", age=" + age +
                ", joueur=" + joueur;
    }
}
