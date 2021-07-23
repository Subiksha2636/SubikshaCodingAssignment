package com.subis.day7;

class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	Employee() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeApp {

	
	public  String  getEmployeeInfo(String str) {
		


		String name=str.substring(0,str.indexOf("@"));
		 
		String ssn=str.substring(str.indexOf("@")+1, str.indexOf("-"));
	
		String dept=str.substring(str.indexOf("-")+1,str.indexOf("#"));
		String salary=str.substring(str.indexOf("#")+1, str.length());
		
	    Employee employee=new Employee(name,ssn,dept,Integer.parseInt(salary));
	    String s=employee.toString();
		return s;
				
	}
	String getEmployeeLevel(Employee e) {

		int ssn=Integer.parseInt(e.getSsn());
		if(ssn>=1 && ssn<=10)
			return "L1";
		else if(ssn>=61 && ssn<=120)
			return "L2";
		else if(ssn>=121 && ssn<=180)
			return "L3";
		else 
			return "L4";



		
			
	}
	public static void main(String[] args) {
		EmployeeApp e=new EmployeeApp();
		System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println(e.getEmployeeLevel(new Employee("abc","4356","uuuii",9889)));
		
	}
}
 