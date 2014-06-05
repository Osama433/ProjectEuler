
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int x = 0; x<1000;x++)
		{
			if(x%5==0 || x%3==0)
			{
				sum = sum + x;
			}
		}
		System.out.print(sum);
	}

}
