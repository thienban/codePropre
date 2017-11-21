package ex3;

import java.util.List;

public class SavaneAfricaine extends Zone {

	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public int calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}
