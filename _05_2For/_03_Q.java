package _05_2For;

public class _03_Q {
/*

000*
00***
0*****
*******


 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i를 줄,  j를 열로 보겠음 .. 숫자로 나타내 보자
		//  j = 0123
		//  j = 01234
		//  j = 012345
		//  j = 0123456
		
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4+i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//j의 값이 if로 출력문자 변경
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4+i; j++) {
				if(j >= 4-i-1) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}		
	
	}

}
