package week1day2;

public class EmployeeDetails {
	public String printEmployeeName(String empName){
		return empName;
	}
	public String getEmployeeAddress(String empAddress) {
		return empAddress;
	}
	public double employeeSalary(double employeeSalary) {
		return employeeSalary;
	}
public long mobNum(long mobNum) {
	return mobNum;
}
public static void main(String[] args) {
	EmployeeDetails Emp=new EmployeeDetails();
	String empName=Emp.printEmployeeName("Sakthi");
	System.out.println(empName);
	String empAddress=Emp.getEmployeeAddress("Chennai");
	System.out.println(empAddress);
	double employeeSalary=Emp.employeeSalary(4254.2545);
	System.out.println(employeeSalary);
	long mobNum=Emp.mobNum(9845155254852L);
	System.out.println(mobNum);



}
}
