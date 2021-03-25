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
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);//100���� TvŸ�� �迭�� ����
		storage.add(new Tv("B"), 0);
		Tv tv = storage.get(0);
		
		System.out.println(tv); //�迭�� ����� ��ġ�� ��µ�, �̸� ����ϰ� ������ ���� �޼ҵ� ��������

	}

}
