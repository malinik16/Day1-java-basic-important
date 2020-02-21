package DAY1;

public class binarytodecimal {

	public static void main(String[] args) {
		int no=1001100,power=0,dec=0;
		while(no>0)
		{
			int rem=no%10;
			dec=dec+(rem*(int)Math.pow(2,power));
			no=no/10;
			power++;
		
			
		}
		System.out.println(dec);
		// TODO Auto-generated method stub

	}

}
