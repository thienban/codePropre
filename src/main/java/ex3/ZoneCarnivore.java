package ex3;

public class ZoneCarnivore extends Zone {
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}
