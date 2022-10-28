import java.util.HashMap;
import java.util.Map;

public class EqualArrays {

	public static void main(String[] args) {
		
		int[] a = {1,2,5,4,0};
		int[] b = {2,4,5,0,1};
		System.out.println(new EqualArrays().isEqualArrays(a, b));

	}
	
	public boolean isEqualArrays(int[] a, int[] b) {
		
		if (a.length != b.length) {
			return false;
		}
		
		Map<Integer, Integer> mapA = new HashMap<>();
		Map<Integer, Integer> mapB = new HashMap<>();
		
		for (int i=0; i<a.length; i++) {
			mapA.put(a[i], mapA.getOrDefault(a[i], 0) + 1);
			mapB.put(b[i], mapB.getOrDefault(b[i], 0) + 1);
		}
		
		if (mapA.equals(mapB)) {
			return true;
		} else {
			return false;
		}
		
	}

}
