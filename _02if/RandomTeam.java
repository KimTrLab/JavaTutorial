package _02if;

import java.util.Random;

public class RandomTeam {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String[] name = {"강한별","김성경","김시온","김태환","김희태",
				"박연정","박진우","백승헌","신태균","심지수",
				"원진호","윤율","이명균","이원재","이찬",
				"이현건","임동준","정윤오","정지용","조준곤",
				"최재환","최진석"};
		Random r = new Random();
		int[] nameChk = new int[name.length];
		for(int i=1; i<= 5; i++) {
			System.out.println("# "+ i+" 조 입니다-");
			for(int j=1; j <= 4; j++) {
				Thread.sleep(1000);
				for(;;) {
					int rr = r.nextInt(name.length);
					if(nameChk[rr] == 0) {
						nameChk[rr]=-1;
						System.out.print(name[rr]+" ");
						break;
					}
				}
			}
			System.out.println();
			Thread.sleep(1500);
		}
		System.out.println();
		System.out.println("나머지 두 명을 뽑습니다");
		Thread.sleep(1000);
		for(int i=0; i<nameChk.length; i++) {
			//System.out.println(nameChk[i]);
			if(nameChk[i]==0) {
				System.out.print(name[i]);
				System.out.print(" 조를 뽑습니다. ");
				Thread.sleep(1000);
				int nowjo = r.nextInt(5)+1;
				System.out.print( nowjo +" 에 추가 됩니다");
				System.out.println();
			}
			
		}
	
	}

}
