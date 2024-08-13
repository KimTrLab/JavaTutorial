package _03For_3_final;

public class _04_Q {
/*
 * 4 난건물주
int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
int size=2;
arr 배열에서 0이 의미하는 것은 공터이다. 
size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
size가 2일경우에 7개이다. 
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//분석.. 건물을 지을 수 있는 배열의 인덱스는 1,2/ 2,3 /7,8/ 8,9/ 9,10
		// 이렇게 패턴이 이어 지는 군
		// 배열의 현재 i의 인덱스의 값과 하나 증가한 i의 인덱스의 값이 모두 0이라면 가능하군
		// 먼저 배열을 순회하자..
		// 배열을 순회할때는 마지막 배열의 값은 순회할 필요가 없다. 위의 규칙에  따르면 그렇다.

		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		int cnt=0;
		for(int i=0; i < arr.length-1; i++) {
			if(arr[i]==0 && arr[i+1]==0) {
				cnt++;
				System.out.println(i+"/"+(i+1)+ " 위치를 추가합니다. "+cnt);
			}
		}
		System.out.println(cnt);
		
		// 만약 size변수의 값이 3이라면 위 코드의 결과는 오답이다.
		// size변수의 값이 바뀌더라도 올바른 결과를 나타내도록 코드를 수정해 봅시다.
		int[] arr1 = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0};
		int size1=3;  // 건물의 크기
		int cnt1=0;  // 공터 확인 변수
		int totalcnt=0;   // 지을 수 있는 건물 수
		for(int i=0; i < arr.length; i++) {
			if(arr1[i]==0) {  // 현재 땅이 공터라면 동터 확인 변수를 하나 증가
				cnt1++;
			}else {
				cnt1=0; // 현재 땅이 공터가 아니라면 건물을 지을 수 없으므로 0
			}
			if(cnt1 >= size1) {
				System.out.println((i-size1+1)+"부터 사이즈 "+size1+"가능");
				totalcnt++;
			}
			
		}
		System.out.println(totalcnt);

	}

}
