package sg.edu.nus.iss.epat.workshop;

public abstract class Employee {
	private String name;
	private float salary;
	
	protected Employee (String name, float salary){
		this.name = name;
		this.salary = salary;
	}
	
	public float getBaseSalary() { return salary; }
	public String getName() { return name;}
	public float computeDeductions() { return salary*0.2f;}
//	public abstract float computeSalary();
	protected abstract float variableComponent();

	public float computeSalary(){
		return getBaseSalary()
				- computeDeductions() + variableComponent();
	}
}

