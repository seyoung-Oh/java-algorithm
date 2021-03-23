package week_3_1;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<>();
		product1.setKind(new Tv("Tv"));
		product1.setModel("SmartTv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(tv.getName());
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car("Car"));
		product2.setModel("µðÁ©");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(car.getName());
		System.out.println(carModel);
	}

}
