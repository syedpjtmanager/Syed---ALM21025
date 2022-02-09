package javatraining;

public class EscapeSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello \"Aspire\" World");
		System.out.println("Hello \'Aspire\' World");
		System.out.println("Hello \f\f World");
		System.out.println("Hello \b\b\b World");
		
		System.out.print("Hello Hello\rWorld");
		int count =0;
		while(true) {
			System.out.print(count+++"\r");
		}

	}

}
