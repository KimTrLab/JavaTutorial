package _03For_2;

public class _09_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * 9. String test = "abcdeabce"; for(int i=0; i < 9; i ++){ char aaa =
		 * test.charAt(i); sysout(aaa); }
		 * 
		 * 위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		 */
		String test = "abcdeabce";
		int cnt=0;
		for (int i = 0; i < 9; i++) {
			char aaa = test.charAt(i);
			if(aaa == 'a') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
