import java.util.HashSet;


public class Leetcode_349 {

	public static int[] intersection(int[] nums1, int[] nums2)
	{
		HashSet<Integer> hashSetNums1 = new HashSet<Integer>();
		HashSet<Integer> hashSetNums3 = new HashSet<Integer>();
		//store nums1;
		for(int i = 0;i<nums1.length;i++)
		{
			hashSetNums1.add(nums1[i]);
		}
		//store nums2
		for(int i =0;i<nums2.length;i++)
		{
			if(hashSetNums1.contains(nums2[i]))
			{
				hashSetNums3.add(nums2[i]);
			}
		}
		
		int[] output_nums = new int[hashSetNums3.size()];
		
		int i= 0;
		for (Integer tmp:hashSetNums3)
		{
			output_nums[i]=tmp;
			
			System.out.println(output_nums[i]);
			//i++;
		}
		
		return output_nums;
	}
	
	public static void main(String[] argv)
	{
		int[] nums1 = new int[2];
		int[] nums2 = new int[2];
		
		nums1[0]=1;
		nums1[1]=2;
		//nums1[2]=2;
		//nums1[3]=4;
		
		nums2[0]=2;
		nums2[1]=1;
		intersection(nums1,nums2);
	}
}
