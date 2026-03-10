package finalKeywordDemo;

public class FinalVariable {
	
	final void display()
	{
		System.out.println("Final method in Parent Class");
		
	}

	public static void main(String[] args) {
		
		final int s = 10;
		//s = 5; Final variable cannot be changed
		System.out.println(s);
		

	}

}
