package firstmonth.java;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("java");
		set.add("collections");
		set.add("java");
		set.add("set");
		Iterator<String>i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
