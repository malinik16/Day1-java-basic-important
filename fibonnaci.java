package DAY1;

public class fibonnaci {

	public static void main(String[] args) {
		int first=0,second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=2;i<=10;i++)
		{
			second=first+second;
		System.out.println(second);
		first=second-first;
		}
		// TODO Auto-generated method stub

	}

}
