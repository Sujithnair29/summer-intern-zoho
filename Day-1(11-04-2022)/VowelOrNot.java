import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x =input.nextLine();
		String a=x.toUpperCase();
		
		char y = a.charAt(0);
		
		
		if (y=='A'||y=='E'||y=='I'||y=='O'||y=='U') {
			System.out.println(x+" is a vowel");
		}else {
			System.out.println(x+" is a consonent");
		}
		
		
		
		
		
	}

}
