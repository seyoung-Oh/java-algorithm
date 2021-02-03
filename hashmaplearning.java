import java.util.*;

public class hashmaplearning {
	public static void main(String[] args) throws Exception
	{
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "���");
		map1.put(2, "�ٳ���");
		map1.put(3,"����");
		
		map1.remove(3);
		map1.clear();
		
		map1.put(1,"������");
		map1.put(2,"Ű��");
		map1.put(3,"���ξ���");
		
		Iterator<Map.Entry<Integer,String>> entries = map1.entrySet().iterator();
		
		while(entries.hasNext())
		{
			Map.Entry<Integer, String> entry = entries.next();
			System.out.println("[Key]: "+entry.getKey() + " [Value]:"+ entry.getValue());
		}
		
		Iterator<Integer> keys = map1.keySet().iterator();
		while(keys.hasNext())
		{
			int key = keys.next();
			System.out.println("[Key]: "+ key+" [Value]:"+ map1.get(key));
		}
	}
}
