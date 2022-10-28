import java.util.LinkedList;
import java.util.List;

public class LeaderInArray {

	public static void main(String[] args) {
		
		int[] arr = {16, 17, 4, 3, 5, 2};
//		int[] arr = {5,4,3,2,1};
		System.out.println(new LeaderInArray().findLeaderInArray(arr));

	}
	
	public List<Integer> findLeaderInArray(int[] arr) {
		
		List<Integer> res = new LinkedList<>();
		
		int max = arr[arr.length-1];
		res.add(max);
		
		for (int i=arr.length-2; i>=0; i--) {
			
			if (arr[i] >= max) {				
				max = arr[i];
				res.add(0,max);
			}
			
		}		
		
		return res;
		
	}

}
