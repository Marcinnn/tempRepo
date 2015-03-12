package projekt2;

public class EmpBussinessLogic {

	public static double calculateYearlySalary(EmployeeDetails empDetails){
		return empDetails.getMonthlySlary()*12;
	}
	
	public static double calculateAppraisal(EmployeeDetails empDetails){
		if(empDetails.getMonthlySlary() < 10000)
			return 500;
		else
			return 1000;
	}
}
