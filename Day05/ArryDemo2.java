public class ArryDemo2 {
	public static void main(String[] args){
	// �迭 �����ϱ�
	// int[] arr = {1, 2, 3, 4, 5 6};  <= ���� ���� �迭 ����
	
	// int[] arr = new int[3]          <= �� 3���� �������ִ¹迭����
	// �������� 0, �Ǽ����� 0.0, �������� \u0000, �Ҹ����� false, �������� null
	int[] numbers = new int[3];
	System.out.println(numbers[0]); // 0 �� ��µ�
	System.out.println(numbers[1]); // 0 �� ��µ�
	System.out.println(numbers[2]); // 0 �� ��µ�
	System.out.println(numbers);    // [I@15db9742 �� ��µ�
									// �ּҰ��� �ƴ϶� ��ü�� �ĺ��ϱ����� ��ȣ��(�ؽ��ڵ尪)

	String[] st = new String[3];
	System.out.println(st[0]); // null �� ��µ�
	System.out.println(st[1]); // null �� ��µ�
	System.out.println(st[2]); // null �� ��µ�
	System.out.println(st);    // [Ljava.lang.String;@6d06d69c �� ��µ�

	}

}



