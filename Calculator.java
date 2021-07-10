import java.util.Scanner;

public class Calculator  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter i: ");
		int i = scan.nextInt();
		
		System.out.println("Enter j: ");
		int j= scan.nextInt();
		
		int sum = i+j;
		
		System.out.println("The sum is "+sum);
		

	}

}
