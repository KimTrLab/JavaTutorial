package _03For_2;

public class _13_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int cnt = 0;
		int bT = arr[0];
		int maxCnt = 0;
		int maxNumber=0;
		for (int i = 0; i < arr.length; i++) {
			if (bT == arr[i]) {
				cnt++;
			} else {
				bT = arr[i];
				cnt = 1;
			}
			if (maxCnt < cnt) { 
				maxCnt = cnt;
				maxNumber = bT;
			}
		}
		System.out.println(maxCnt + "/" + maxNumber); //

	}

}
