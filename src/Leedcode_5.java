
public class Leedcode_5 {
	public void quicksort(int[] nums, int low, int high){
		int dp;
		if (low < high) {
			dp = partition(nums, low, high);
		quicksort(nums, low, dp-1);
		quicksort(nums, dp + 1,high);
		}
	}
	public int partition(int[] n, int left, int right){
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
	}
	
	public static void main(String[] argv)
	{
		Leedcode_5 test=new Leedcode_5();
		int[] nums={0};
		test.quicksort(nums,0,0);
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
	}
}
