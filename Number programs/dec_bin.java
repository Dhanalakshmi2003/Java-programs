//decimal to binary
class dec_bin 
{
	public static void main(String[] args) 
	{
		int decimal=13;
		int sum=0;
		int pow=1;
		while(decimal>0)
		{
		    sum+=decimal%2*pow;
			decimal/=2;
			pow*=10;
		}

		System.out.println(sum);
	}
}
