//binary to decimal
class bin_dec 
{
	public static void main(String[] args) 
	{
		int binary=1101;
		int pow=1;
		int sum=0;  
		while(binary>0)
		{
			sum+=binary%10*pow;
			pow*=2;
			binary/=10;
		}
		System.out.println(sum);
	}
}
