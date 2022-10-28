import java.util.Arrays;

public class LargestSubarrayWithSumZero2 {
	
	int maxLen = 0;

	public static void main(String[] args) {
		
//		int[] arr = {15,-2,2,-8,1,7,10,23};
//		int[] arr = {1,2,3,5,4,-5,-4,-3,-2,-1};
//		int[] arr = {7,-2,-3,2,3,-28,28,3};
//		int[] arr = {0, -1, 1, -24, 5};
		int[] arr = {1,-1,1,-1,3,2};
		System.out.println(new LargestSubarrayWithSumZero2().findLargestSubarray(arr));

	}
	
	public int findLargestSubarray(int[] arr) {		
				
		int sum = 0;
		int left = 0;
		int right = arr.length-1;
		
		for (int n:arr) {
			sum += n;
		}
		
		while (left <= right) {
			
			if (sum == 0) {
				return right-left+1;
			}
			
			if (Math.abs(sum - arr[left]) < Math.abs(sum - arr[right])) {
				sum -= arr[left];
				left++;
			} else {
				sum -= arr[right];
				right--;
			}
						
		}
		
		return -1;
		
	}
	

}
