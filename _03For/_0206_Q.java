package _03For;

public class _0206_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		 */
		
		//방법1  - for문 종료하게 하기
		int sum=0;
		for(int i=0 ; i <= 100; i++) {
			System.out.println(i);  //i 확인용.. 어디까지 반복되는지 확인
			sum += i;
			if(sum > 44) {
				System.out.println("범인 : "+i);
				i=101;
			}

		}
		
		//방법2   - flag 변수로 찾아내기  		
		int sum1=0;
		boolean flag=false;
		for(int i=0 ; i <= 100; i++) {
			System.out.println(i);  //i 확인용.. 어디까지 반복되는지 확인
			sum1 += i;
			if(!flag) {
				if(sum1 > 44) {
					System.out.println("범인 : "+i);
					flag=true;
				}
			}

		}
	}

}
