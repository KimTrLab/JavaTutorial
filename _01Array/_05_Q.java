package _01Array;

public class _05_Q {

	public static void main(String[] args) {
		int[] lotto = {6,12,33,4,5,26};
		
		lotto[1]+=lotto[0];
		lotto[2]+=lotto[1];
		lotto[3]+=lotto[2];
		lotto[4]+=lotto[3];
		lotto[5]+=lotto[4];
		
		System.out.println(lotto[0]+" "+lotto[1]+" "+lotto[2]+" "+lotto[3]+" "+lotto[4]);

	}

}
