
public class B00_operator01 {

	public static void main(String[]args) {
		
		//������ (operator)
		//-����� �� ����ϴ°�
		
		//# ��� ������
		int a=10,b=7;
		double c=7.0;
		System.out.printf("a=%d,b=%d\n",10,7);
		//�ؿ����� �켱������ ��Ģ������ �켱������ ������
		System.out.println("+:"+(a+b));//���ϱ�
		System.out.println("-:"+(a-b));//����
		System.out.println("x:"+a*b);//���ϱ�
		
		
		//�� �������� ������ �� ���´�. 
		System.out.println(a/b);//������
		//�������� �Ǽ���  ������ ��Ȯ�� ����� �Ѵ�.
		System.out.println(a/c);
		System.out.println(a/(double)b);
		
		System.out.println(a%b);//����������
		
		System.out.println(a^b);//������ �ƴϴ�(��Ʈ����) �� ������ 2��������
								// ǥ���� �������ڸ� 0 �ٸ��� 1�� ǥ���� �ٽ� 
								// 10������ ǥ��
		
		System.out.println("����:"+Math.pow(a, b));//����(��� double Ÿ��)
		System.out.println("������:"+Math.sqrt(2));//������
		System.out.println("���밪 :"+Math.abs(-20));//���밪
		System.out.println("�ݿø� : "+Math.round(1.234));//�ݿø�
		System.out.println("�ø� : "+Math.ceil(1.234));//�ø�
		System.out.println("���� : "+Math.floor(1.234));//����
		System.out.println("�� ū����  : "+Math.max(a,b));//��ū����
		System.out.println("�� �������� : "+Math.min(a,b));//����������
		
	}
	
	
}
