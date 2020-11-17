import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;;
public class D07_HashMap {

	//#Map
	//-key/Value�� �� ��Ʈ�� �̷�� �ڷᱸ��
	//-key���� ���� Value�� ã�� �ڷᱸ��
	//-key�� �ߺ��� ������� �ʴ´�
	
	public static void main(String[] args) {
		
		//map�� key/Value ���� �̷�� ������ ���׸��� �ΰ� �޴´�
		Map<String,String> map1=new HashMap<>();
		
		//put�޼��带 �̿��� �����͸� �����Ѵ�
		//-key�� �ش� �������� ī�װ�(�Ӽ�,property,attribute)�� �ǹ��Ѵ�
		//-value�� �ش� �׸��� ���� �����Ѵ�.
		map1.put("�̸�","������");
		map1.put("����","5��");
		map1.put("����","���޶�Ͼ�");
		map1.put("����","ġ�Ϳ�");//���� key�� �̿��� ���� �����Ѵ�
		map1.put("�����ǳ���", "5��");
		
		//#get�޼��忡 key ���� ������ ���ϴ� �׸��� ���� ������.
		System.out.println(map1.get("����"));
		
		//#�ݺ������� MapȰ���ϱ�
		//-keySet:key��� �̷���� Set�� ��ȯ�Ѵ�
		//-values:value��� �̷���� Collection�� ��ȯ�Ѵ�.
		//-entrySet:Entry<K,Y>��� �̷���� Set�� ��ȯ�Ѵ�.
		System.out.println("map1�� key��:"+map1.keySet());
		System.out.println("map1�� value��"+map1.values());
		System.out.println("map1�� entry��"+map1.entrySet());
		
		//#keySet���� ������
		for(String key:map1.keySet()) {
			System.out.println(key+"-"+map1.get(key));
		}
		
		//#values�� ������
		//-key�� value�� ã�°��� ������ value�� key�� ã�� ���� �Ұ����ϴ�//(���� value�� �������� �ֱ� ������)
		for(String value:map1.values()) {//map1.value�� ���� String value�� �־� �ָ鼭 null���� ���ö����� �ݺ�
			System.out.println(value);
		}
		
		//#entrySet���� ������
		for(Entry<String,String>entry:map1.entrySet()) {
			System.out.println(entry.getKey()+"/"+entry.getValue());
		}
		
		
		
//		HashMap<Integer,String>map2=new HashMap<>();
//		
//		map2.put("TEST1", "ABC");
//		map2.put("TEST2", "ABCD");
//		map2.put("TEST3", "ABCDF");
//		
		
		
		//containsKey
		System.out.println(map1.containsKey("�����ǳ���"));
		System.out.println(map1.containsKey("������ ����"));
		
		//#containsValie
		System.out.println(map1.containsValue("5��"));
		
		//#putAll�� �ٸ� Map�� �����͸� �߰��� �� �ִ�
		
		//map1.putAll(map2);
		System.out.println(map1);
		
		//#remove�޼���� ���ϴ� �����͸� ���� �� �ִ�
		//-key�� ������ ����� ��� :��� ������ ���� ��ȯ�Ѵ�
		//-key�� value��θ� ������ ����� ���:��Ȯ�ϰ� ���� ��ġ�� �� �����Ѵ�
		System.out.println(map1.remove("����","6��"));
		System.out.println(map1);
		System.out.println(map1.remove("����","5��"));
		System.out.println(map1);
		System.out.println(map1.size());
		
		
		//#get�޼��带 ����ϴٰ� ������ Ȥ�� key�� ���� ��� null�� ��ȯ�Ǿ�
		//NullpointerException�� �߻��� ������ �ִ�
		
		//#getOrDefault�޼��带 �̿��� null���� ��ȯ�Ǵ� ��Ȳ�̶�� �⺻���� 
		//��ȯ���� �� �ִ�
		System.out.println(map1.getOrDefault("������ �̸�","�⺻��").charAt(1));
		System.out.println(map1.get("������ ����"));
		
		
		
		//#MapŸ�� ���ο� MapŸ�� �ֱ�
		HashMap<String,HashMap<String,String>>phone_book=new HashMap<>();
				//Ű			value(Ű,value)
		//���ο� �ؽ��� �ν��Ͻ��� ������ �����ϸ�,Ű������ �ش� �ؽ����� ���� �� �ְ� �ȴ�.
		phone_book.put("�п�",new HashMap<>());
		phone_book.put("����",new HashMap<>());
		phone_book.put("����б�",new HashMap<>());
		phone_book.put("���б�",new HashMap<>());
		phone_book.put("���Ƹ�",new HashMap<>());
		
		HashMap<String,String>group_map=phone_book.get("�п�");
		
		//�ߺ��Ǵ� ���� Ű������ ����Ҽ� ���� ������ Ű������ �̸����ٴ� ��ȭ��ȣ ���� ���� ����ϴ°��� ����.
		group_map.put("010-123-1234", "�踻��");
		group_map.put("010-851-1234", "�踻��");
		
		
		System.out.println(phone_book);
		
	}
	
	
}
