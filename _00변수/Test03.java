package _00변수;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java에서 문자를 저장할때는 2진수로 저장한다.
		// 문자를 아스키 코드표에 따라 매칭되는 10진수를
		// 2진수로 변환하여 저장한다.
		int a = 97;
		int b = 66;
		System.out.println(a);
		System.out.println(b);
		System.out.println((char) a);
		System.out.println((char) b);
		a++;
		System.out.println(a);
		System.out.println((char) a);
		char c = 'a';
		System.out.println(c);
		System.out.println((int) c);
		c++;
		System.out.println(c);
		System.out.println((int) c);

	}

}
