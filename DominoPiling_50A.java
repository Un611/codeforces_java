import java.util.Scanner;
public class DominoPiling_50A {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int m,n;
		m = input.nextInt();
		n = input.nextInt();
		System.out.print(m*n/2);
		input.close();
	}
}
