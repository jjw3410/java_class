import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;




public class E06_JSON {
	
	// # JSON
	//	- JavaScript���� ����ϴ� Map Ÿ��
	//	- ���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����
	//	- { Key : Value , Key : Value }�� ���¸� ������
	
	// # JSON Value�� ���Ǵ� �ڹٽ�ũ��Ʈ Ÿ�Ե�
	//	- '' ,	""	: String
	// 	- ����, �Ҽ� 	: NumberŸ��
	//	-    []		: Array
	//	-    {}		: JSON
	
	// # JAVA���� JSONŸ���� �������� �ʱ� ������ ���ڿ� �����͵���
	//	�����͵��� JSON ������ ���ڿ��� �������� �Ѵ� (Parsing, Binding)
	
	public static void mapToJsonFile(Map<String, Object> map) throws IOException {
		StringBuilder builder = new StringBuilder();
		
		builder.append("{\n");
		
		int count = 0;
		int size = map.size() -1;
		
		for (Map.Entry<String,Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			builder.append("\t\"" + key + "\"\t: ");
			
			if (value == null) {
				builder.append("null");
			}
			else if (value instanceof String) {
				builder.append("'"+value + "'");
			}
			else if (value instanceof Object[]) {
				Object[] arr = (Object[])value;
				
				if (arr.length == 0) {
					builder.append("[]");
				}
				if (arr instanceof String[]) {
					builder.append("[");
					
					int len = arr.length;
					
					int lencount = 0;
					
					for (Object obj : arr) {
						builder.append("'" + obj + "'");
						
						if (lencount++ == len-1) {
							builder.append("]");
						}
						else {
							builder.append(", ");
						}
					}
					
				}
				else {
					builder.append("[others]");
				}
			}
			
			else {
				builder.append(value);
			} 
			
			
			
			
			if (count++ == size) {
				builder.append("\n}");
				break;
			}
			builder.append(",\n");
			
		}
		
		
		FileWriter fw = new FileWriter("D:\\java_io\\data.json");
		
		fw.write(new String(builder));
		
		fw.close();
		
		// System.out.println("���� ���� �Ϸ�");
		
	}
	
	public static Map<String,Object> jsonFileToMap(Map<String,Object> map) throws IOException {
		
		FileReader fr = new FileReader("D:\\java_io\\data.json");
		StringBuilder builder = new StringBuilder();
		int sourse;
		
		while ((sourse = fr.read()) != -1) {
			builder.append((char)sourse);
		}
		
		System.out.println(builder);
		System.out.println("���� �б� �Ϸ�");
		fr.close();
		
		String sourseS = builder.toString();
		

		
		sourseS = sourseS.replace('{', ' ');
		sourseS = sourseS.replace('}', ' ');
		sourseS = sourseS.trim();
		Pattern split_regex1 = Pattern.compile("[,][\n]");
		Pattern split_regex2 = Pattern.compile("[,]");
		String[] mapA = split_regex1.split(sourseS);
		
			

		ArrayList<String> keys =  new ArrayList<>();
		ArrayList<String> values =  new ArrayList<>();
		
		for(int i = 0; i < mapA.length; i++) {
			int idx = mapA[i].indexOf(":"); 
		
			String result1 = mapA[i].substring(mapA[i].lastIndexOf(':')+1).trim();
			String result2 = mapA[i].substring(0,idx).trim();
			
			values.add(result1);
			keys.add(result2.replace('\"', ' ').trim());
		}
		
		for (int i = 0; i < keys.size(); i++) {
			String str = values.get(i);
			if (str.charAt(0) == '\'') {
				str = str.replace('\'', ' ').trim();
				map.put(keys.get(i), str);
			}
			else if (Pattern.matches("[0-9]+", str)) {
				int valueN = Integer.parseInt(str);
				map.put(keys.get(i), valueN);
			}
			else if (str.charAt(0) == '[') {
				str = str.replace("["," ");
				str = str.replace("]"," ");
				str = str.replace("\'"," ");
				Object[] ob = split_regex2.split(str);
				map.put(keys.get(i), ob);
			}
			
			
		}
		
		
		
		
		
		return map;
	}
	
	public static void main(String[] args) throws IOException {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name","ȫ�浿");
		map.put("age",15);
		map.put("tel","010-1234-1234");
		map.put("add", "102����");
		map.put("abc", null);
		map.put("array", new String[] {"JAVA","Python"});
		map.put("sorry", "OK");
		
		
//		JSONObject map_jason = new JSONObject(map);
//		System.out.println(map_jason);
//		
//		StringBuilder builder = new StringBuilder();
//		
//		builder.append("{\n");
//		
//		int count = 0;
//		int size = map.size() -1;
//		
//		for (Map.Entry<String,Object> entry : map.entrySet()) {
//			String key = entry.getKey();
//			Object value = entry.getValue();
//			
//			builder.append("\t\"" + key + "\"\t: ");
//			
//			if (value == null) {
//				builder.append("null");
//			}
//			else if (value instanceof String) {
//				builder.append("'"+value + "'");
//			}
//			else if (value instanceof Object[]) {
//				Object[] arr = (Object[])value;
//				
//				if (arr.length == 0) {
//					builder.append("[]");
//				}
//				if (arr instanceof String[]) {
//					builder.append("[");
//					
//					int len = arr.length;
//					
//					int lencount = 0;
//					
//					for (Object obj : arr) {
//						builder.append("'" + obj + "'");
//						
//						if (lencount++ == len-1) {
//							builder.append("]");
//						}
//						else {
//							builder.append(", ");
//						}
//					}
//					
//				}
//				else {
//					builder.append("[others]");
//				}
//			}
//			
//			else {
//				builder.append(value);
//			} 
//			
//			
//			
//			
//			if (count++ == size) {
//				builder.append("\n}");
//			}
//			builder.append(",\n");
//			
//		}
//		
//		
//		FileWriter fw = new FileWriter("D:\\java_io\\data.json");
//		
//		fw.write(new String(builder));
//		
//		fw.close();
//		
//		System.out.println("���� ���� �Ϸ�");
		
		// ��� ���� �� �� �ִ� Ÿ��
		Object a = new int[10];
		Object b = new Object[10];
		
		// ObjectŸ�Կ� �� Object[]�� �ٽ� ����ϱ� ���ؼ� �ٿ� ĳ������ �ؾ��Ѵ�
		
		HashMap<String, Object> map2 = new HashMap<>();
		
		jsonFileToMap(map2);
		System.out.println(map2);
		Object[] ob = (Object[]) map2.get("array");
		System.out.println(ob[0]);
		System.out.println(ob[1]);
		
		
	}
}



