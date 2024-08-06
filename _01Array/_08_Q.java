package _01Array;

public class _08_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xA=700;
		int yA=500;
		int xB=900;
		int yB=300;
		
		int xC=896;
		int yC=300;
		//x축 판별
		System.out.println((xA < xC)&&(xB> xC+3));
		//y축 판별
		System.out.println((yA > yC)&&(yB< yC-3));		
		
		//전체 판별
		System.out.println(((xA < xC)&&(xB> xC+3))&&((yA > yC)&&(yB< yC-3)));
	}

}
