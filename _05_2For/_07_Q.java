package _05_2For;

public class _07_Q {
/**
 * 
 * 7. 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
   단, 거스름돈은 만천원이 최대 값이다. 
int money=4570;  // 가격
int pay = 10000;  //지불금액
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=4570;  // 가격
		int pay = 10000;  //지불금액
		int jan = pay-money;
		System.out.println(jan);
		int baseMoney = 10;
		for(;;) {
			jan/=10;
			if(jan <= 0) {
				break;
			}
			System.out.println(baseMoney +":"+ (jan%10)+"개");
			baseMoney *= 10;
		}

	}

}
