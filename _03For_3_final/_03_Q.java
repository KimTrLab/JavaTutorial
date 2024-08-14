package _03For_3_final;

public class _03_Q {
/**
 * 3 비밀편지
String word ="gehoudfkimjnlvy";
int[] letter={8,12,3,13,1,14,3,4};
letter  배열은 word문자열 알파벳의 위치이다.
letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="gehoudfkimjnlvy";
		int[] letter={8,12,3,13,1,14,3,4};
		String reWord="";
		for(int i=0; i < letter.length; i++) {
			int letterValue = letter[i];
			reWord += word.charAt(letterValue);
		}
		System.out.println(reWord);

	}

}
