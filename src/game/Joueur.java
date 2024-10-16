package game;

public class Joueur {
    private String nom;
    private String choix;

    public Joueur(String nom, String choix) {
        this.nom = nom;
        this.choix = "";
    }

    public String getNom() {
        return nom;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    public String getChoix() {
        return choix;
    }
}
