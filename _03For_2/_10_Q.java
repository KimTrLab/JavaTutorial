package _03For_2;

public class _10_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * 10.  int[] arr = {45,23,25,64,3,24,48} 
   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
 */
		int[] arr = {45,23,25,64,3,24,48};
		int maxValue=0;
		int maxIndex=0;
		for(int i=0; i < arr.length; i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
				maxIndex = i;
			}
		}
		System.out.println(maxIndex +"/"+maxValue);
	}

}
