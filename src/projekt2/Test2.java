package projekt2;

import junit.framework.Assert;

import org.junit.Test;

public class Test2 {
	
	EmployeeDetails ed = new EmployeeDetails();

	@Test
	public void testCalculateYearlySalary(){
		ed.setAge(10);
		ed.setMonthlySlary(1000);
		ed.setName("Weso³y Romek");
		ed.setWhatever("aaa");
		
		double ys = EmpBussinessLogic.calculateYearlySalary(ed);
		
		Assert.assertEquals(12000, ys, 0.0);
	}
}
