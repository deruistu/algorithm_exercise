import java.util.Hashtable;


public class Leetcode_4 {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer,Integer> container=new Hashtable();
        for(int i=0;i<nums.length;i++)
        {
        	if(container.containsKey(nums[i]))
        	{
        		return true;
        	}
        	else
        	{
        		container.put(nums[i], i);
        	}
        }
    	return false;
    }
    public static void main(String[] argv)
    {
    	System.out.println("hello world");
    }
}
