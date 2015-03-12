package projekt2;

import junit.framework.Assert;

import org.junit.Test;

public class TestEmployeeDetails {

	EmpBussinessLogic ebl = new EmpBussinessLogic();
	EmployeeDetails ed = new EmployeeDetails();
	
	@Test
	public void testCalculateAppraisal(){
		ed.setAge(10);
		ed.setMonthlySlary(1000);
		ed.setName("Weso³y Romek");
		ed.setWhatever("aaa");
		
		double appraisal = EmpBussinessLogic.calculateAppraisal(ed);
		Assert.assertEquals(500, appraisal, 0.0);
	}
	
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
