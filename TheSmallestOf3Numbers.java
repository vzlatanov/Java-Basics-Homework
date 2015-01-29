import java.text.DecimalFormat;
import java.util.Scanner;


public class TheSmallestOf3Numbers {

	public static void main(String[] args) {
		DecimalFormat format=new DecimalFormat();
		
		double smallestNum=Double.MAX_VALUE;
		double firstValue=0;
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			firstValue=scan.nextDouble();
			if(firstValue<smallestNum){
				smallestNum=firstValue;
			}
			
		}
		System.out.println(format.format(smallestNum));
	}

}
