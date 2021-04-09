package week5_2;
import java.util.*;
public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student,Integer> map = new HashMap<Student,Integer>();
		
		map.put(new Student(1, "È«±æµ¿"),95);
		map.put(new Student(1, "È«±æµ¿"),95);
		
		System.out.println("ÃÑ Entry ¼ö : "+ map.size());
	}

}
