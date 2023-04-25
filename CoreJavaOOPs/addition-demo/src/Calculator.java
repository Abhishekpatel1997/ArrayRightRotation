
public class Calculator {
private int num1;
private int num2;
public Calculator(int n1,int n2) {
	this.num1=n1;
	this.num2=n2;
}
public void add()
{
	int res=num1+num2;
	System.out.println(res);
}
public void sub()
{ int res;
	if(num1>num2)
	{
	res=num1-num2;
	}
	else
	{
		res=num2-num1;
	}
	System.out.println(res);

}
public void mul()
{
	int res=num1*num2;
	System.out.println(res);
}
public void div()
{

	float res=(float)num1/num2;
	System.out.println(res);
}
}

