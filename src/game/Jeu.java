package game;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Jeu {

    private ArrayList<Joueur> joueurs;
    private Scanner scanner;

    public Jeu() {
        joueurs = new ArrayList<>();
        scanner = new Scanner(System.in);
        createPlayer();
    }

    private void createPlayer() {
        for (int i = 1; i <= 2; i++) {
            System.out.print("Entrez le nom du joueur " + i + " : ");
            String nom = scanner.nextLine();
            joueurs.add(new Joueur(nom, ""));
        }
    }

    public void play() {
        boolean continuer = true;

        Map<String, String> rules = new HashMap<>();
        rules.put("Pierre", "Ciseaux");
        rules.put("pierre", "Ciseaux");
        rules.put("Pierre", "ciseaux");
        rules.put("pierre", "ciseaux");

        rules.put("Ciseaux", "Feuille");
        rules.put("ciseaux", "Feuille");
        rules.put("Ciseaux", "feuille");
        rules.put("ciseaux", "feuille");

        rules.put("Feuille", "Pierre");
        rules.put("feuille", "Pierre");
        rules.put("Feuille", "pierre");
        rules.put("feuille", "pierre");

        while (continuer) {

            for (int i = 0; i < joueurs.size(); i++) {
                String choix;
                System.out.print(joueurs.get(i).getNom() + ", faites votre choix : ");
                choix = scanner.nextLine();
                while (!rules.containsKey(choix)) {
                    System.out.print("Le choix n'est pas bon, " + joueurs.get(i).getNom() + ", refaites votre choix : ");
                    choix = scanner.nextLine();
                }
                joueurs.get(i).setChoix(choix);
            }

            if (joueurs.get(0).getChoix().equals(joueurs.get(1).getChoix())) {
                System.out.println("C'est une égalité !");
            } else if (rules.get(joueurs.get(0).getChoix()).equals(joueurs.get(1).getChoix())) {
                System.out.println(joueurs.get(0).getNom() + " gagne la partie !");
            } else {
                System.out.println(joueurs.get(1).getNom() + " gagne la partie !");
            }

            System.out.print("Voulez-vous jouer à nouveau ? (o/n) : ");
            String reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase("n")) {
                continuer = false;
            }
        }
    }
}
