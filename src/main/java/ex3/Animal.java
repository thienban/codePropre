package ex3;

import java.util.ArrayList;
import java.util.List;

public class Animal {
		// Stocke id
		private String nom;
		// Stocke code
		private String type;
		// Stocke nom
		private String comportement;
		
		public Animal(String nom, String type, String comportement) {	 
			this.setNom(nom);
			this.setType(type);
			this.setComportement(comportement);
	}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getComportement() {
			return comportement;
		}

		public void setComportement(String comportement) {
			this.comportement = comportement;
		}
		
	
}
