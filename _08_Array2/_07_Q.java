package _08_Array2;

public class _07_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pang= {
				{1,1,0,2},
				{3,2,2,2},
				{0,3,3,2},
				{4,4,4,4},
				{2,4,3,1},
				{2,4,1,3}};		
		int maxRow=pang.length;   // 배열의 행의 길이
		int maxCol=pang[0].length;  // 배열의 열의 길이
		                            // 이렇게 하면 배열을 한 번만 참조하여 변수에 저장함
		                            // 변수를 재사용하여 배열의 참조 연산을 줄일 수 있음 > 속도향상
		
		// 행의 인덱스가 가장 큰 부분부터, 열의 인덱스가 작은 순서대로 탐색
		// 가로로 체크 하기 때문에 열의 인덱스는 0 부터 열의 길이-3까지만 탐색
		//  예제는 열의 길이가 4이므로 0부터 4-3만큼 탐색, 행은 전체 탐색
		/*
		for(int 행= maxRow-1; 행 >= 0 ; 행--) {
			for(int 열=0; 열 <= maxCol-2; 열++) {
				System.out.print(행+"/"+열+" ");
			}
			System.out.println();
		}
		*/
		//행을 i로 열을 j로 바꾼다
		/*
		for(int i= maxRow-1; i >= 0 ; i--) {
			for(int j=0; j <= maxCol-3; j++) {
				System.out.print(i+"/"+j+" ");
			}
			System.out.println();
		}*/
		// 위 코드는 배열을 순회하는 인덱스의 범위 코드이다
		
		int cnt=0;
		int nowNumber=-1;
		int numberColStart=-1;
		int numberColEnd=-1;
		
		for(int i= maxRow-1; i >= 0 ; i--) {     //  1
			for(int j=0; j <= maxCol-3; j++) {   //   2
			//	System.out.print(i+"/"+j+" ");
				cnt=1;
				nowNumber=pang[i][j];
				if(nowNumber==9)
					continue;
				
				numberColStart=j;
				for(int k=j+1; k < maxCol; k++) {   // 3
					if(nowNumber==pang[i][k]) {
						cnt++;
						numberColEnd=k;
					}else {
						break;
					}
				}
				if(cnt >= 3) {
					for(int k=numberColStart; k <= numberColEnd; k++) {
						System.out.println(">> "+i+"/"+k);
						pang[i][k]=9;
					}	
					numberColEnd=-1;					
				}
				
			}
			System.out.println();
		}
		
		// 고찰  :   위 코드는 3중 for이다 2중 for로 바꿀 수 없을까?

	}

}
