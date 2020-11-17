import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {

	
	//#Set
	//- ������ �����س��� Ŭ����
	//- ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	
	//#Hash
	// - � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���
	// - ������ �� ���� ���� �̿��ϹǷ� ������ �Ұ����ϴ�
	// - ������ ������ ���� ���� ã�� ���� �Ұ��ɿ� ������
	// - �ٽ� ���� ������ ���ư� �� ���� �ܹ��⼺ �˰���
	// - �ӵ��� ������ ���ȼ��� �پ �˰���

	//abcd1234!@#$	->	4685535
	//abd1234!@#$	->	4792135
	
	
	//a     ->   834254
	//b     ->   138532
	//c 	->   748685
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> even=new HashSet<>();
		
		
		//Set���� �Ȱ��� �����͸� ������ �� ����.
		even.add(2);
		even.add(2);
		even.add(2);
		even.add(6);
		even.add(8);
		even.add(40);
		
		
		//Hash�� �̿��ϴ� Ŭ������ ���� �־��� ������� �������� �ʴ´�
		System.out.println(even);
		
		
		//HashSet�� index�� ���� ������ �ϳ��� ���� ���� ����
		for(int i:even) {
			System.out.println("�ϳ��� ������ ���:"+i);
		}
	
		ArrayList<String> animal_list= new ArrayList<>();
		
		animal_list.add("zibra");
		animal_list.add("zibra");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("tiger");
		animal_list.add("eagle");
		animal_list.add("eagle");
		
		Collections.shuffle(animal_list);
		System.out.println(animal_list);
		
		//#�ٸ� ������ �÷����� Set���� �ս��� ������ �� �ִ�
		//�ߺ��� ���ŵǴ� ȿ���� �ִ�
		Set<String>animal_set=new HashSet<>(animal_list);//��ĳ���� HashSet�� Set�� �������ִ�
		System.out.println(animal_set);
		
		//#�÷����� �迭�� ��ȯ�ϱ�1
		Object[]animal_arr=animal_list.toArray();
		
		//String���� ���� �� �ٿ�ĳ������ �ʿ���
		String first_animal=(String)animal_arr[0];
		System.out.println(first_animal);
		
		//#�÷����� �迭�� ��ȯ�ϱ�2
		//- �̸� ������ �ش� ���׸� �迭�� �����ϴ� ���
		String[]animal_arr2=new String[animal_set.size()];
		animal_set.toArray(animal_arr2);
		
		first_animal=animal_arr2[0];
		System.out.println(first_animal);
		
		
		//contains: �÷��ǿ� �ش��Ұ� �ִ��� ���θ� ��ȯ
		System.out.println(animal_list.contains("lion"));
		System.out.println(animal_set.contains("lion"));
		
		//size:�÷��� ũ�� ��ȯ
		System.out.println(animal_list.size());
		
		//remove: �÷��� ��� ����(���� ������ true ��ȯ)
		System.out.println(animal_list.remove("lion"));
		
		//#�ٸ��÷����� �̿��ϴ� �޼����
		Set<Character> alphabet1=new HashSet<>();
		Set<Character> alphabet2=new HashSet<>();
		
		Collections.addAll(alphabet1,'A','B','C','D','E');
		Collections.addAll(alphabet2,'D','E','F','G','H');
		
		System.out.println(alphabet1);
		System.out.println(alphabet2);
		
		//1. addAll(collection): ������ �÷����� ��� ���� �߰��Ѵ�.
		List<Character>alpha_all=new ArrayList<>();
		
		alpha_all.addAll(alphabet1);
		alpha_all.addAll(alphabet2);
		
		System.out.println(alpha_all);
		
		//2. removeAll(collection): ������ �÷��ǰ� ��ġ�ϴ� ��� ���� �����Ѵ�
		Set<Character>to_remove=new HashSet<>();
		Collections.addAll(to_remove,'A','D');
		
		alpha_all.removeAll(to_remove);
		System.out.println(alpha_all);
		
		//3.retainAll(collections): ������ �÷��ǰ� ��ġ�ϴ� ���� �����Ѵ�
		List<Character> to_retain=new ArrayList<>();
		
		to_retain.add('E');
		to_retain.add('G');
		
		alpha_all.retainAll(to_retain);
		System.out.println(alpha_all);
		
		
		//4.containsAll(collection): ������ �÷����� ��� ��Ұ� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
		
		Collections.addAll(alpha_all,'A','B','C','D');
		
		Set<Character> must_contain=new HashSet<>();
		
		must_contain.add('A');
		must_contain.add('B');
		must_contain.add('C');
		must_contain.add('D');
		
		System.out.println(alpha_all+"�� "+must_contain+"�� ��� ���ԵǾ� �ֳ���?"+
				alpha_all.containsAll(must_contain));
		
		
		
		
		
	}
}
