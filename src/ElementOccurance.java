import java.util.HashMap;
import java.util.Map;

public class ElementOccurance {

	public static void main(String[] args) {
		
		int[] arr = {1,7,4,3,4,8,7};
		System.out.println(new ElementOccurance().findElement(arr, 2));

	}
	
	public int findElement(int[] arr, int k) {
		
		Map<Integer, Integer> count = new HashMap<>();
		
		for (int n:arr) {
			count.put(n, count.getOrDefault(n, 0) + 1);
			if (count.get(n) == k) {
				return n;
			}
		}
		
		return -1;
		
	}

}
