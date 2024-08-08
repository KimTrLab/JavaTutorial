package _03For;

public class _00_1_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 30, 40, 50, 55, 65 };

		// sample 1
		// 배열에 저장된 값의 평균을 구하시오, 단 50이상인 값만
		int cnt = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				cnt++;
				sum += a[i];
			}
		}
		System.out.println((double) sum / cnt);

		// sample 2
		// 배열에 저장된 값의 평균을 구하시오, 단 최저값은 제거
		int sum1=0;
		int cnt1=0;
		int minValue=99999;
		
		//최저값 찾기
		for (int i = 0; i < 5; i++) {
			if (a[i] < minValue) {
				minValue = a[i];
			}
		}
		//누적합 구하기
		for (int i = 0; i < 5; i++) {
			if (a[i] != minValue) {
				sum1 += a[i];
				cnt1++;
			}
		}
		System.out.println((double) sum1 / cnt1);
		
		//sample3 :sample2를 코드 줄이기
		//총합을 일단 구한 후. 나중에 최저값을 뺀다.
		int sum2=0;
		int cnt2=0;
		int minValue1=99999;
		
		//if문은 최저값 구하기, sum2는 모두 합하기
		for (int i = 0; i < 5; i++) {
			if (a[i] < minValue1) {
				minValue1 = a[i];
			}
			sum2+=a[i];
		}
		System.out.println((double)(sum2-minValue1)/4);
	}

}
