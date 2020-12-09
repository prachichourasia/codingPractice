import java.util.Arrays;

public class ReverseArray {
	
	public static void main (String[] args) throws java.lang.Exception
	{
	   // String[] array = {"my", "name", "is", "prachi","chourasia"};
	    int[] array= {1,2,3,4,5};
	    int middle = array.length / 2;
        //String temp;
	    int temp;
	    int j = array.length -1;

	    for (int i = 0 ; i < middle; i++)
	    {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        j--;
	    }

	    System.out.println(Arrays.toString(array));
	}
	
}
