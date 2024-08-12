package _03For_2;

public class _14_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] arr = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 3 };
		String ttt = new String("aabbbcccaaaaddbbbaaaaa");
		int cnt = 0;
		char bT = ttt.charAt(0);
		int maxCnt = 0;
		char maxNumber;
		for (int i = 0; i < ttt.length(); i++) {
			if (bT == ttt.charAt(i)) {
				cnt++;
			} else {
				bT = ttt.charAt(i);
				cnt = 1;
			}
			if (maxCnt < cnt) { 
				maxCnt = cnt;
				maxNumber = bT;
			}
		}
		System.out.println(maxCnt + "/" + bT); // 14번 문제 확인

	}

}
