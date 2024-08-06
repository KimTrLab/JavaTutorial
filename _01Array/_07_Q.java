package _01Array;

public class _07_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=2750;
		int pay=10000;		
		int jan = (pay-money)/10;
		System.out.println(jan);
		
		//금액별로 자르기
		System.out.println("십원짜리" + jan%10);
		jan = jan/10;
		System.out.println("백원짜리" + jan%10);
		jan = jan/10;
		System.out.println("천원짜리" + jan%10);
		jan = jan/10;

	}

}
