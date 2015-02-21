import java.util.ArrayList;


public class FindCommonDivisor {
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result = findCommonDivisor(500, 1000);
		
		System.out.println(result);
	}
	
	public static ArrayList<Integer> findCommonDivisor(int m, int n){
		int smaller = Math.min(m, n);
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 1;i<smaller;i++){
			if((m % i == 0) && (n % i == 0)){
				result.add(i);
			}
		}
		return result;
	}
}
