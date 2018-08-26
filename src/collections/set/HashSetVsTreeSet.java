package collections.set;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetVsTreeSet {
	public static void main(String[] args) {
	HashSet<String> al=new HashSet<String>();
	al.add("uma");
	al.add("ramu");
	al.add("umaram");
	al.add("122.22f");
	//al.remove(1);
	//System.out.println("Hash set size:"+al.size());
	System.out.println(al);
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("uma");
	ts.add("ramu");
	ts.add("ammu");
	ts.add("umaram");
	ts.add("122.22f");
	//ts.remove(1);
	//System.out.println("Hash set size:"+ts.size());
	System.out.println(ts);
	
	}
}
