import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(countBits(n));
	}
		
		public static int countBits(int n) {
			int result = 0;
			while (n > 0) {
			if ((n & 1) == 1) {
			result++;
			}
			n >>= 1;

	}
			return result;

   }
}
