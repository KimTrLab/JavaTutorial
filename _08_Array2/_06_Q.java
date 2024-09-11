package _08_Array2;

public class _06_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		int row = a.length - 1;
		int col = a[0].length - 1;

		// 출력 기능
		for (int i = row; i >= 0; i--) {
			for (int j = col; j >= 0; j--) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
