import java.util.Scanner;


public class PointsInsideAfigure {
	
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double firstPoint=scan.nextDouble();
	double secondPoint=scan.nextDouble();
		
	if(firstPoint<12.5||firstPoint>22.5){
			System.out.println("Outside");
		
	}else if(secondPoint<6||secondPoint>13.5){
			System.out.println("Outside");
	
	}else if(firstPoint>17.5&&firstPoint<20&&secondPoint>8.5){
		System.out.println("Outside");
		
	}else{
		System.out.println("Inside");
	}
  }
}
	


