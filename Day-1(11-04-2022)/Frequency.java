import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String check= input.nextLine();
		char y = check.charAt(0);
		
		String alpha= input.nextLine();
		
		int count=0;
		for (int i=0;i<alpha.length();i++) {
			char x=alpha.charAt(i);
			if (x==y) {
				count++;
				
			}
			
		}System.out.println(count);

	}

}
