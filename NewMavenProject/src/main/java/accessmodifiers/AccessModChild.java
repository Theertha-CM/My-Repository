package accessmodifiers;

public class AccessModChild extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModChild ob = new AccessModChild();
		ob.defaultMethod();
		ob.protectMethod();
		ob.publicMethod();
		//ob.privateMethod(); - Private methods are not visible and accessible outside the class in which it is declared.

	}

}
