import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.fruit.Mango;

public class D05_TreeSet {
	
	// # TreeSet
	//	- �ߺ����� ������ �� ����
	//	- �����͸� ������ �� ������������ �����Ѵ�
	//	- ��ҷ� null�� ������� �ʴ´�
	//	- ���� �ӵ��� ���� ��� ������ ����/�˻� �ӵ��� ������
	
	// # �ߺ�����+
	public static void main(String[] args) {
	
		TreeSet<Mango> sweet_mango_tree = new TreeSet<>(new Comparator<Mango>() {
			@Override
			public int compare(Mango o1, Mango o2) {
				int sweet_value = o1.sweet - o2.sweet;
				//  Set�� ���� �����͸� ������� �ʱ� ������ ���� �絵�� ���� ���� ��� ������� �ϳ��� ���´�
				//  ���� ������ ���� ���� ���� ID��� ������ �߰��Ͽ� �絵�� ���� ��� ID�� ���Ѵ�
				// 	���� ID�� �߰����� �ʰ� haseCode()��� �޼��带 ����ص� �񱳱��ذ��� ���� �ν��Ͻ��� ������ �� �ִ�
				return  sweet_value == 0 ? o1.hashCode() - o2.hashCode() : sweet_value;
			}
		});
		
		
		for (int i = 0; i < 1000; i++) {
			sweet_mango_tree.add(new Mango());
		}
//		
//		System.out.println(sweet_mango_tree);
//		System.out.println("TreeSet�� ����� ���� : " + sweet_mango_tree.size());
//		
//		
//		// Comparable���� return 0�� ���� ��ü���� �ǹ��Ѵ�
//		Set<Mango> basic_comp_tree = new TreeSet<>();
//		
//		for (int i = 0; i < 1000; i++) {
//			basic_comp_tree.add(new Mango());
//		}
//		
//		System.out.println("Basic tree�� ����� ���� : " + basic_comp_tree.size());
//		
		// # TreeSet Ȱ��
		
		// descendingSet() : ������������ ���ĵ� Set�� ��ȯ
		//System.out.println(sweet_mango_tree.descendingSet());
		
		
		// HeadSet(toElement) : �� �պ��� ���ϴ� ���ر����� Set�� ��ȯ
		
		Set<Mango> hSet =  sweet_mango_tree.headSet(new Mango(0,5,1000));
		//System.out.println("headSet : " + hSet);
		System.out.println("hSet�� ���� : " + hSet.size());
		
		
		// tailSet(fromElement) : 
		
		SortedSet<Mango> tSet =  sweet_mango_tree.tailSet(new Mango(0,5,1000));
		//System.out.println("headSet : " + tSet);
		System.out.println("tSet�� ���� : " + tSet.size());
		
		SortedSet<Mango> h_tSet = tSet.headSet(new Mango(0,8,1000));
		System.out.println("h_tSet�� ���� : " + h_tSet.size());
		
		
		SortedSet<Mango> t_tSet = tSet.tailSet(new Mango(0,8,1000));
		System.out.println("t_tSet�� ���� : " + t_tSet.size());
		
		
		// subSet(from,to)
		// �絵�� 7�ʰ� 9������ ���� ���
		SortedSet<Mango> result = sweet_mango_tree.subSet(new Mango(0,7,1000),new Mango(0,9,1000));
		
		System.out.println(result);
		
		
		//# TreeSet��Ҹ� �ϳ��� �����ϱ�
		
		TreeSet<Integer> int_tree=new TreeSet<>();
		
		int_tree.add(99);
		int_tree.add(1);
		int_tree.add(75);
		int_tree.add(3);
		int_tree.add(40);
		int_tree.add(11);
		
		//floor,ceiling: 
		//�ش� �� �������� ���� ����� ����/ū ���� �ϳ� ��ȯ
		//������ ���� ���� ���� �ִٸ� �ش簪�� ��ȯ

		//lower,higher,:
		//�ش� �� �������� ���� ����� ����/ū ���� �ϳ� ��ȯ
		//������ ���� ���� ���� �����Ѵ�
		
		System.out.println(int_tree.ceiling(12));
		System.out.println(int_tree.floor(12));
		System.out.println(int_tree.higher(12));
		System.out.println(int_tree.lower(12));

	}
}












