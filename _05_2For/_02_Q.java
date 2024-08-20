package _05_2For;

public class _02_Q {
/**
      *****
      ****
      ***
      **
      *
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i를 줄로 보고, j를 열로 보겠음
		//i는 0부터 시작, j의 시작은 0이나 끝은 서로 다름
		//위 별을 숫자로 표현
		/*   j=01234
		 *   j=0123
		 *   j=012
		 *   j=01
		 *   j=0
		 */
		
		for(int i=0; i < 5; i++) {
			for(int j=0; j < (5-i) ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
