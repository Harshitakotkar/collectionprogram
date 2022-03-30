import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Programs {

	public static void main(String[] args) {
		Integer arr[]= {10,50,60,45,67,89,33,58,10,20};
		
		////How to convert array to arraylist
		ArrayList<Integer> al=  new ArrayList(Arrays.asList(arr));
		al.add(20);
		System.out.println(al);
	      Collections.reverse(al);

	
	/////how to convert array to hashset///
	 HashSet hs=new HashSet(Arrays.asList(arr));
	 System.out.println(hs);
	 /////convert array to hashset using collectons.addAll method
	 HashSet<Integer> hs1=new HashSet();
	 Collections.addAll(hs1,arr);
	 System.out.println(hs1);
	 
	 /////how to convert HashSet into array
	 HashSet<Integer> hs2=new HashSet();
	 hs2.add(18);
	 hs2.add(25);
	 hs2.add(90);
	 hs2.add(56);
	 
	 LinkedHashSet <String> lhs=new LinkedHashSet();
	 lhs.add("reema");
	 lhs.add("teena");
	 lhs.add("meena");
	 lhs.add("sona");
	 lhs.add("rina");
	 lhs.add("meena");
	 lhs.add(null);
	 System.out.println(lhs);
	 
	 Student priya=new Student(12,"priya",80);
	 Student pooja=new Student(9,"pooja" ,85);
	 Student nisha=new Student(57,"nisha",79);
	 
	 SortedSet<Student> list=new TreeSet<Student>(new MarksComparator());
	 list.add(priya);
	 list.add(pooja);
	 list.add(nisha);
	
	 System.out.println(list);
	 
	 Iterator<Student> it=list.iterator();
	 
	 while(it.hasNext()) {
		 Student s=it.next();
		System.out.println(s.name); 
	 }
	 
	}
	
}
