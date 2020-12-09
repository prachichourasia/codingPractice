import java.util.LinkedHashSet;

public class CountAllDuplicateCharPresentInString 
{
   public static void main(String[] args) 
   {
	String s="I want to work in google";
	//String s="aaaaaaaabbbbbb";
	s=s.toLowerCase();
	LinkedHashSet<Character> set=new LinkedHashSet<>();
	
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
	
	for(Character c:set)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==(s.charAt(i)))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(c+" present "+count);
		}
	}
}
}