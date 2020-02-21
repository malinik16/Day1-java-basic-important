package DAY1;

public class multipleofgiven {

	public static void main(String[] args) {
		int no1=65,no2=78;
		int big=no1>no2?no1:no2;
		int big2=big;
		
		int small=no1<no2?no1:no2;
		
		while(true)
		{
			if(big%small==0)
			{
				System.out.println(big);
			break;
		}
		big+=big2;
		// TODO Auto-generated method stub

	}

}
}
