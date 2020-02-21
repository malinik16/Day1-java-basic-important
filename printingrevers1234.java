package DAY1;

public class printingrevers1234 {

	public static void main(String[] args) {
		int no=12321;
		int rev=0,no1=no;
		while(no>0) {
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		{
		System.out.println(rev);
		}
		if(no1==rev) {
		
			System.out.println("palindrome");
		// TODO Auto-generated method stub

	}
	}

}

