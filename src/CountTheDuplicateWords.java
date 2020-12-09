import java.util.LinkedHashSet;
//print the count of all duplicate word present in the string
public class CountTheDuplicateWords 
{
	public static void main(String[] args) 
	{
		String s="keep me login keep me login keep me login to to";
		String[] s1=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		
		for(int i=0;i<s1.length;i++)
		{
			set.add(s1[i]);
		}
		int temp=0;
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
			if(count>1)
			{
				System.out.println(word);
			}
		}
		
		
		}
	
	}
	
	
	
	
	
	
	

/*String s="keep me login keep me login keep me login to to";
String[] s1=s.split(" ");
LinkedHashSet<String> set=new LinkedHashSet<String>();


for(int i=0;i<s1.length;i++)
{
	set.add(s1[i]);
}
int temp=0;
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
	if(count>1)
	{
		temp++;
	}
}
System.out.println(temp);

}*/


