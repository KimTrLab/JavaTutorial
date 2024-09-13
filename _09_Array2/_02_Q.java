package _09_Array2;
import java.util.Arrays;
public class _02_Q {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		
		// 2차원 배열의 값을 저장하는 코드
		for( int i=3; i>=0; i--){	
			//System.out.println("행 > "+행);
			for(int j=4; j>=0; j--){		
				//System.out.println(행+"/"+열);
				a[i][j]=num;
				num++;
			}		
		}			

		
		// 2차원 배열 a의 값을 0번행부터 모두 출력
		for(int i=0; i<4; i++) {
			//System.out.println(">행"+행);
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j]+" ");
			}	
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
