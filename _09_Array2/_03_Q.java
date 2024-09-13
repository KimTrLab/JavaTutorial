package _09_Array2;
import java.util.Arrays;
public class _03_Q {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		
		// 2차원 배열의 값을 저장하는 코드
		for(int  행=0; 행<4; 행++){		
			//System.out.println("현재 행 "+행);
			if(행%2==0){			
				for(int 열=0; 열<5;열++){	
					a[행][열]=num++;
					//위 코드는  대입연산자가 일어난 후
					//단일 연산자인 ++ 이 실행된다.
					//만약  a[행][열]=++num;
					// 이것은 단일연산자가 먼저 실행되고
					// 대입연산자가 실행된다.
					// 첫번째  case 를 후위 단일 연산자
					// 두번째 case를 전위 단일 연산자.
					//System.out.println(행+"/"+열);
				}		
			}else{			
				for(int 열=4; 열>=0;열--){	
					a[행][열]=num++;
					//System.out.println(행+"/"+열);
				}		
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
