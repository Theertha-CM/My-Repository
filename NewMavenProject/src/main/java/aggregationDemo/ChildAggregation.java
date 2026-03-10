package aggregationDemo;

public class ChildAggregation {
	
	String address;
	int zip;
	ParentAggregation ref; //Parent class reference created for aggregation
    
	
	ChildAggregation(String address, int zip, ParentAggregation ref) //Passing parent class ref variable in child class constructor as parameter.
	{
		this.address = address;
		this.zip = zip;
		this.ref = ref; //Initializing parent class ref using child class constructor
	}
	public void dispay()
	{
		System.out.println("Name : " + ref.name); //To print the values from ParentClass
		System.out.println("Roll_No : " + ref.roll_no); //To print the values from ParentClass
		System.out.println("Address : " + address);
		System.out.println("Zip Code : " + zip);

	}

	public static void main(String[] args) {
		
		
		
		ParentAggregation ob = new ParentAggregation("Theertha",28);//Creating Parent class object as the first line as we are passing it as an argument in display method.
		ChildAggregation obj = new ChildAggregation("Würzburg",97980,ob); //Passing arguments of constructor and parentclass object
		obj.dispay();
		
		

	}

}
