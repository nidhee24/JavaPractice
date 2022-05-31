
public class GenericClass<T> {
	
	private T data;  // don't know type but T indicates any type
	

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
	

	
}
