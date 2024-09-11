package _08_Array2;

public class _02_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		// 3번째 행에서 짝수만 출력
		for(int i=0; i<5; i++) {
			if(a[2][i]%2==0) {
				System.out.print(a[2][i]+" ");
			}
		}								
	
	}
	

}
