import java.util.LinkedHashSet;

public class PrintDuplicateWordPresentInString {

	public static void main(String[] args) {
		String s="keep me login keep me login keep me login to";
		String[] s1=s.split(" ");
		String dup="";
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
			if(count>1)
			{
			  dup=dup+word+" ";
				//System.out.println(word + count);
			}
		}
		System.out.println(dup);
	}		

	}

 
