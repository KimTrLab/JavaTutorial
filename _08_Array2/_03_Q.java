package _08_Array2;

public class _03_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
		// 2열의 값 출력, 2열은 고정.. 그런데 행은 유동 0부터 4까지
		for(int i=0; i < 5; i++) {
			System.out.println(a[i][2]);
		}

	}

}
