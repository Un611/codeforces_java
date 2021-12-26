import java.util.Scanner;
public class PetyaAndStrings_112A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String b = input.nextLine();
		a = a.toLowerCase();
		b = b.toLowerCase();
		int result=0;
		for(int i = 0;i<a.length();i++) {
			if((int)a.charAt(i) > (int)b.charAt(i)) {
				result = 1;
				break;
			}else if ((int)a.charAt(i) == (int)b.charAt(i)) {
				result = 0;
			}else {
				result = -1;
				break;
			}
		}
		System.out.print(result);
		input.close();

	}

}
