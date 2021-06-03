package src;
import main.Case;
import main.Piece;

public class Fou extends Pieces implements Piece {
	
	public Fou(Case casePiece, String couleur)
	{
		super(casePiece, couleur);
	}
	@Override
	public Case getCase() {

		return super.getCase();
	}

	@Override
	public String getCouleur() {

		return super.getCouleur();
	}

	@Override
	public void setCase(Case newCase) {
		super.setCase(newCase);
		
	}

	@Override
	public void setCouleur(String newCouleur) {
		super.setCouleur(newCouleur);
	}

	@Override
	public Case[] deplacementTab(Case cd, Case ca) {
		// TODO Auto-generated method stub
		if (ca.equals(cd)) return null;
		/* Diagonale Haute Droite*/
		Case[] dhd = new Case[Math.abs(cd.getLigne()-8)];
		for(int i=1;i<Math.abs(cd.getLigne()-8);i++) {
			if(cd.caseVide()==true) {
				dhd[i] = new Case(i+cd.getLigne(),i+cd.getColonne(),null);
			}
			else {
				break;
			}
		}
		
		/* Diagonale Haut Gauche */
		Case[] dhg = new Case[Math.abs(cd.getColonne()-8)];
		for(int i=1;i<Math.abs(cd.getLigne()-8)+1;i++) {
			if(cd.caseVide()==true) {
				dhg[i] = new Case(cd.getLigne()-i,cd.getColonne()+i,null);
			}
			else {
				break;
			}
		}
		/* Diagonale Bas Droite */
		Case[] dbd = new Case[Math.abs(cd.getLigne()-8)];
		/* Diagonale Bas Gauche */
		Case[] dbg = new Case[Math.abs(cd.getColonne()-8)];
		
		
		Case[] c = new Case[dhd.length+dhg.length+dbd.length+dbg.length];
		return c;
	}
	
	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♝";
		}
		else {
			return "♗";
		}
	}
}
