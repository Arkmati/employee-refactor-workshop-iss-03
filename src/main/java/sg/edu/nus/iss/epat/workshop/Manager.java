package sg.edu.nus.iss.epat.workshop;

public class Manager extends Employee {
	private float variableComponent;
	
	public Manager (String name, float salary, 
	         float variableComponent){
		super (name, salary);
		this.variableComponent=variableComponent;
	}

	@Override
	public float variableComponent(){
		return this.variableComponent;
	}

//	@Override
//	public float computeSalary(){
//		return getBaseSalary()
//				- computeDeductions() + variableComponent();
//	}
}

