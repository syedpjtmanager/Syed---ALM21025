package javatraining;

public class ConditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
				
				String date="07 january 2022";
				
				String month=date.substring(3,6);
				
				/*System.out.println(month);
				
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
				}*/
				
				switch(month) {
				case "jan":{
					System.out.println("January month");
					break;
				}
				case "feb":{
					System.out.println("Februaru month");
					break;
				}
				default:{
					System.out.println("Other");
				}
			}
	}
}

