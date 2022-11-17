package string;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Strings {

	public static void main(String[] args) {
		Strings st = new Strings();
		System.out.println("object" + st);

//		st.name(); // String methods
//
//		st.CountOfWords();
//
//		st.CountOfVowels();

		st.strings(); // String methods and buffers
	}

	private void name() {

		System.out.println("Enter your First name :");
		Scanner scanner = new Scanner(System.in);
		String fName = scanner.nextLine();

		System.out.println("Enter your Second name :");
		String sName = scanner.nextLine();

		System.out.println("THE NAME :" + fName);
		System.out.println("THE NAME :" + sName);

		String fullName = fName + " " + sName;
		System.out.println("Fullname :" + fullName);

		System.out.println(fullName.length());
	}

	private void strings() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name :");
		String name = sc.nextLine();

		System.out.println(name);
		try {
			System.out.println(name.contains("Dhil"));
		
			System.out.println("To UPPERCASE :" + name.toUpperCase());
			
			System.out.println("To LOWERCASE :" + name.toLowerCase());
			
			System.out.println(name.endsWith("pan"));
			
			System.out.println(name.startsWith("Dhi"));
			
			System.out.println(name.trim());
			
			System.out.println(name.charAt(0));
			
			String names = name.intern(); // names equal to the name
			
			System.out.println(names);
			
			System.out.println(names.valueOf(name + 10));
			
			String s1 = "kava is a object oriented programming language";
			
			System.out.println(s1.replace("kava", "java"));
			
			System.out.println(name.charAt(5));
			
			System.out.println(name.compareTo("Chilee"));
			
			System.out.println(name.concat(" Chinnaraj").concat(" C"));
			
			System.out.println(name.equals("Dhileepan")); // if name DHILEEPAN result becomes false
			
			System.out.println(name.equalsIgnoreCase("dhileepan")); // if name DHILEEPAN result becomes true
			
			byte n1[] = name.getBytes(); // get ASCII value for the String array
			
			for (byte n2 : n1)
				System.out.println(n2);
			
			String n2 = "The eclipse was so good";

			System.out.println(n2.replaceAll("", " "));
			
			String n4 = "Java is a object oriented programming language";
			
			String arr[] = n4.split(" "); // split sentence by space
			
			for (String nw : arr)
				System.out.println(nw);
			
			char sr[] = n4.toCharArray(); // split the sentence by char
			
			for (char nc : sr)
				System.out.println(nc);
		}
		catch (NullPointerException ne) {
		
			System.out.println("Please check the replace value");
		} 
		catch (PatternSyntaxException ps) {
		
			System.out.println("You are entered invalid value");
		}

		// String Buffer

		try {
			StringBuffer sb = new StringBuffer(name);
			
			System.out.println(sb.append("C"));
			
			System.out.println(sb.insert(10, "Chinnaraj"));
			
			System.out.println(sb.delete(7, 10));
			
			System.out.println(sb.reverse());
			
			System.out.println(sb.capacity());
			
			System.out.println(sb.indexOf("p"));
			
			System.out.println(sb.reverse());

			
		} catch (StringIndexOutOfBoundsException sie) {
			System.out.println("Please check index number");
		}
		// if name is Dhileepan result becomes 1 because C placed before D
	}

	public void CountOfWords() {

		String fullName = "Dhileepan C";

		int i = 0;
		int count1 = 0;

		while (i < fullName.length()) {
			if (fullName.charAt(i) == ' ') {
				count1++;
			}
			i++;
		}
		System.out.println("No of Words :" + count1);

	}

	public void CountOfVowels() {
		String fullName = "Dhileepan";

		int i = 0;
		int count = 0;
		while (i < fullName.length()) {
			char name = fullName.charAt(i);
			switch (name) {
			case ('a'):
				count++;
				break;

			case ('e'):
				count++;
				break;

			case ('i'):
				count++;
				break;

			case ('o'):
				count++;
				break;

			case ('u'):
				count++;
				break;
			}
			i++;
		}
		System.out.println("No Of Vowels :" + count);
	}

}
