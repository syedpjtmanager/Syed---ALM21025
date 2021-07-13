package almamatter;

public class loopingdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1000;
		//do {
		//System.out.println(x);
		//x = x/2;
		
	//}while(x>100);
		do {//post condition check...
			String s=(x%2==0)?"Even Number..."+x:"Odd Number....."+x; //terinary operators
			System.out.println(s);
			--x;
		}while(x>0);

	}
}
