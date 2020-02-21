package DAY1;

public class primenumber {

	public static void main(String[] args) {
		int no = 4;
		int div = 3;
		boolean check = true;
		int primecount = 1;
		while (primecount < 20) {

			no = no + 2;

			if (no % 2 != 0) {
				while (no < div) {
					if (no % div == 0)

						// System.out.println("not prime");
						break;
				
					
				div = div + 2;

				// TODO Auto-generated method stub

				if (check == true) {
					System.out.println("n+is a prime");
					primecount++;
				}
			}
			}
			//
			else {
				 System.out.println("not prime");

			}
		}

	}
}
