import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class E07_JsonSimple {
	
	// gogle 'maven repo' �˻� -> �ڹ� ���̺귯������ ���ִ� ����Ʈ
	
	// # �ܺ� ���̺귯�� �߰� ���
	//	Build path -> Configure BuildPath -> Lib Tab -> Add External Jar file
	
	public static void main(String[] args) {
		
		// map ó�� �����͸� �߰��Ѵ�
		JSONObject obj = new JSONObject();
		
		// JSON �迭�� ����� ���ؼ��� ArrayList�� ����ؾ� �Ѵ�
		ArrayList<String> arr = new ArrayList<>();

		arr.add("Programming");
		arr.add("Fishing");
		arr.add("Billiards");
		
		obj.put("car", "BMW");
		obj.put("addr", "��õ��");
		obj.put("age", 27);
		obj.put("hobbies", arr);
		
		// toString�� �����Ǿ� �ִ�
		System.out.println(obj);
		String jsonStr =obj.toString();
		
		System.out.println(jsonStr);
		
		JSONParser parser = new JSONParser();
		
		
		try {
			JSONObject obj2 = (JSONObject) parser.parse(new FileReader("D:\\java_io\\data.json"));
			
			System.out.println(obj2.get("��"));
			System.out.println(obj2.get("��"));
			System.out.println(obj2.get("��"));
			
			JSONArray hobbies = (JSONArray)(obj2.get("hobbies"));
			
			for(Object hobby : hobbies) {
				System.out.println(hobby);
			}
			
			// JSONObject ������ JSONObject ����ϱ�
			JSONObject minsu = (JSONObject) obj2.get("�μ�");
			
			System.out.println(minsu);
			System.out.println(minsu.get("���� �����ϴ� �峭��"));
			System.out.println(minsu.get("����"));
			
			// JSON - ������ ������ Map�� ������ �� �ִ� ���ڿ� (�����ϱ� ���� ����)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
