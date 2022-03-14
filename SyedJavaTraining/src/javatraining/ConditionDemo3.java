package javatraining;

public class ConditionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String date="07 january 2022";
		
		String month=date.substring(3,6);//3 is the starting digit and 6 is the ending digit - space doesn't count
		
		System.out.println(month);
		
		if(month.equals("feb")) {
			System.out.println("February month.......");
		}
		else if(month.equals("jan")) {
			System.out.println("This is january month....");
		}
		else if(month.equals("mar")) {
			System.out.println("This is march month....");
		}
		else {
			System.out.println("rest I am yet to check...");
		}

	}

}
