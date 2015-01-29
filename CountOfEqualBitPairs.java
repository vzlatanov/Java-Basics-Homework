import java.util.Scanner;


public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(bitsPairs(n));
		}
		public static int bitsPairs(int n) {
		int result = 0;
		int past = n & 1;
		int i;
		n >>= 1;
		while (n > 0) {
		i = n & 1;
		if (i == past) {
		result++;
		}
		past = i;
		n >>= 1;
		}
		return result;
		}
		

	}


