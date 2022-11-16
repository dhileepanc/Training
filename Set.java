package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class HAshSet {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Tendulkar");
		hs.add("Dravit");
		hs.add("Laxman");
		hs.add("Ganguly");
		System.out.println(hs);
		hs.add("Dravit"); // adding duplicate
		System.out.println(hs); // cannot accept duplicate
		for(String e:hs)
			System.out.println(e);
		
		HashSet hs1=new HashSet<>();
		hs1.add("Zaheer");
		hs1.add("nehra");
		hs1.addAll(hs);
		System.out.println(hs1);
		hs1.remove("Zaheer");
		System.out.println(hs1);
		

		TreeSet ts=new TreeSet<>();
		ts.add("Vijay");
		ts.add("Rajinikanth");
		ts.add("kamalhasan");
		ts.add("Surya");
		
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println("Treeset :"+it.next()); // Ascending order // Camel case
		}
		
		Iterator tds=ts.descendingIterator();  //descending iterator
		System.out.println("\n");
		while(tds.hasNext())
		{
			System.out.println("Treeset :"+tds.next());
		}
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	
		TreeSet<Integer> ti=new TreeSet<Integer>();
		ti.add(50);
		ti.add(60);
		ti.add(10);
		ti.add(0);
		ti.add(5000);
		System.out.println("Highest value :"+ti.pollLast());
		System.out.println("Lowest value :"+ti.pollFirst());
		System.out.println();
	
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		lh.add(50);
		lh.add(30);
		lh.add(60);
		lh.add(80);
		for(int lh1:lh)
		{
			System.out.println("Ordered set :"+lh1);
		}
		
		
		LinkedList ll=new LinkedList<>();
		ll.add("Dhileepan");
		ll.add(50);
		ll.add("chinnaraj");
		ll.add(50);
		
		System.out.println(ll);
		
		
		LinkedHashSet lhs=new LinkedHashSet(ll); // duplicates removed
				System.out.println("After Removing Duplicates :"+lhs);
				
				ArrayList names = new ArrayList<>();
				names.add("Dhileepan");
				names.add("vijay");
				names.add("karthi");
				names.add("Dhileepan");
//				names.add(15);
//				names.add(15.55);
//				names.add('c');
				
				TreeSet tis=new TreeSet(names);
				System.out.println(tis);
	}
	

}
