package week2_2;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(readString());
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static String readString() throws IOException{
		byte[]buf = new byte[10];
		System.out.println("문자열을 입력하시오 : ");
		System.in.read(buf);
		return new String(buf);
	}

}
