package sg.edu.nus.iss.epat.workshop;

public class SalesEmployee extends Employee {
	private float commissionRate;
	private float salesMade;
	
	public SalesEmployee (String name, float salary, 
	      float commissionRate, int salesMade){
		super(name, salary);
		this.commissionRate = commissionRate;
		this.salesMade = salesMade;
	}

	@Override
	public float variableComponent(){
		return salesMade*commissionRate;
	}

//	@Override
//	public float computeSalary(){
//		return getBaseSalary()
//				- computeDeductions() + variableComponent();
//	}
}
