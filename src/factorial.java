
public class factorial {

	public static void main(String[] args) {
		int num=150;
		int temp1=num;
		int temp2=num;
		int count=0;
		int sum=0;
		while(temp1>0)
		{
			count++;
			temp1=temp1/10;
		}
		while(temp2>0)
		{
			int rem=temp2%10;
			int result=1;
			for(int i=1;i<=count;i++)
			{
				result=result*rem;
			}
			sum=sum+result;
			temp2=temp2/10;
		}
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println(" not armstrong");
		}
		
		

	}

}
