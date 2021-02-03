import java.util.*;

public class hashmaplearning {
	public static void main(String[] args) throws Exception
	{
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "사과");
		map1.put(2, "바나나");
		map1.put(3,"포도");
		
		map1.remove(3);
		map1.clear();
		
		map1.put(1,"복숭아");
		map1.put(2,"키위");
		map1.put(3,"파인애플");
		
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
