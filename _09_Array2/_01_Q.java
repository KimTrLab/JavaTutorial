package _09_Array2;
import java.util.Arrays;
public class _01_Q {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		
		// 2차원 배열의 값을 저장하는 코드
		for(int 열=4; 열>=0; 열--) {
			//System.out.println("현재 열은 "+열);
			for(int 행=0; 행<4; 행++) {
				//System.out.println(행+"/"+열);
				a[행][열]=num;
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
