package _03For_3_final;

public class _07and08_Q {
/**
 * 
 * [7번 , 8번 문제 배열 제시]
int[] a = {34,2,35,8,31,45}
최대값을 구하는 문제에서
철수는 변수를 사용하지 않고 배열만 이용하여 푸는 방법을 생각하였다. 

7
철수는 배열의 0번 인덱스부터 순회한다.
0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
위와 같은 방식으로 가장큰 수를 구하시오.


8
철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
가장 큰 값이 나오면 가장 큰 값을 갱신한다.
위와 같은 방식으로 가장 큰 수를 구하시오.
 * 
 * @param args
 */
	public static void main(String[] args) {
		//7번
		int[] a = {34,2,100,8,31,45};
		for(int i=0; i<a.length-1; i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		System.out.println(a[a.length-1]);

		
		//8번
		int[] aa = {34,2,100,8,31,45};
		for(int i=0 ; i < aa.length; i++) {
			if(a[i]>a[0]) {
				int temp=a[0];
				a[0]=a[i];
				a[i]=temp;
			}
		}
		System.out.println(a[0]);
	}

}
