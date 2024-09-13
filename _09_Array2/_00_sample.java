package _09_Array2;
import java.util.Arrays;
public class _00_sample {
	public static void main(String[] args) {
		// 아래의 코드를 보고  자바의 이론으로 정리하세요
		// 선언문(변수와 자료형) 변수명:a, 자료형은 2차원배열
		// 변수 : 값을 저장하는 기억공간
		// 2차원배열은 행과 열로 이루어진 기억공간
		// int[4][5] = 행이 4개, 열이 5개
		// 행의 인덱스 번호는 0 - 3, 열의 인덱스 번호는 0-4
		int[][] a = new int[4][5];
		int num=1;
		
		// 개인적인 김티처의 생각이지만 많은 사람이 공감한다. 
		// if, for등 작성할 때 한가지 기능만 정의하고 작성한다.
		// 한 가지 기능만 정의하고 작성하는 개발자의 센스다.
		
		// 2차원 배열의 값을 저장하는 코드
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				//i와 j값으로 배열을 순회하는 순서를 결정
				//순회하면서 num의 값을 저장한 것.
				a[i][j]=num;
				// 저장했으니 num값을 증가시킨것.
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
