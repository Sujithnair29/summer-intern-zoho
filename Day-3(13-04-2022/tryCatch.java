import java.util.Scanner;

public class tryCatch {

	public static void main(String[] args) {
		try{
			Scanner input=new Scanner(System.in);
			int x=input.nextInt();
		}catch(Exception e){
			System.err.println("It is an error");
		}finally {
			System.out.println("All the best");
		}

	}

}
