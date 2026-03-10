package inheritance;

public class HierarchicalChild2 extends HierarchicalParent {
	
	public void show()
	{
		System.out.println( "Second Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchicalChild2 ob = new HierarchicalChild2();
		ob.display();
		ob.show();

	}

}
