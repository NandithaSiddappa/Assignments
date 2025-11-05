package Assignments3;

public class EmpGroups {

	public static void main(String[] args) {
		
		//create another class called EmpGroups that contains two arrays to store the employee names
		 //and IDs.
		
		
	
		String [] Employeename = new String [3];
		int [] EmployeeID = new int[3];
		
		//creating object "emp" in order to retrieve data from class Employees
		
		Employees emp = new Employees();
		
		Employeename [0] = emp.empname1;
		Employeename [1] = emp.empname2;
		Employeename [2] = emp.empname3;
		
		EmployeeID [0] = emp.empid1;
		EmployeeID [1] = emp.empid2;
		EmployeeID [2] = emp.empid3;
		
		//Print Employee name and Employee ID
		
		System.out.println ("Employee name is :" +emp.empname1);
		System.out.println ("Employee ID is :" +emp.empid1);
		
		
		
		

	}

}
