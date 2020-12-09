import java.util.LinkedHashSet;

public class NoOFOccuranceOfGivenWord 
{
	public static void main(String[] args) 
	{
		String s="keep me login keep me login leepme login";
		String[] s1=s.split(" ");
	
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		
		for(int i=0;i<s1.length;i++)
		{
			set.add(s1[i]);
		}
		
		for(String word: set)
		{
			int count=0;
			for(int i=0;i<s1.length;i++)
			{
				if(word.equals(s1[i]))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(word+" occures "+count+" times");
			}
		}
	}
}
