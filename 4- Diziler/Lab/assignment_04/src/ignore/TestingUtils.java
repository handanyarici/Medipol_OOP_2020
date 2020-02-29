package ignore;

import assignment_04.App;

public class TestingUtils {
	public static void runTests(){
		

		int[] params1 = { 70, 95, 95, 90, 90, 50, 50, 100, 100, 105, 59, 59, 60 };

		boolean[] params2 = { false, false, true, false, true, false, true, false, true, true, false, true, false };

		boolean[] expected = { true, false, true, true, true, false, false, false, true, false, false, false, true };
        
		for(int i=0; i < params1.length; i++){
			boolean result = App.birdsSinging(params1[i], params2[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object params2, Object expected, Object result){
		return "PASS: birdsSinging("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object params2, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: birdsSinging("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}