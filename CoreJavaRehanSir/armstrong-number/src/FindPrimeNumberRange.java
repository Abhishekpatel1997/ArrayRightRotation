
public class FindPrimeNumberRange {
public static void main(String[] args) {
	for(int num=2;num<=100;num++)
	{
		int flag=1;
		for(int ctr=2;ctr<=num/2;ctr++)
		{
			if(num%ctr==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println(num);
	}
}
}
