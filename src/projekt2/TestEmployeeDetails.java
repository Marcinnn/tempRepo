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
		ed.setWhatever("bbb");
		
		double appraisal = EmpBussinessLogic.calculateAppraisal(ed);
		Assert.assertEquals(500, appraisal, 0.0);
	}
}
