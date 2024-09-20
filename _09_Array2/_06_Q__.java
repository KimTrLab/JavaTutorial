package _09_Array2;

public class _06_Q__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
			
			// 필요한 변수를 먼저 선언
			int rmin = 0;
			int rmax = a.length - 1;
			int cmin = 0;
			int cmax = a[0].length - 1; // 초기 꼭짓점 4개 선언
			int emp = 0; // 재배치시 값 저장할 변수 선언
			
			//첫번째 사각형을 돌릴 때는 a(0,0)와  emp변수를 사용하여 각 자릿수와 교환한다.
			//두번째 사작형을 돌릴 때는 a(1,1)와  emp변수를 사용하여 각 자릿수와 교환한다.
			//자릿수를 교환할때는 달팽이 배열의 순회와 같은 방법으로 한다. 
			
			for(int i=0; i < 2; i++) {
				for(int j = cmin; j < cmax ; j++) {
					emp = a[rmin][j+1];
					a[rmin][j+1]=a[i][i];
					a[i][i]=emp;
				}
				rmin++;
				for(int j=rmin; j<=rmax; j++) {
					emp = a[j][cmax];
					a[j][cmax]=a[i][i];
					a[i][i]=emp;
					
				}
				cmax--;
				for(int j=cmax; j >= cmin; j--) {
					emp = a[rmax][j];
					a[rmax][j]=a[i][i];
					a[i][i]=emp;
					
				}
				rmax--;
				for(int j=rmax; j>= rmin; j--) {
					emp = a[j][cmin];
					a[j][cmin]=a[i][i];
					a[i][i]=emp;
					
				}
				cmin++;
			}		
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
	}

}
