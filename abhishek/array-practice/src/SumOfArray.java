
public class SumOfArray {
public static void main(String[] args) {
	int A[]= {3,9,7,8,12,6,15,5,4,10};
	int sum=0;
	int sum1=0;
	for(int i=0;i<A.length;i++)
	{
		sum=sum+A[i];
	}
	System.out.println("the sum of all element of array is "+sum);
	//or you do it by using for eachloop
	/*for(int x:A)
	{
		sum1=sum1+x;
	}
	System.out.println(sum1);*/ 
}
}
