package ex3;

import java.util.List;

public abstract class Zone {

	protected List<Animal> animaux;
	
	public abstract boolean addAnimal();
	
	public void afficherListeAnimaux(){
		for (Animal nom: animaux ){
			System.out.println(nom);
		}
	}
}
