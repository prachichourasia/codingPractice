
public class PrimeN0
{
	public static void main(String[] args) {
		
	
	int num=7;
	int temp=num;
	boolean flag =true;
	for(int i=2;i<num/2;i++)
	{
		if(num%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag == false)
	{
		System.out.println("prim no.");
	}
	else
	{
		System.out.println(" not prim no.");
	}
}	

}
