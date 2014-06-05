
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number= 600851475143L;
		int divisor=2;
		int largest=2;
		while (number!=1)
		{
			if(number%divisor==0)
			{
				number = number/divisor;
				largest = divisor;
			}else
			{
				divisor++;
			}
		}
		System.out.print(largest);
	}

}
