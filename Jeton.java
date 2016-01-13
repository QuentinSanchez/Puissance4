
package jeton;

public class Jeton{
    private int colonne;
    private int ligne;
    private String motif;
    private TerrainDeJeu terrain;
    
    public Jeton(){
        
    }

    //création du jeton avec comme paramètre la couleur (à compléter)
    public Jeton(String motif){ 
        this.motif=motif;
       }
    
    //méthode qui permet d'insérer le jeton dans la GRILLE (TerrainDeJeu) à la ligne-colonne en paramètre
    public void insererJeton(TerrainDeJeu terrain, int colonne, int ligne){
        this.colonne=colonne;
        this.ligne=ligne;
        terrain = new TerrainDeJeu(colonne,ligne);
        
    }
    
    



    
}
