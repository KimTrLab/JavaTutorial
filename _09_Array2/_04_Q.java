package _09_Array2;
import java.util.Arrays;
public class _04_Q {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;		
		for(int i=0; i < 8; i++) {
			System.out.println(i +"번째 채우기를 합니다.");
			int newCol=i;
			for(int j=0;j<=i;j++) {
				//if(newCol > 4) continue;
				//if(j>3) continue;  //if절에서한줄이면괄호x
				if(j>3) break;
				if(newCol < 5) {
					//System.out.println("j<행>"+j+"/열"+newCol);
					a[j][newCol]=num++;
				}
				newCol--;
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
