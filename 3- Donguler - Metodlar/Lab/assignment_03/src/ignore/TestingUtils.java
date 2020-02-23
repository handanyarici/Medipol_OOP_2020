package ignore;

import assignment_03.App;

public class TestingUtils {
	public static void runTests(){
		

		int[] params1 = { 1, 3, 3, 2, 5, 5, 2, 9, 9, 5, 3, 3 };
		
		int[] params2 = { 2, 1, 2, 3, 3, 3, 5, 5, 4, 4, 3, 3 };

		int[] params3 = { 3, 2, 2, 1, -2, -3, 3, 5, 5, 9, 0, 2 };
		
		boolean[] expected = { true, true, false, true, true, false, true, false, true, true, true, false };
        
		for(int i=0; i < params1.length; i++){
			boolean result = App.twoSumOne(params1[i], params2[i], params3[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i],  params3[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i],  params3[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object params2, Object params3, Object expected, Object result){
		return "PASS: twoSumOne("+ params1.toString()+ ", "+ params2.toString()+ ", "+ params3.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object params2, Object params3, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: twoSumOne("+ params1.toString()+ ", "+ params2.toString()+", "+ params3.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}