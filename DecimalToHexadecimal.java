import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		String hexNumber=Integer.toHexString(number);
		String result=hexNumber.toUpperCase();
		System.out.println(result);

	}

}
