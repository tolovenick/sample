public class ArrayDemo1 {
	public static void main(String[] args) {
	// ���� 5���� ���� �迭 �����
	int[] numbers = {1,5,8,10,4};

	// �迭���� �� ��������
	// numbers[�ε�����ȣ]
	int x = numbers[0];
	int y = numbers[1];

	System.out.println("�迭�� 0��° �� :" + x);
	System.out.println("�迭�� 1��° �� :" + y);

	//�迭�� ũ�� �˾Ƴ���
	// numbers.length;
	int size = numbers.length;
	System.out.println("ũ�� :" + size);

	//��� ������ �հ踦 ���ϱ�
	int total = 0;
	for (int a=0; a<numbers.length; a++) {
	 total += numbers[a];
	}
	System.out.println("�հ� :" + total);
	
	// ���ڽ��� for ��
	// ������ �迭�� ������ŭ �ڵ������� ���๮ ����
	int total2 = 0;
	for( int num : numbers) {
		System.out.println("���ڽ���for�� ���� �̱� :" + num);
		total2 = total2 + num;
		System.out.println("���ڽ���for�� �հ� :" + total2);
		}
	}
}