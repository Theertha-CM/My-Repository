package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List <String> li = new ArrayList<String>();
		//System.out.println(li);
		
		//add() - To add elements or objects in the collection
		li.add("BLUE");
		li.add("GREEN");
		li.add("RED");
		li.add(null);
		li.add("RED");
		li.add(null);
		
		System.out.println(li);
		
		//indexOf() - To return the index of particular element or object. If there are repeated occurences of a same element, it will return the index of its first occurence.
		System.out.println(li.indexOf("RED"));
		
		//lastIndexOf() - To return the last index of a particular element if it has repeated occurences. If there is no repetetion, then it will print the original index.
		System.out.println(li.lastIndexOf("RED"));
		
		//remove() - To remove elements based on the index position and object
		System.out.println(li.remove(2)); //Based on index.
		System.out.println(li.remove("GREEN")); //Based on the object. We can remove the particular element.
		
		//get() - To retrieve an element in the list based on the index position.
		System.out.println(li.get(0));
		
		//contains() - To check whether an element is present or not in the list.
		System.out.println(li.contains(null));
		System.out.println(li.contains("GREEN"));
		
		//isEmpty() - To check whether the list is empty or not.
		System.out.println(li.isEmpty());
		
		//size() - To find the length/size of the list
		System.out.println(li.size());
		
		for(int i = 0; i<li.size(); i++) // To print the elements in the list through iteration using for loop
		{
			System.out.println(li.get(i));
		}
		
		for(String str : li) // To print the elements in the list through for each loop
		{
			System.out.println(str);
		}
		
		
	}

}
