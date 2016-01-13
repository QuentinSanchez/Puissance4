import java.util.*;

/**
 *
 * @author Marvin Marchand
 */
public class Jeu {

    private boolean chkVict = false;
    private int ligne;
    private int colonne;
    private TerrainJeu terrain;
    private int nbTour = 0;
    private int indCol;
//   private Jeton jeton1;
//   private Jeton jeton2;

    public Jeu() throws Exception {
        System.out.println("Entrez un nombre de lignes pour le terrain de jeu :");
        Scanner sc = new Scanner(System.in);
        ligne = sc.nextInt();
        System.out.println("Entrez un nombre de colonnes pour le terrain de jeu :");
        colonne = sc.nextInt();
        terrain = new TerrainJeu(ligne, colonne);
//        System.out.println("Entrez un caractère pour le J1 :");
//        Scanner sc = new Scanner(System.in);
//        jeton1 = new Jeton
//        System.out.println("Entrez un caractère pour le J2 :");
//        Scanner sc = new Scanner(System.in);
    }

    public void déroulementJeu(Jeu jeu){
        boolean victoire = false;

        while(victoire != true){
            if(nbTour%2 == 0){
                System.out.println("Au joueur 1 de placer son pion");
                Scanner sc = new Scanner(System.in);
                indCol = sc.nextInt();
                placerJeton(jeton1, indCol);
                jeu.terrain.afficher();
                victoire = chkVictoire(jeton1, indCol);
            }else{
                System.out.println("Au joueur 2 de placer son pion");
                Scanner sc = new Scanner(System.in);
                indCol = sc.nextInt();
                placerJeton(jeton2, indCol);
                jeu.terrain.afficher();
                victoire = chkVictoire(jeton2, indCol);
            }
            nbTour++;
        }

        if((nbTour-1) %2 == 0){
            System.out.println("Fin du jeu : le joueur 1 a gagné!");
        }else{
            System.out.println("Fin du jeu : le joueur 2 a gagné!");
        }
    }

    public boolean chkVictoire(Jeton j, int col){

        return chkVict;
    }
}
