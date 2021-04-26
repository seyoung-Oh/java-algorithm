
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Member>function1 = Member::new;
		Member member1 = function1.apply("angel");
		
		BiFunction<String,String,Member> function2 = Member::new;
		Member member2 = function2.apply("천사", "angel");
	}

}
class Member{
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() 실행");
	}
	public Member(String id) {
		System.out.println("Member(String id) 실행");
		this.id = id;
	}
	public Member(String name, String id) {
		System.out.println("Member(String name,String id) 실행");
		this.name = name;
		this.id = id;
	}
	public String getId() {return id;}
}
