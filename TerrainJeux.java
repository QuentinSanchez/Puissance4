import java.io.*;
import java.lang.*;
import java.util.*;

public class TerrainDeJeu{
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
		String terrain[][]=new String[this.ligne][this.colonne];
		while(cptcol<this.colonne){
			while(cptligne<this.ligne){
				terrain[cptligne][cptcol]="-";
				cptligne++;
			}
			cptligne=0;
			cptcol++;
		}
		cptcol=0;
	}

	public void AfficherTerrain(){
		while(cptcol<this.colonne){
			while(cptligne<this.ligne){
				System.out.println(terrain[1][1]);
				cptligne++;
			}
			cptligne=0;
			cptcol++;
		}
		cptcol=0;
	}
}

