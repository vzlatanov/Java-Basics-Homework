import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int oneSide=scan.nextInt();
		int twoSide=scan.nextInt();
		int areaRect=oneSide*twoSide;
		System.out.printf("The area is=%d",areaRect);
	}

}
