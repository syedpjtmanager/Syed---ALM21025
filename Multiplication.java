import java.util.Scanner;

public class Multiplication  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter i: ");
		int i = scan.nextInt();
		
		System.out.println("Enter j: ");
		int j= scan.nextInt();
		
		int mul = i*j;
		
		System.out.println("The result is "+mul);
		

	}

}
