package epam10;

public class AvgList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Average:"+getAvg(2,6,27,24,73));

	}
	private static double getAvg(double...numbers){
		double amt=0;
		double ans;
		for(double i : numbers){
			amt += i;
			
		}
		ans = amt/numbers.length;
		return ans;
	}
}
