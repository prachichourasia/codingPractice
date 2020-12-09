import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		String s="keep me login keep me login";
		String[] s1=s.split(" ");
		String duplicate="";
		HashSet<String> set=new HashSet<>();
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
		           duplicate=duplicate+word+" ";
		        }
		}
		System.out.println(duplicate);
	}

}
