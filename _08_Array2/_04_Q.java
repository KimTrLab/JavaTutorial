package _08_Array2;

public class _04_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
		// 짝수는 모두 몇개?
		
		int row = a.length;
		int col = a[0].length;
		int cnt=0;
		for(int i=0 ; i < row; i++) {
			for(int j=0; j < col; j++) {
				if(a[i][j]%2==0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
