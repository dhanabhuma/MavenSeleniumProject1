package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class arraylistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrname=new ArrayList<String>();
		arrname.add("dhana");
		arrname.add("bhuma");
		arrname.add("gupta");
		arrname.add("sadhana");
		arrname.add("subodh");
		for (String s1: arrname) {
			System.out.println(s1);
		}
		int length=arrname.size();
		System.out.println("size of array is"+length);
		arrname.set(1, "kanigi");
		System.out.println(arrname.get(1));
		arrname.remove(2);
		
		for(String s1: arrname) {
			System.out.println((s1));
		}
		Collections.sort(arrname);
		for(String s1: arrname) {
			System.out.println((s1));
		}
		HashSet<Integer> intarr=new HashSet<Integer>();
		intarr.add(4);
		intarr.add(5);
		intarr.add(6);
		intarr.add(6);
		for(Integer i: intarr) {
			System.out.println(i);
		}
		
	}

}
