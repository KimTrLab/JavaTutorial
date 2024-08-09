package _03For;

public class _0204_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
    453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.
		 * 
		 */
		int sum=0;
		int temp=0;
		for(int i=100; i< 1000; i++) {
			temp = i;
			sum += temp%10;
			temp /= 10;
			sum += temp%10;
			temp /= 10;
			sum += temp;			
		}
		System.out.println(sum);

	}

}
