
public class ChageToCapital {

	public static void main(String[] args) 
	{
		String s="India";
		wordPattern1(s);
		wordPattern2(s);

	}
	static void wordPattern1(String s)
	{
		String result="";
		for(int i=0;i<s.length();i++)
		{	
			char ch=s.charAt(i);
			if(ch=='i')
			{
				String upr=ch+"";
				result=result+upr.toUpperCase();
			}
			else
			{
				result=result+ch;
			}
		}
		System.out.println(result);
	}
	static void wordPattern2(String s)
	{
		String result="";
		for(int i=0;i<s.length();i++)
		{	
			char ch=s.charAt(i);
			if(ch=='I')
			{
				String upr=ch+"";
				result=result+upr.toLowerCase();
			}
			else if(ch=='i')
			{
				String upr=ch+"";
				result=result+upr.toUpperCase();
			}
			else
			{
				result=result+ch;
			}
		}
		System.out.println(result);
	}
	
}
