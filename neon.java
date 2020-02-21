package DAY1;

public class neon {

	public static void main(String[] args) {
		int no=9,square,rem;
		int sum=0;
		square=no*no;
		while(square>0)
		{
			rem=square%10;
			 sum=sum+rem;
			square=square/10;
			
			
			
			
		}if(sum==no)
		{
			System.out.println("NEON");
		}
		else {
			System.out.println("not neon");
		}
		// TODO Auto-generated method stub

	}

}
