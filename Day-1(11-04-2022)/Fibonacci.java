import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n =input.nextInt();
		int firstNo=0;
		int secondNo=1;
		while(firstNo<=n) {
			System.out.print(firstNo+",");
			int temp=secondNo;
			secondNo+=firstNo;
			firstNo=temp;
			
		}
		

	}

}
