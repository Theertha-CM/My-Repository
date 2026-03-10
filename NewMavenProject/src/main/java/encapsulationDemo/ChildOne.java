package encapsulationDemo;

public class ChildOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentOne ob = new ParentOne();
		ob.setUsername("Theertha CM");
		System.out.println("Username : "+ob.getUsername());
		ob.setPwd("TH12345TH");
		System.out.println("Pwd : "+ob.getPwd());

	}

}
