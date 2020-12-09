import java.util.HashSet;
import java.util.TreeSet;

public class CategoriesCharacter {

	public static void main(String[] args) 
	{

        String s="1231236789*&*&*&^";
        char[] strArray=s.toCharArray();
        String num="";
        String spchar="";
        String alphabet="";
        for(int i=0;i<=s.length()-1;i++)
		{
        	if(strArray[i]>='0' && strArray[i]<='9')
        	{
        	num=num+strArray[i];
        	}
        }
        System.out.println("numbers are :"+num);
	
        HashSet<Character> set=new HashSet();
        //inseting into hashset
        for(int i=0;i<strArray.length;i++)
		{
        	set.add(strArray[i]);
		}
        //taking char from set for comparision
        for(Character c:set)
    	{
    		int count=0;
    		for(int i=0;i<strArray.length;i++)
    		{
    			if(strArray[i]==c)
    			{
    				count++;
    			}
    		}
    	if(count>1)
		{
			System.out.println(c);
		}
	}}
}
