import java.util.Scanner;
public class Bit_282A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lineNum = input.nextInt();
		input.nextLine();
		int x = 0;
		for(int i = 0; i<lineNum; i++) {
			String temp = input.nextLine();
			switch(temp.charAt(1)) {
			case '+':x++;break;
			case '-':x--;break;
			}
		}
		System.out.print(x);
		input.close();
	}
}
