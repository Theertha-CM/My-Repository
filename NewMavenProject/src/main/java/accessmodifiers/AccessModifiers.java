package accessmodifiers;

public class AccessModifiers {
	
	public void publicMethod()
	{
		System.out.println("Public Method");
		
	}
	
	private void privateMethod()
	{
		System.out.println("Private Method");
		
	}
	
	protected void protectMethod()
	{
		System.out.println("Protected Method");
		
	}
	
	void defaultMethod()
	{
		System.out.println("Default Method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers obj = new AccessModifiers();
		
		obj.publicMethod();
		obj.privateMethod();
		obj.protectMethod();
		obj.defaultMethod();
	}

}
