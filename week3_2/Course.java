package week3_2;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);
		//타입파라미터로 배열 생성 시, new T[n] 형태로 생성 불가
		//컴파일 과정이 아닌 실행과정에서 타입 파라미터가 정해지기 때문
	}
	public String getName() { return name;}
	public T[] getStudents() {return students;}
	//배열이 비어있는 부분을 찾아서 수강생을 추가하는 메서드
	
	public void add(T t) {
		for(int i =0;i<students.length;i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
}
