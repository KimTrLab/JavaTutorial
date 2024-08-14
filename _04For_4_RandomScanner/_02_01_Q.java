package _04For_4_RandomScanner;

import java.util.Scanner;

public class _02_01_Q {
// 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력");
		int firstInt = in.nextInt();
		in.nextLine();		
		
		System.out.println("첫 번째 숫자 입력");
		int secondInt = in.nextInt();
		in.nextLine();	
		
		System.out.println(firstInt + secondInt);
	}

}
