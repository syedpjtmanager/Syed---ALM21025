package javatraining;

public class Enhancedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,30,40};
		int twod[][]= {{1,2,3,4},{10,20,30,40},{100,200,300,400}};
		for (int i:arr) {
			System.out.print(i+"\t\t\t");
		}
		System.out.println();
		System.out.println(twod[0][2]);
	
	for(int i[]:twod) {
		for (int j:i) {
			System.out.println(j+"\t");
		}
		System.out.println();
	}

}
}
