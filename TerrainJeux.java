package puissance4;

/**
 *
 * @author Pierre
 */
public class TerrainDeJeu {
 	private int colonne;
 	private int ligne;
 	private String terrain[][];
 	private int cptcol;
 	private int cptligne;
 
 	TerrainDeJeu(){
 		this.colonne=7;
 		this.ligne=6;
 		CreationTerrain();
 	}
 
 	TerrainDeJeu(int col, int ligne){
 		this.colonne=col;
 		this.ligne=ligne;
 		CreationTerrain();
 	}
 
 	public void CreationTerrain(){
            cptcol=0;
            cptligne=0;
            terrain=new String[this.ligne][this.colonne];
            while(cptcol<this.colonne){
                while(cptligne<this.ligne){
                    terrain[cptligne][cptcol]=" - ";
                    cptligne++;
                }
                cptligne=0;
                cptcol++;
            }
            cptcol=0;
 	}
 
 	public void AfficherTerrain(){
            cptligne=0;
            cptcol=0;
 		while(cptcol<this.colonne){
 			while(cptligne<this.ligne){
 				System.out.print(terrain[cptligne][cptcol]);
 				cptligne++;
 			}
                        System.out.println();
 			cptligne=0;
 			cptcol++;
 		}
 		cptcol=0;
 	}
  }
