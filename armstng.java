package DAY1;

public class armstng {

	public static void main(String[] args) {
		int no=153;
		int no2=no;
		int arms=0,rem=0;
		while(no>0)
		{
			rem=no%10;
			arms=arms+(rem*rem*rem);
					
					no=no/10;
			
		}
		if(no2==arms)
		{
			System.out.println("arms");
		}else
		{
			System.out.println("not arms");
		}
		// TODO Auto-generated method stub

	}

}
