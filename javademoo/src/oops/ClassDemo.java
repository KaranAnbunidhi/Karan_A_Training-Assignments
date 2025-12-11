package oops;

class EmployeeDetails{
	int empID=1000;
	String empName="Kumar";
	float empSalary=55324.34f;
	void displayEmployeeDetails() {
		System.out.println("Employee Details:");
		System.out.println("EmpID: "+empID);
		System.out.println("EmpName: "+empName);
		System.out.println("EmpSalary: "+empSalary);
		
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employeeDetails=new EmployeeDetails();
		employeeDetails.displayEmployeeDetails();

	}

}
