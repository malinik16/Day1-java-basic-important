package DAY1;

public class Greatescommondivise {

	public static void main(String[] args) {
		int no1=30,no2=25;
		int small=no1<no2?no1:no2;
		boolean common=false;
		
		while(small>=2)
		{
			if((no1%small==0)&&(no2%small==0))
			{
				common=true;
				System.out.println("gcd"+small);
				break;
			}
			small--;
		}
		if(common==false)
		{
			System.out.println("not common");
		}
		// TODO Auto-generated method stub

	}

}

