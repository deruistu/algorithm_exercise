import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

/*
 * 一定要注意做前期的非法输入的判断。这是一个小陷阱。
 */
public class Leetcode_350 {
	class storeData
	{
		int number;
		int times;
	}

	public static int[] intersect(int[] nums1, int[] nums2)
	{
		
		//first judge
		if(nums1.length==0 || nums2.length == 0)
		{
			int[] result = new int[0];

			return result;
		}
		
		HashMap<Integer,Integer> mapNums1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> mapNums2 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> mapNums3 = new HashMap<Integer, Integer>();
		
		//store nums1
		for (int i =0 ;i<nums1.length;i++)
		{
			if(mapNums1.containsKey(nums1[i]))
			{
				int tmpNum = mapNums1.get(nums1[i])+1;
				mapNums1.put(nums1[i], tmpNum);
			}
			else if(!mapNums1.containsKey(nums1[i]))
			{
				mapNums1.put(nums1[i], 1);
			}
		}
		
		//store nums2
		for(int i =0 ; i<nums2.length ; i++)
		{
			if(mapNums2.containsKey(nums2[i]))
			{
				int tmpNum = mapNums2.get(nums2[i])+1;
				mapNums2.put(nums2[i], tmpNum);				
			}
			else if(!mapNums2.containsKey(nums2[i]))
			{
				mapNums2.put(nums2[i], 1);
			}
		}
		
		for( int i : mapNums1.keySet())
		{
			if(mapNums2.containsKey(i))
			{
				int min =mapNums1.get(i);
				if(min>mapNums2.get(i))
				{
					min = mapNums2.get(i);
				}
				mapNums3.put(i, min);
			}
		}
		
		int all_num=0;
		Vector<Integer> output = new Vector();
		
		for(int key : mapNums3.keySet())
		{
			for(int i = 0;i<mapNums3.get(key);i++)
			{
				int storeValue = key;
				output.add(storeValue);
			}
		}
		
		int[] output_nums = new int[output.size()];
		
		for(int i =0 ;i<output.size();i++)
		{
			output_nums[i]=output.get(i);
			System.out.println(output_nums[i]);
		}
		return output_nums;
	}
	
	public static void main(String[] argv)
	{
		int[] nums1 = new int[0];
		int[] nums2 = new int[0];
		
		//nums1[0]=1;
		//nums1[1]=2;
		//nums1[2]=2;
		//nums1[3]=4;
		
		//nums2[0]=2;
		//nums2[1]=2;
		intersect(nums1,nums2);
	}
}
