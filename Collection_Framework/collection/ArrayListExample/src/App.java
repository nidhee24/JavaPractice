import java.util.ArrayList;

public class App {

	static ArrayList<String> listNames = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		listNames.add("Nidhi");
		listNames.add("Jeni");
		listNames.add("Meet");
		listNames.add("Manya");
		listNames.add("Karan");
		listNames.add("Krina");
		
		App app = new App();
		app.displayList(listNames);
		app.removeNameByIndex(0);
		System.out.println("************after removing********");
		app.displayList(listNames);
		
		app.modifyName(1, "Krupali");
		System.out.println("************after modifying********");
		app.displayList(listNames);
		
		int position = app.search("Krupali");
		if(position != -1) {
			app.modifyName(position, "Meet");
			System.out.println("************after searching and modifying********");
			app.displayList(listNames);
		}
		else {
			System.out.println("Invalid Entry");
		}
	}
	
	void displayList(ArrayList<String> list) {
		for(String name: list) {
			System.out.println(name);
		}
	}
	
	void removeNameByIndex(int index) {
		listNames.remove(index);
	}
	void removeNameByString(String name) {
		listNames.remove(name);
	}
	
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}
	
	int search(String name) {
		return listNames.indexOf(name);
	}
}
