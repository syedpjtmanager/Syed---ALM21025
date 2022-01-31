package javatraining;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 byte b=120;
		 short s=b;
		 //b=s;
		 b=(byte)s;
		 
		 System.out.println(b);
		 
		 byte bi=15;
		 int in=bi;
		 //bi=in;
		 bi=(byte)in;
		 
		 System.out.println(bi);
		 
		 int n=255;
		 //by=n;
		 byte by=(byte)n;
		 System.out.println(by);
		 
		 float f=23;
		 f=123.45f;
		 
		 double d=f;
		 f=(float)d;
		 System.out.println(f);
		 
		 char c='a';
		 c=97;
		 c=(char)i;//you cannot assign a int to a character
		 i=c;//you can assign a character to a int - compatible
		 
		 
		 
 

	}

}
