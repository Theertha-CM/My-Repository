package collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("BMW");
		s.add("Audi");
		s.add("Benz");
		s.add(null);
		s.add("BMW");
		s.add(null);
		
		System.out.println(s);
		
		//Set is not an index based collection and hence the elements are un-ordered. It doesn't support repetetive elements. Only one will be fetched. 
		//So Set doesn't supports index related methods as well.
		
		//remove() - To remove elements based on the object
		s.remove("BMW");
		System.out.println(s);
				
		//contains() - To check whether an element is present or not in the list.
		System.out.println(s.contains(null));
		System.out.println(s.contains("Audi"));
				
		//isEmpty() - To check whether the list is empty or not.
		System.out.println(s.isEmpty());
				
		//size() - To find the length/size of the list
		System.out.println(s.size());
		
		
		
		
	}

}
