package collections;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Arraylist {
	void Al() {
		ArrayList<String> name = new ArrayList(); // arraylist
		name.add("dhileepan");
		name.add("vijay");

		System.out.println("normal :" + name); // prints as array

		System.out.println("\n");
		for (String n1 : name) {
			System.out.println(n1); // print one by one
		}
		System.out.println("\n");
		ArrayList names = new ArrayList<>();
		names.add("Dhileepan");
		names.add("vijay");
		names.add(15);
		names.add(15.55);
		names.add('c');

		System.out.println("Before iterate :" + names);
		System.out.println("\n");
		Iterator i = names.iterator(); // print using iterate
		System.out.println("\n");
		while (i.hasNext()) {

			System.out.println("After iterator :" + i.next());
		}

		ListIterator li = names.listIterator(names.size());
		System.out.println("\n");

		while (li.hasPrevious()) { // print down to up

			System.out.println("Listiterator :" + li.previous());
		}

		while (li.hasNext()) {
			if (li.next().equals(15)) {
				li.set(100); // set 100 if 15 placed

			}

		}
		System.out.println("\n");
		System.out.println(names);
		names.remove(15.55); // remove 15.55 value
		System.out.println("\n");
		System.out.println(names);

		names.remove(0); // remove 0th index
		System.out.println("\n");
		System.out.println(names);

		ArrayList names1 = new ArrayList<>();
		names1.add("Ganguly");
		names1.add("Sachin");
		names1.addAll(names); // add all the elements of names
		System.out.println("addall" + names1);
		names1.clear(); // clear all the elements
		System.out.println(names1.isEmpty()); // true because last line clear the all elements
		System.out.println("Size of names1 :" + names1.size()); // size of array
		System.out.println("Size of names1 :" + names.size());

	}

}

class Linkedlist1 {
	void Linked() {
		LinkedList link = new LinkedList();
		link.add("Dhileepan");
		link.add(15);
		link.add(0, "DHILEEP");
		link.addLast("Last");
		link.addFirst("first");
		link.add(null); // accept duplicate null values
		link.add(null);
		System.out.println("\n");
		System.out.println("linkedlist :" + link);
		Iterator it = link.iterator();
		System.out.println("\n");
		while (it.hasNext()) {

			System.out.println("Linkedlist :" + it.next());
		}
		link.removeFirst();
		System.out.println("Removed first :"+link);
		link.removeLast();
		System.out.println("Remove Last :"+link);
		link.removeFirstOccurrence("Last");
		System.out.println("Remove First occurcnce"+link);
	}
}

class Vector1 {
	void vectorM() {
		Vector vc = new Vector();
		vc.add("Dhileepan :");
		vc.add(1, 30);
		vc.add(50);

		System.out.println("\n");

		System.out.println("vector :" + vc);
		vc.remove(0);
		System.out.println(vc);

		Iterator v = vc.iterator();
		System.out.println("\n");
		while (v.hasNext()) {
			System.out.println("after iterator :" + v.next());
		}

	}
}

class Sort
{
	void sort1()
	{
		ArrayList<String> al1=new ArrayList<>();
		al1.add("ABCD");
		al1.add("abcd");
		al1.add("cat");
		al1.add("Good");
		al1.add("no");
		al1.add("Nothing");
		al1.add("Bad");
		Collections.sort(al1);
		for(String s:al1) {
		System.out.println("Sort :"+s);}
	}
}
class Stack1 {
	void stackm() {
		Stack st = new Stack();
		st.push("Shadowws");
		st.push(305);
		st.push(5.55);
		st.push("karthi");
		st.push("gambhir");
		st.push("abcd");

		Iterator si = st.iterator();
		while (si.hasNext()) {
			System.out.println(si.next());
		}
		System.out.println(st.peek()); // print the 0th element as ascending order
		st.pop(); // eliminate last line

		System.out.println(st);

	}
}

public class List {
	public static void main(String[] args) {
		Arraylist al = new Arraylist();
		al.Al();
		Linkedlist1 l1 = new Linkedlist1();
		l1.Linked();
		Vector1 v1 = new Vector1();
		v1.vectorM();
		Stack1 s = new Stack1();
		s.stackm();
		Sort s1=new Sort();
		s1.sort1();
	}

}
