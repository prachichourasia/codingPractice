import java.util.LinkedHashSet;

public class Practice {

	public static void main(String[] args) 
	{
		String s="prachi chourasia is ratnaparkhi and is not chourasia";
		//String[] s1=s.split(" ");
		char[] s1=s.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length;i++)
		{
			set.add(s1[i]);
		}
		
		for(Character word : set)
		{
			int count=0;
			for(int i=0;i<s1.length;i++)
			{
				if(word.equals(s1[i]))
				{
					count++;
				}
			}
		
		if(count>1)
		{
			System.out.println(word+" =occurs "+count+" times.");
		}
	 }
	}

}
