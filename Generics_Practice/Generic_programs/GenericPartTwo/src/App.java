import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Data<Object>> elements = new LinkedList<>();
		elements.add(new Data<Object>("Some text"));
		elements.add(new Data<Object>(1.0));
		elements.add(new Data<Object>(1));
		
		App app = new App();
		app.printList(elements);
		
	}
	
	void printList(List<Data<Object>> list) {
		ListIterator<Data<Object>> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+ iterator.next().getMyVariable());
		}
	}

}
