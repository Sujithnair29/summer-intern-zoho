import java.util.Arrays;
import java.util.Scanner;

public class indefiniteArray {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int[] arr1= new int[1];
			for (int x=0;x<arr1.length;x++) {
				arr1[x]=input.nextInt();
			}
			
			while(arr1[arr1.length-1]!=-1) {	
				int [] arr2=new int[arr1.length+1];
				arr2[arr1.length]=input.nextInt();
				if (arr2[arr1.length]==-1) {
					break;
				}
				int i=0;
				while(i<arr1.length) {
					arr2[i]=arr1[i];
					++i;
				}arr1=arr2;
			}
			System.out.println(Arrays.toString(arr1));
			System.out.println("length="+arr1.length);
		}
		

	}

}
