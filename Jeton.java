
package puissance4;

import puissance4.TerrainDeJeu;

public class Jeton{
    private static int colonne;
    private static int ligne;
    private String motif;
    private TerrainDeJeu terrain;
    
    public Jeton(){
        
    }

    //création du jeton avec comme paramètre la couleur (à compléter)
    public Jeton(String motif){ 
        this.motif=motif;
       }
    
    //méthode qui permet d'insérer le jeton dans la GRILLE (TerrainDeJeu) à la ligne-colonne en paramètre
    public static void insererJeton(TerrainDeJeu terrain, int colonne, int ligne){
        Jeton.colonne=colonne;
        Jeton.ligne=ligne;
        terrain = new TerrainDeJeu(colonne,ligne);
        
    }
    
    



    
}
