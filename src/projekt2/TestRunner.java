package projekt2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

	public static void main(String[] args) {
		
		Result res = JUnitCore.runClasses(TestEmployeeDetails.class);
		System.out.println(1);
	}

}
