import java.util.Scanner;
public class Team_231A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		input.nextLine();
		int sureQuestions=0;
		sureQuestions=0;
		for(int i = 0; i < line; i++) {
			String[] temp = new String[3];
			String tempInput = input.nextLine();
			temp = tempInput.split(" ");
			int sure = 0;
			for(String num : temp) {
				sure+=Integer.valueOf(num);
			}
			if(sure>=2)
				sureQuestions++;
		}	
		System.out.print(sureQuestions);
		input.close();	
	}
}