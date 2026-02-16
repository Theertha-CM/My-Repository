package stringDemo;

public class BufferBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Hi");
		System.out.println(sb);
		StringBuffer sbs = new StringBuffer("Helloo");
		System.out.println(sbs);
		
		//insert() - To insert a new word or character to the present string based on the index position
		System.out.println(sb.insert(2, " Welcome"));
		System.out.println(sb); //sb changes to new value given
		
		//append() - To add a new string at the end of the current string.
		System.out.println(sb.append(sbs));
		System.out.println(sbs.append("World"));
		
		//replace() - To replace the character or word of a string based on the index position. Starting and ending index should be given.
		System.out.println(sb.replace(10,16, " String"));
		
		//delete() - To delete a character or word of  string based on starting and ending index position.
		System.out.println(sb.delete(11, 17));
		
		//reverse() - To reverse the string.
		System.out.println(sbs.reverse());

	}

}
