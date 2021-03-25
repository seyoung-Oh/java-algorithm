package week3_2;

public class Product<T,M> {
	private T kind;
	private M model;
	
	public T getKind() {return this.kind;}
	public M getModel() {return this.model;}
	
	public void setKind(T kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
}
class Tv{
	private String name;
	public Tv(String name) {
		this.name = name;
	}
	public String getName() {return this.name;}
}