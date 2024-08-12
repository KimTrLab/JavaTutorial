package _03For_2;

public class _11_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 11. 범인 숫자 구하기.. 
  범인은 100부터 999까지 숫자중에 여러명이다. 
  범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
		 */
		for(int i=100; i < 1000; i++) {
			//System.out.println(i);
			int temp = i/100 + (i%100)/10 + ((i%100)%10);
			if(temp%2==0) {
				System.out.println(i);
			}
		}

	}

}
