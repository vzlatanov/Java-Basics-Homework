import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int a = input.nextInt();
		 double b = input.nextDouble();
		 double c = input.nextDouble();
		 System.out.print('|');
		 System.out.print(String.format("%1$-10s", Integer.toHexString(a).toUpperCase()));
		 System.out.print('|');
		 System.out.print(String.format("%010d", Integer.parseInt(Integer.toBinaryString(a))));
		 System.out.print('|');
		 
		 System.out.print(String.format("%1$10s", String.format("%.2f", b)));
		 System.out.print('|');
		 System.out.print(String.format("%1$-10s", String.format("%.3f", c)));
		 System.out.print('|');
		 System.out.println();

	}

}
