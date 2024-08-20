package _05_2For;

public class _01_Q {
	/**
	 * 
	 * 1*1=1  1*2=2   1*3=3
2*1=2  2*2=4   2*3=6
3*1=3  3*2=6   3*3=9
4*1=4  4*2=8   4*3=12

	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i를 단으로 보고, j를 단에 곱할 123으로 보겠음
		for(int i=1; i <5 ;i++) {
			for(int j=1; j < 4; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}

}
