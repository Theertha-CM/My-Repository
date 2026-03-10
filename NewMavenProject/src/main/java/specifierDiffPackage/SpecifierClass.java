package specifierDiffPackage;

import accessmodifiers.AccessModifiers;

public class SpecifierClass extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpecifierClass ob1 = new SpecifierClass();
		ob1.protectMethod(); // Can access protected method only with child class object if it is outside the parent package 
		ob1.publicMethod();
		
		/* ob.defaultMethod();
		   ob.privateMethod(); These two methods are not accessible outside the parent package*/
		
		AccessModifiers ob2 = new AccessModifiers(); //Parent class object
		ob2.publicMethod();
	}

}
