package stringDemo;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Maven";
		String s1 = new String("First Program");
		System.out.println(s+ " "+s1);
		
		//charAt() - To return a character from a string based on the specified index position
		System.out.println(s.charAt(5)); // Return the value stored at 5th index of the string s.
		System.out.println(s1.charAt(6));
		
		//length() - To return the length of the string.
		System.out.println(s.length());
		System.out.println(s1.length());
		
		//concat() - To do string concatenation(Adding a new string to the existing string)
		System.out.println(s.concat(s1));
		System.out.println(s1.concat(" is running"));
		System.out.println(s);
		
		//contains() - To check whether a word or character is present in the string. It is case sensitive. If present, returns True. Else returns False.
		System.out.println(s.contains("Maven")); //true
		System.out.println(s1.contains("first")); //false. Case sensitive
		
		//isEmpty() - To check whether a String is empty or not. Returns true if empty, else returns false.
		System.out.println(s.isEmpty()); //false
		String s2 = "";
		System.out.println(s2.isEmpty()); //true
		
		//toUpperCase() - To convert the lowercase letters to uppercase letters in a string.
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		
		//toLowerCase() - To convert the uppercase letters to lowercase letters in a string.
		System.out.println(s.toLowerCase());
		System.out.println(s1.toLowerCase());
		
		//valueOf() - To convert any datatype to String. (Not a typecasting)
		int a = 69;
		System.out.println(String.valueOf(a));
		double d = 568.5869235d;
		System.out.println(String.valueOf(d));
		
		//equals() - To check whether two strings are equal or not. Returns true if equal, else returns false. Case sensitive
		String x = "Java";
		String y = "java";
		String z = "java";
		String t = new String("java");
		String u = new String("java");
		
		System.out.println(x.equals(y)); //false. Case sensitive
		System.out.println(t.equals(u)); //true
		
		//equalsIgnoreCase() - It ignores the case and check whether two strings are equal or not.
		System.out.println(x.equalsIgnoreCase(y)); //true. Only checks the value.
		
		//== operator is used to compare object references, means it checks if two variables point to the same memory location. On the other hand equals() method is used to compare the value of objects.
		System.out.println(y==z); //true
		System.out.println(t==u); //false
		
		//trim() - It is used to remove the leading and trailing spaces.(Unwanted spaces at the beginning and end. Spaces in between the string is not removed)
		String r = "  I'm learning Java  ";
		System.out.println(r.trim());
		
		//subString() - It is used to extract a part of the String
		System.out.println(r.substring(6)); //It will print the string starting from index 6
		System.out.println(r.substring(6, 14)); //It will print the string starting from index 6 upto index 13 (14-1)
		
		
		}
}


