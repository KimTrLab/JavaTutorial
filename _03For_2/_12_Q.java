package _03For_2;

public class _12_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int cnt = 0;
		int maxCnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				cnt++;
			} else {
				cnt = 1;
			}
			if (maxCnt < cnt) { 
				maxCnt = cnt;
			}
		}
		System.out.println(maxCnt); 

	}

}
