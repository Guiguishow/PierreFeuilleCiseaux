package game;

import java.util.Scanner;
import game.Joueur;

public class Jeu {

    private Joueur joueur1;
    private Joueur joueur2;
    private Scanner scanner;

    public Jeu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du joueur 1 : ");
        String nom1 = scanner.nextLine();
        joueur1 = new Joueur(nom1, null);

        System.out.print("Entrez le nom du joueur 2 : ");
        String nom2 = scanner.nextLine();
        joueur2 = new Joueur(nom2, null);
    }

    public void play() {

    }

}
