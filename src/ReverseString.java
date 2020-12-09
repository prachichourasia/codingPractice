
public class ReverseString 

{

	public static void main(String[] args) 
	{
		
		String s="prachi chourasia is ratnaparkhi and is not chourasia";
		String rev="";
		String[] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String temp=s1[i];
			rev=rev+temp.charAt(0)+" ";
		}
		System.out.println(rev);
	}

}
