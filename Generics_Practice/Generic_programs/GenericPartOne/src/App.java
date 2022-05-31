
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Data data = new Data("Some String");
//		String variable = (String) data.getObj();
//		///Need to cast data
//		System.out.println(variable);
		
		//typecast low down performance
		
		GenericClass<String> genericData = new GenericClass<String>("Some data");
		String data  =  genericData.getData();
		System.out.println(data);
	}

}
