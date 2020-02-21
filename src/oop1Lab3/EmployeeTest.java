package oop1Lab3;

public class EmployeeTest {
	

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId("123");
		e1.setName("John");
		e1.setSalary(100000);
		e1.showinfo();
		
		Employee e2 = new Employee("235", "Rony", 20000);
		e2.showinfo();
		
		
		

	}

}
