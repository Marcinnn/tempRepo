package projekt2;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

@RunWith(org.junit.runners.Parameterized.class)
public class ParametrizedTest {
	
	private int salary;
	private int result;
	
	@Parameters
	public static Collection salaries(){
		return Arrays.asList(new Object[][]{
				{500, 500},
				{5000, 500},
				{10000, 1000},
				{15000, 1000},
				{21321, 1000},
				{11111, 1000}
		});
	}
	
	public ParametrizedTest(int salary, int result){
		this.salary = salary;
		this.result = result;
		String nazwa = "coœ innego";
		System.out.println(nazwa);
	}
	
	private void zlo(String nienawisc){
		nienawisc = "z³o";
	}
	
	@Test
	public void testIt(){
		Assert.assertEquals(result, EmpBussinessLogic.calculateAppraisal(salary), 0.0);
	}
}
