package _04For_4_RandomScanner;

import java.util.Random;

public class __02_10_Q {
	
	public static void main(String[] args) {
		String[] word ={"apple","banana","car","dog","cat","computer"};
		Random r = new Random();
		boolean[] wordchk = new boolean[word.length];
		for(int i=0; i < word.length; i++) {
			int idx = r.nextInt(word.length);
			if(wordchk[idx]==false) {
				System.out.println(word[idx]);
				wordchk[idx]=true;				
			}else {
				i--;
			}
		}
	}
}
