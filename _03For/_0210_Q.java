package _03For;

public class _0210_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 987654321이라는 숫자가 있다.. 변수2개와 for문 한개로 모든 자릿수를 더한 합을 구하시오.. 9+8+7+6+5+4+3+2+1 =
		 * 합 합만 출력하면 됩니다. main메서드 안의 라인수를 최소화 하여서 작성하세요. 최소 라인수로 작성하라는 의미입니다.		 * 
		 */
		int i = 987654321;
		int sum = 0;
		for (; i > 0;) {
			sum += i % 10;
			i /= 10;
			// System.out.println(i);
		}
		System.out.println(sum);

	}

}
