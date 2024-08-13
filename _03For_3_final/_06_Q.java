package _03For_3_final;

public class _06_Q {
/**
 * 
 * 
 * String a ="23-56+45*2-56";
수식을 계산하는 프로그램을 작성하세요.
수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
메서드는 최대한 적게 사용하세요
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *  우선, 문제가 참 지저분하군요 
		 *  그래도 풀어 봅시다.
		 *  
		 *  문자열의 패턴을 보겠습니다.
		 *  정수가 있고 연산자가 있고
		 *  정수는 한 자리, 두자리가 있고 공통된 패턴이 없네요, 골치 아프네요.
		 *  
		 *  일단 문자열을 0번 부터 순회 해야겠어요.
		 *  0번 부터 순회하다가 연산자(-+*)를 만나면 연산을 해야겠습니다.
		 *  
		 *  이걸 어떻게 해결해야 하나??
		 *  우선 연산자를 저장할 변수를 하나 만들겠습니다.
		 *  연산자는 기본 값으로 + 가 적당하겠네요.
		 *  문자열의 시작이 숫자라면 +를 의미하니 기본값을 +로 만들겠습니다.
		 *  만약 문자열의 시작이 -라면  연산자를 저장하는 변수는 -로 변경되도록
		 *  코드를 작성하면 되겠네요.
		 *  
		 *  char sign='+';
		 *  int result=0;
		 *  
		 *  if(sign == '+'){
		 *  	result += 정수;
		 *  }else if(sign == '-'){
		 *  	result -= 정수;
		 *  }else if(sign == '*'){
		 *  	result *= 정수;
		 *  }
		 *  
		 *  이렇게 손코딩을 해 보니.. 이제 정수를 어떻게 가져올 것인가가 고민이군요...
		 *  그런데 우리가 사용해 본 메서드는 charAt()만 있네요.
		 *  charAt()이 아닌 다른 메서드를 사용하면 좀 더 편하지만 
		 *  우린 charAt() 으로만 풀어 보겠습니다.
		 *  
		 *  시나리오를 작성해 볼까요?
		 *  정수 23을 가져온 다음에는 연산자 -를 가져오게 되니 연산자를 가져올 때는 위에서 작성한
		 *  계산을 하면 되겠네요.
		 *  charAt() 으로 가져온 값이 정수라면 다음 문자를 가져오고, 가져온 값이
		 *  연산자라면 연산을 하면되겠네요. 이것을 손코딩으로 작성해 볼께요
		 *  
		 *  String a ="23-56+45*2-56";
		 *  char sign='+';
		 *  int result=0;
		 *  
		 *  for(int i=0; i < a.length(); i++){
		 *  	char temp = a.charAt(i);
		 *  	if(temp == '+' || temp == '-' ||temp == '*'){
		 *  		if(sign == '+'){
		 *  			result += 정수;
		 *  		}else if(sign == '-'){
		 *  			result -= 정수;
		 *  		}else if(sign == '*'){
		 *  			result *= 정수;
		 *  		}
		 *  		sign=temp;
		 *  	}else{
		 *  
		 *  	}
		 *  }
		 *  이렇게 작성하면  for문이 문자열을 순회하면서 문자를 하나씩 가져와서 temp변수에 저장
		 *  temp변수의 값이 + 이거나 - 이거나 * 인 경우는 현재저장된(sign)변수에 의해서 계산을 하고
		 *  sign변수를 방금 가져온 변수로 갱신을 하면 다음에 정수가 있을 때 연산이 가능하겠네요.
		 *  
		 *  이젠 정수만 남았네요.. 
		 *  만약 2를 가져왔어요.. 그 다음에 3을 가져왔어요. 
		 *  문자2와 문자3을 따로 가져왔어요. 그런데 둘은 합쳐야 합니다.
		 *  문자와 문자를 합치면 문자열이 되겠네요?
		 *  
		 *  다음시간에 계속 -----
		 *  하려다가 귀찮아서 바로 코드를 작성했어요
		 *
		 *  
		 *  
		 *  
		 * 
		 */
		
		String a ="23-56+45*2-56";
		char sign='+';
		int result=0;
		String tempInt="";
		a=a+"+";   // for문이 반복되는 동안 if문에서 계산을 해야 하는데
		           // i가 배열의 마지막 인덱스 일 경우는 if문에 true가 되지 않는다.
		           // 그래서 원본에 +를 마지막에 추가하여 해결 함.
		for(int i=0; i < a.length(); i++){
		   	char temp = a.charAt(i);
		   	if(temp == '+' || temp == '-' ||temp == '*'){
		   		int tempInteger = Integer.valueOf(tempInt);
		   		System.out.println(tempInteger);
		   		if(sign == '+'){
		   			result += tempInteger;
		   		}else if(sign == '-'){
		   			result -= tempInteger;
		   		}else if(sign == '*'){
		   			result *= tempInteger;
		   		}
		   		sign=temp;
		   		tempInt="";
		   	}else{
		   		tempInt += temp;
		   	}
		}
		System.out.println(result);
	}

}
