import java.util.Scanner;
public class BeautifulMatrix_263A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,centerX,centerY;
		x = y = 0;
		centerX = centerY = 3;
		for(int i = 0;i<5;i++) {
			for(int m = 0;m<5;m++) {
				int temp = input.nextInt();
				if(temp==1) {
					x = m + 1;
					y = i + 1;
				}
			}
		}
		System.out.print(Math.abs(centerX - x) + Math.abs(centerY - y) );
		input.close();
	}
}
