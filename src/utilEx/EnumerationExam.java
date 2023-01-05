package utilEx;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExam {

	public static Collection<String> v;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("hi");
		v.add("hello");
		v.add("world");
		v.add("java");
		v.add("program");
		
		
		printToEnumeration(v.elements());
		
		
	}

	private static void printToEnumeration(Enumeration<String> elements) {
		// TODO Auto-generated method stub
		
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
//		for(int i = 0; i<=elements.le; i++) {								//내가 한거. 실패!
//			i++;
//			System.out.println(elements);
//		}
	}

}
