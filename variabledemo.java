package almamatter;

public class variabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 		int age;
 		age = 5;
 		System.out.println(age);
		int $age; // valid 
		int _age;
		int ag2s; // can have numbers as well inbetween - primarily it should start only with char, $ or _
		//int 1age; //invalid identified
		
		//int a g e; // cannot have space inbetween them
		
		//int class; //cannot have a keyword as identifier
		
		int Age;
		//int age; // both are different -- identifiers are case sensitive
		
		//Declarations  of all the variables and initialization
		
		int salary = 2_14_122_123;
		salary = salary+1;
		System.out.println(salary);
		
		short sal = 21211;
		byte saal = 21;
		//decimal is by default double -- add f if it needs to be a float
		
		float f = 233.12f;
		double d = 231.11;
		char a = 'c';
		System.out.println(a);
		
		boolean boo = false;
		boolean boos = true;
		
		String str = "hello world";
		
		System.out.println(str);
		
		
		
	
	}

}


