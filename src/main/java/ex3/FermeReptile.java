package ex3;

import java.util.List;

public class FermeReptile extends Zone{

	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 0.1;
	}
}
