package inheritance;

public class MultiLevelChild extends MultiLevelIntermediate {
	
	public void show()
	{
		System.out.println("Child Class");
		int c = a+b;
		System.out.println("The sum of numbers inherited from Parent and Intermediate class : " + c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiLevelChild ob = new MultiLevelChild();
		ob.display();
		ob.print();
		ob.show();

	}

}
