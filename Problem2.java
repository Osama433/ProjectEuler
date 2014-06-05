
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term = 1;
		int prev = 1;
		int temp = 0;
		int sum= 0;
		while (term <=4000000)
		{
			temp = term + prev;
			prev = term;
			term = temp;
			
			if(term%2==0)
			{
				sum = term +sum;
			}
		}
		System.out.print(sum);
	}

}
