import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;


public class Leecode_6 {
	public static int a=0;
	public int lengthOfLongestSubstring(String s)
	{
		    int maxlen = 0;  
		    int begin = 0;  
		    int n = s.length();  
		    Vector next = new Vector(); //next[i]记录了下一个与str[i]重复的字符的位置  
		    Vector first = new Vector(); //first[i]记录str[i]后面最近的一个重复点  
		    int[] hash=new int[256];    
		   
		    return maxlen;  
	}
	
	public static void main(String[] argv)
	{
		Leecode_6 test=new Leecode_6();
		int count=0;
		count=test.lengthOfLongestSubstring("abcbde");
		System.out.println("The result is:"+count);
		System.out.println(test.a);
		test.a=8;
		System.out.println(test.a);
		Leecode_6 test2=new Leecode_6();
		System.out.println(test2.a);

	}
}
