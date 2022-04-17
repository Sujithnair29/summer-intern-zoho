import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float num1= input.nextFloat();
		System.out.print("Enter a another number: ");
		float num2= input.nextFloat();
		float product=num1*num2;
		System.out.println("Product of the numbers is: "+ product);

	}

}
