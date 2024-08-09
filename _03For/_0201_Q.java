package _03For;

public class _0201_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
 */
		int resultValue=0;
		
		for(int i = 0; i <= 100; i++) {
			if(i%2==0) {
				resultValue -= i;
			}else {
				resultValue += i;
			}
		}
		System.out.println("결과값 : "+resultValue);

	}

}
