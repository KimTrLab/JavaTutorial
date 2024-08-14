package _04For_4_RandomScanner;

public class _02_07_Q {
/*
 * 7. int jobTime ={40,32,4,16,5,8};
위 배열에서 인덱스를 사람의 번호로 가정한다.
jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.
작업장을 사용할 수 있는 시간은 최대  4시간이다.
작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고
다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
작업 시간이 1시간이던 4시간이떤 똑같이 4시간이 소용된 것으로 계산..
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jobTime ={40,32,4,16,5,8};
		int jobUseNum = 0;  //작업실을 사용하는 사람의 번호
		int jobUseTotalCount = jobTime.length; // 작업실을 사용하는 사람의 전체 인원수
		int useTime=4;  // 작업실 사용 시간
		int finishJobCount=0; //작업을 완료한 사람의 인원수
		for(;;) {
			if(jobTime[jobUseNum] > 0) {   // 남은 작업이 있다면 작업실을 사용하시오
				System.out.print(jobUseNum+"사용중 / ");
				jobTime[jobUseNum] -= useTime;  // 4시간 차감
				System.out.println(jobTime[jobUseNum]+" 남았습니다.");
				if(jobTime[jobUseNum] <= 0 ){  //작업이 완료 되었는지 확인
					System.out.println("*" + jobUseNum +"이용을 완료하였습니다.");
					finishJobCount++;
				}
				if(finishJobCount == jobUseTotalCount ) {   // 모든 사람이 작업을 완료하였는지?
					break;
				}			
			}
			// 다음 사람 지정  시작 -->
			jobUseNum ++;
			jobUseNum = jobUseNum%jobUseTotalCount;
			//  <-- 다음 사람 지정 끝
			System.out.println(jobUseNum +" 차례입니다.");
		}
	}

}
