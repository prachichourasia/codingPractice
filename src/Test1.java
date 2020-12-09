import java.util.HashSet;

public class Test1 {

	public static void main(String[] args) {
		String s1="keepmekool";
		//String[] s1=s.split(" ");
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s1.length();i++)
		{ 
		  set.add(s1.charAt(i));
		}
		for(Character c: set)
		{	
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==c)
				{
		     			count++;
				}
			}
			if(count>1)
				{
		          	System.out.println(c+ " "+count);
		           }
		}
	}

}
