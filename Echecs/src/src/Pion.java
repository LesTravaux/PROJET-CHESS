package src;
import main.Case;
import main.Piece;

public class Pion extends Pieces implements Piece {
	
	

	@Override
	public Case getCase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCouleur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCase(Case newCase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCouleur(String newCouleur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifDeplacement(Case cd, Case ca) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♟";
		}
		else {
			return "♙";
		}
	}

}