package _03For;

public class _0205_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 5. 범인은 100부터 999까지 숫자에 숨어 있다.
   범인은 십의 자리에 있고. 십의 자리가 3의 배수이다. 범인 숫자를 모두 출력하시오.
		 */
		int temp=0;  // 선언문은 메모리를 할당하므로 한 번만 선언하는 것이 좋다.
		for(int i=100; i< 1000; i++) {
			temp = i/10;
			temp = temp%10;
			if(temp % 3 == 0) {
				System.out.println("범인 : "+i);
			}
		}

	}

}
