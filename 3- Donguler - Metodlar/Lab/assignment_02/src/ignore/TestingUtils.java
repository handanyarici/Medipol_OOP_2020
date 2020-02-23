package ignore;

import assignment_02.App;

public class TestingUtils {
	public static void runTests(){
		

		int [] params1 = {60,65,65,80,85,85,70,75,75,40,40,90};
		
		boolean[] params2 = { false, false, true, false, false, true, false, false, true, false, true, false };

		int[] expected = { 0, 100, 0, 100, 200, 100, 100, 100, 100, 0, 0, 200 };
        
		for(int i=0; i < params1.length; i++){
			int result = App.speedingFine(params1[i], params2[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object params2, Object expected, Object result){
		return "PASS: speedingFine("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object params2, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: speedingFine("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString()
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}