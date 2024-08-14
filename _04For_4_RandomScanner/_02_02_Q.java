package _04For_4_RandomScanner;

import java.util.Random;

public class _02_02_Q {
/**
 * 행운의 숫자 인지를 판별해 보자
   1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
   이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random();
		int luckNumber = r.nextInt(100)+1;
		System.out.println(luckNumber+"를 뽑았습니다.");
		if(luckNumber%7==0) {
			System.out.println("행운의 숫자입니다.");
		}else {
			System.out.println("조심해야 할 숫자입니다.");
		}
	}

}
