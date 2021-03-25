package week3_2;

public class ChildProductAndStorageImplEx {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv("A"));
		product.setModel("SmartTv");
		product.setCompany("Samsung");
		
		Tv A = product.getKind();
		
		System.out.println(A.getName());
		System.out.println(product.getModel());
		System.out.println(product.getCompany());
		System.out.println();
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);//100개의 Tv타입 배열을 생성
		storage.add(new Tv("B"), 0);
		Tv tv = storage.get(0);
		
		System.out.println(tv); //배열이 저장된 위치가 출력됨, 이름 출력하고 싶으면 따로 메소드 만들어야함

	}

}
