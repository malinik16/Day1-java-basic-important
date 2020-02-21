package DAY1;

public class printingreversorder {

	public static void main(String[] args) {
		int no=56789,noofdisg=0;
		while(no>0)
		{
			int rem=no%10;
			System.out.println(rem);
			no=no/10;
			noofdisg++;
			
		}
		System.out.println("noofdisg is a"+noofdisg);
		// TODO Auto-generated method stub

	}

}
