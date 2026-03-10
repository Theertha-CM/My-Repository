package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList <String>();
		
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add(null);
		al.add("Red");		
		System.out.println(al);
		
		ArrayList <String> ar = new ArrayList <String>();
		
		ar.add("One");
		ar.add("Two");
		ar.add("Three");
		ar.add(null);
		ar.add("One");		
		System.out.println(ar);
		
		
		//--------------ITERATOR---------------------
		Iterator<String> it = ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		it.remove(); //Removes last element of the list
		System.out.println(ar);
		
		//--------------------------------------------
		
		//addAll() - To combine two collection
		al.addAll(ar);
		System.out.println(al);
		
		//containsAll() - To check whether a list is present in another list. It returns boolean.
		System.out.println(al.containsAll(ar)); //true
		System.out.println(ar.containsAll(al)); //false
		
		//clear() - To clear all the elements in a collection.
		al.clear();
		System.out.println(al);
		
		//Rest of the methods are same as in List
		
		
		

	}

}
