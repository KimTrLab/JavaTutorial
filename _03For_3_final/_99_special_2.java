package _03For_3_final;

public class _99_special_2 {
/*
 * 
 * 특별2
 String a ="67/414/1/23/32/45/54/12/11/232"
문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
해충의 갯수를 모두 합하시오.
charAt() 메서드만 사용이 가능하다. 
형변환이 필요하면 검색하여 사용하시오.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="67/414/1/23/32/45/54/12/11/232";  
		int sum=0;
		String tempInt="";
		a=a+"/";
		
		for(int i=0; i< a.length(); i++) {
			char temp = a.charAt(i);
			if(temp != '/') {
				tempInt += temp;
			}else {
				int addInt = Integer.valueOf(tempInt);  
				System.out.println(addInt);
				sum += addInt;
				tempInt="";
			}
		}
		
		System.out.println(sum);

	}

}
