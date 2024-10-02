package _15_접근제어자_02;

import java.util.ArrayList;

public class Test {
	
	ArrayList<CatDTO> c = new ArrayList<>();
	CatDTO cc = null;
	
	public void add() {
		cc = new CatDTO();
		c.add(cc);
	}

}
