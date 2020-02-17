package ignore;

import assignment_01.App;

public class TestingUtils {
	public static void runTests(){
		

		String [] params1 = {"12345","apple","tiger","candy","add","ad","a","","del","denny","sfveaadelbb"};
		String  [] expected = {"234","ppl","ige","and","add","ad","a","","del","enn","aad"};
        
		for(int i=0; i < params1.length; i++){
			String result = App.middleThree(params1[i]);
			if(result.equals(expected[i])) {
				System.out.println(printPassResult(params1[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(Object params1, Object expected, Object result){
		return "PASS: middleThree("+ params1.toString()+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(Object params1, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: middleThree("+ params1.toString()+ ") -> " + result.toString() 
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}
}