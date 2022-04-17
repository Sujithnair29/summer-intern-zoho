import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x= input.nextLine();
		int y=Integer.parseInt(x);
		int z= y%2;
		if (z==0) {
			System.out.println("It is an even number");
		}else {
			System.out.println("It is an odd number");
		}
		
		

	}

}
