package _05_2For;

public class _06_Q {
/*
 * int[] a ={34,55,23,56,34,45,34};
int[] b ={36,49};
b배열의 값보다 큰 값이 a 배열의 값에 모두 몇개가 있는가?
각각 카운팅 하시오 
출력은
 a 배열의 값에는  36번호 보다 큰 숫자가 ?? 개 있습니다.
 a 배열의 값에는  49번호 보다 큰 숫자가 ?? 개 있습니다.
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a ={34,55,23,56,34,45,34};
		int[] b ={36,49};
		int[] bcnt=new int[b.length];
		
		//i를 b배열을 순회하는 값의 인덱스로
		//j를 a배열을 순회하는 값의 인덱스로
		//i를 하나씩 순회하면서  j를 0부터 a배열의 마지막 인덱스 까지 순회하고 다시 i 증가해서 
		
		for(int i=0; i < b.length; i++) {
			for(int j=0; j < a.length; j++) {
				if(b[i]<a[j]) {
					bcnt[i]++;
				}
			}
		}
		for(int i=0; i < bcnt.length; i++) {
			System.out.println("a배열의 값에는 "+b[i]+"번호 보다 큰 숫자가 "+bcnt[i]+"개 있습니다");
		}
	}

}
