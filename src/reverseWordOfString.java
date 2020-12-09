
public class reverseWordOfString {

	public static void main(String[] args) 
	{
		String s="welcome to tyss";
		String[] s1=s.split(" ");
		String rev="";
		for(int i=s1.length-1;i>=0;i--)		
		{	
			rev=rev+s1[i]+" ";
		}
	System.out.println(rev);
	}

}
