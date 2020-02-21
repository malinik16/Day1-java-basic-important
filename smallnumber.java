package DAY1;

public class smallnumber {

	public static void main(String[] args) {
		int no=105;
		int div=2;
		while(div<=no)
		{
			if(no%div==0)
			{
				System.out.println(div);
				break;
			}
			div++;
		}
		// TODO Auto-generated method stub

	}

}
