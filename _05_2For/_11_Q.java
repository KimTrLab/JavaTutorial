package _05_2For;

public class _11_Q {
	/**
	 
11.
000*
00***
0*****
*******
0*****
00***
000*

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// j의 값이 if로 출력문자 변경
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 + i; j++) {
				if (j >= 4 - i - 1) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		for (int i = 2; i >=0; i--) {
			for (int j = 0; j < 4 + i; j++) {
				if (j >= 4 - i - 1) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
