package _03For;

public class _00_0_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 : for , while, do ~while
		// 오늘 내용 : for
		// for(선언문;조건;증감식){
		// 반복코드
		// }
		// 작동순서 : 선언문 > 조건 > 코드실행 > 증감식 > 다시 조건
		// sample 1
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		// sample 2
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// sample 3
		for (int i = 0; i < 5; i = i + 2) {
			System.out.println(i);
		}
		// sample 4
		int[] a = { 30, 40, 50, 55, 65 };
		// 배열의 모든 값 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

		// sample5
		// 배열의 모든 값 출력, 단 50보다 큰 값만 출력
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				System.out.println(a[i]);
			}
		}

		// sample6
		// 배열의 모든 값을 카운팅 출력, 단 50보다 큰 값만 카운팅
		int cnt=0;
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
