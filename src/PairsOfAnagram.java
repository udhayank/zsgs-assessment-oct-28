import java.util.HashSet;
import java.util.Set;

public class PairsOfAnagram {

	public static void main(String[] args) {
		
		String str = "abbbba";
//		String str = "abcd";
				
		System.out.println(new PairsOfAnagram().numberOfPairs(str));

	}
	
	public int numberOfPairs(String str) {
		
		// to find unique number of anagram substring pairs present in given string
		
		int count = 0;
		
		Set<String> set = new HashSet<>();
		
		for (int window = 1; window < str.length(); window++) {
			
			int left = 0;
			int right = 0;
			
			while (right < window-1) {
				right++;
			}
			
			while (right < str.length()) {
				
				// remove this condition to include duplicate pairs 
				if (!set.add(str.substring(left, right+1))) {
					right++;
					left++;
					continue;
				}
				
				int[] ref = new int[26];				
				for (char ch:str.substring(left, right+1).toCharArray()) {
					ref[ch - 'a']++;
				}
				
				int l = left + 1;
				int r = right + 1;
				while (r < str.length()) {
					
					int[] curCount = new int[26];
					for (char ch:str.substring(l, r+1).toCharArray()) {
						curCount[ch - 'a']++;
					}
					
					if (isEqualArray(ref, curCount)) {
						System.out.println(str.substring(l, r+1));
						count++;
						break; // remove this condition to include duplicate pairs
					}
					
					l++;
					r++;
					
				}
				
				right++;
				left++;
				
			}
			
		}
		
		return count;
		
	}

	private boolean isEqualArray(int[] ref, int[] curCount) {
		
		for (int i=0; i<ref.length; i++) {
			if (ref[i] != curCount[i]) {
				return false;
			}
		}
		
		return true;
	}

}
