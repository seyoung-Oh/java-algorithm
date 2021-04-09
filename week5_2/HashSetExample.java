package week5_2;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"È«±æµ¿"));
		set.add(new Student(2,"Á¤¿øÈ£"));
		set.add(new Student(1,"±èÀÚ¹Ù"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()){
			Student std = iterator.next();
			System.out.println(std.studentNum + ":" + std.name);
		}
	}

}
