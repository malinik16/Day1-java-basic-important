package DAY1;

public class squreroot {

	public static void main(String[] args) {
		int no=81,div=2;
		while(div<=no/2)
		{
			if(no/div==div)
			{
				System.out.println(div+"root");
				break;
			}
			div++;
		}
		// TODO Auto-generated method stub

	}

}
