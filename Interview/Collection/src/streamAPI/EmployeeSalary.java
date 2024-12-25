package streamAPI;

public class EmployeeSalary {

	public Integer salary;
	public String name;
	
	public EmployeeSalary(Integer salary, String name) {
		
		this.salary = salary;
		this.name = name;
	}
	
	public Integer getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
}
