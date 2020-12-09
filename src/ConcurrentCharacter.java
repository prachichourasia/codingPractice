import java.util.HashSet;

public class ConcurrentCharacter {

	public static void main(String[] args) 
	{
		String s="aaaaabbbbbbvhfhgfjbn";
		conPattern2(s);
	}

	 static void conPattern1(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{	
			char c1=ch[i];
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				char c2=ch[i];
				if(c1==c2)
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(c1);
			}	
		}
		
	}
	 static void conPattern2(String s)
	 {
		 HashSet<Character> set=new HashSet<>();
		 //not allow duplicate
		 for(int i=0;i<s.length()-1;i++)
		 {
			 if(s.charAt(i)==s.charAt(i+1))
			 {
				 set.add(s.charAt(i));
				
			 }
		 }
		 System.out.println(set);
	}
	 
}
