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
		System.out.println("���ڿ��� �Է��Ͻÿ� : ");
		System.in.read(buf);
		return new String(buf);
	}

}
