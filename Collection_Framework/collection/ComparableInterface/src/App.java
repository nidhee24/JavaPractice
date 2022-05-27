import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {

	private String name;
	
	
	public Names(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return name;
	}


	@Override
	public int compareTo(Names obj) {
		// TODO Auto-generated method stub
		if(name.length() == obj.name.length()) {
			return 0;
		}
		else if(name.length() < obj.name.length()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	 
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<String> countries = new LinkedList<>();
//		countries.add("India");
//		countries.add("Canada");
//		countries.add("USA");
//		countries.add("Russia");
//		
//		System.out.println("******Using list iterator****");
//		new App().displayList(countries);
//		
//		
//		System.out.println("********************");
//		Collections.sort(countries);
//		new App().displayList(countries);
		
		List<Names> name = new LinkedList<>();
		name.add(new Names("Nidhi"));
		name.add(new Names("Sunny"));
		name.add(new Names("Jeni"));
		name.add(new Names("Janvi"));
		name.add(new Names("Manya"));
		
		
		//using List<Object> if we need not want to restrict to only Names type
		List<Object> elements = new LinkedList<>();
		elements.add(new Names("Nidhi"));
		elements.add(new Names("Shaheera"));
		elements.add(new Names("Palak"));
		elements.add("Some String");
		elements.add(1);
		elements.add("$");
		
		
		
		App app = new App();
		app.displayList(name);
		
		Collections.sort(name);
		System.out.println("*************");
		app.displayList(name);
		
		System.out.println("******************");
		app.printList(elements);
	}
	
	void displayList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+iterator.next());
		}
	}
		void printList(List<Object> list) {
			ListIterator<Object> iterator = list.listIterator();
			while(iterator.hasNext()) {
				System.out.println("Element: "+iterator.next());
			}
	}

}
