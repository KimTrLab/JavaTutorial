package _05_2For;

public class _12_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempi=0;
		for (int i = 0; i < 7; i++) {
			tempi = 3-i;
			if(tempi < 0) {
				tempi *= -1;
			}
			//System.out.println(tempi);
			for (int j = 0; j < 4 + (3-tempi); j++) {
				if (j >= 4 - (3-tempi) -1) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
