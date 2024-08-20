package _05_2For;

public class _05_Q {
/*
 * int[] a ={34,55,23,56,34,45,34};
40보다 큰 수는 모두 몇개인가?
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={34,55,23,56,34,45,34};
		int cnt=0;
		for(int i=0; i < a.length; i++) {
			if(a[i]>=40) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
