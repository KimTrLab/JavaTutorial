package _03For_2;

public class _15_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] arr = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 3 };
		String ttt = new String("aabbbcccaaaaddbbbaaaaa");
		int cnt = 0;
		String resultZip = "";
		char bT = ttt.charAt(0);
		int maxCnt = 0;
		char maxNumber;
		for (int i = 0; i < ttt.length(); i++) {
			if (bT == ttt.charAt(i)) {
				cnt++;
			} else {
				resultZip = resultZip + (char) bT + cnt;
				bT = ttt.charAt(i);
				cnt = 1;
			}
		}
		resultZip = resultZip + (char) bT + cnt;
		System.out.println(resultZip);

	}

}
