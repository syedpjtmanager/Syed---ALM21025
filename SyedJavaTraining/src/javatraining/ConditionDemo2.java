package javatraining;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int num=Integer.parseInt(args[0]);
		
		int result=num%2;
		
		boolean boo=(result==0);
		
		if(boo) {
			System.out.println("Even number...");
		}
		else {
			System.out.println("odd number...");
		}

	}

}
