import java.util.Hashtable;


public class Leedcode_3 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Hashtable<Integer,Integer> hash=new Hashtable();
       for(int i=0;i<nums.length;i++){
    	   if(hash.containsKey(nums[i]))
    	   {
    		   int index= hash.get(nums[i]);
    		   if(index>=i)
    		   {
    			   if(index-i<=k)
    				   return true;
    			   else
    			   {
    				  hash.put(nums[i], i);
    			   }
    		   }
    		   else
    		   {
    			   if(i-index<=k)
    				   return true;
    			   else{
    				  hash.put(nums[i], i);   
    			   }
    		   }
    	   }else
    	   {
    		   hash.put(nums[i], i);
    	   }
       }
       return false;
    }
    public static void main(String[] argv)
    {
    	Leedcode_3 test=new Leedcode_3();
    	int[] a= {1,0,1,1};
    	System.out.println("The length is "+a.length);
    	if(test.containsNearbyDuplicate(a,1))
    		System.out.println("This is right!");
    	else
    		System.out.println("This is false!");
    	
    }
}
