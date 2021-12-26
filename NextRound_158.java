import java.util.Scanner;
public class NextRound_158 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int playerNum = input.nextInt();
		int k = input.nextInt();
		int totalNum;
		input.nextLine();
		String[] scoreArr = new String[playerNum];
		String temp = input.nextLine();
		scoreArr = temp.split(" ");
		totalNum = k;
		if(Integer.valueOf(scoreArr[k-1])==0) {
			for(int i = 0;i<k;i++) {
				if(Integer.valueOf(scoreArr[i]) == 0) {
					totalNum--;
				}
			}	
		}else {
			for(int i = k;i<scoreArr.length;i++) {
				if(Integer.valueOf(scoreArr[i]) ==Integer.valueOf(scoreArr[k-1])) {
					totalNum++;
				}
			}
		}
		System.out.print(totalNum);
		input.close();
	}
}
