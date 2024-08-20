package _05_2For;

public class _09_Q {
/**
 * 9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
 String ttt ="aabbbcccaaaaddbbbaaaaa";
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		char nowNumber=ttt.charAt(0);
		char maxNumber=ttt.charAt(0);
		int maxCnt=0;
		int cnt=0;
		for(int i=0; i < ttt.length(); i++) {
			nowNumber=ttt.charAt(i);
			cnt=0;
			for(int j=i; j < ttt.length(); j++) {
				if(nowNumber == ttt.charAt(j)) {
					cnt++;
				}else {
					break;
				}
			}
			if(cnt >= maxCnt) {
				maxNumber = nowNumber;
				maxCnt=cnt;
			}			
			i += cnt-1;
		}
		System.out.println(maxNumber+"/"+maxCnt);

	}

}
