package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	protected List<Animal> animaux = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal nom: animaux ){
			System.out.println(nom);
		}
	}
}
