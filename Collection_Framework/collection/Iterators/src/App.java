import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("Canada");
		countries.add("USA");
		countries.add("Russia");
		System.out.println("******Using  iterator******");
		new App().printList(countries);
		System.out.println("******Using list iterator****");
		new App().displayList(countries);
		
		//sorting
		System.out.println("****************************");
		countries.sort(null);
		new App().displayList(countries);
		
		System.out.println("****************************");
		Collections.reverse(countries);
		new App().displayList(countries);
	}
	
	//ListIterator interface can also be use to iterate list 

	void printList(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+iterator.next());
		}
	}
	
	void displayList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+iterator.next());
		}
	}
}
