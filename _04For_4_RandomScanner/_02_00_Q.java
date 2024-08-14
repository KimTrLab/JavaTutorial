package _04For_4_RandomScanner;

import java.util.Scanner;

public class _02_00_Q {
// 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		in.nextLine();		
		if(k%2==1) {
			System.out.println("홀");
		}else {
			System.out.println("짝");
		}

	}

}
