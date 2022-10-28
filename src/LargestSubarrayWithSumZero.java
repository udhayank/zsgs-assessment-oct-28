
public class LargestSubarrayWithSumZero {
	
	int maxLen = 0;

	public static void main(String[] args) {
		
		int[] arr = {15,-2,2,-8,1,7,10,23};
//		int[] arr = {1,2,3,4,5,-5,-4,-3,-2,-1};
		System.out.println(new LargestSubarrayWithSumZero().findLargestSubarray(arr));

	}
	
	public int findLargestSubarray(int[] arr) {
		
		maxLen = 0;
				
		for (int i=0; i<arr.length; i++) {
			int sum = 0;
			for (int j=i; j<arr.length; j++) {
				sum += arr[j];
				if (sum == 0) {
					maxLen = Math.max(maxLen, j-i+1);
				}
			}
		}
		
		
		return maxLen;
		
	}
	
//	public void findLargestSubarray(int[] arr, int left, int right, int sum) {
//		
////		System.out.println(sum);
//		
//		if (sum == 0) {
//			maxLen = Math.max(maxLen, right - left + 1);
//			return;
//		}
//		
//		findLargestSubarray(arr, left+1, right, sum-arr[left]);		
//		findLargestSubarray(arr, left, right-1, sum-arr[right]);			
//		
//		
//		
//	}
	
//	public int findSmallestSubarray(int[] arr) {
//		
//		int maxLen = 0;
//		
//		int sum = 0;
//		int left = 0;
//		int right = arr.length - 1;
//		
//		while (right<arr.length) {
//			
//			sum += arr[right];
//			
//			if (sum == 0) {
//				maxLen = Math.max(maxLen, right - left + 1);
//				right++;
//			} else if (sum > 0) {
//				if (left < right) {
//					sum -= arr[left];
//					sum -= arr[right];
//					left++;
//				} else {
//					right++;
//				}
//			} else {
//				right++;
//			}
//			
//			
//		}				
//		
//		return maxLen;
//		
//	}

}
