import java.util.ArrayList;


public class FindMaxCommonDivisor {
	public static void main(String[] args) {
		
		System.out.println(findMaxCommonDivisor(100, 30));
	
	}
	
	public static int findMaxCommonDivisor(int m, int n){
		int smaller = Math.min(m, n);
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 1;i<smaller;i++){
			if((m % i == 0) && (n % i == 0)){
				result.add(i);
			}
		}
		
		return result.get(result.size() - 1);
	}
}
