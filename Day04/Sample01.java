import java.util.Scanner;
public class Sample01 {
	public static void main(String[] args) {
	int sum = 0;

	for( ; ; ){
		System.out.println("----------------------------------");
		System.out.println("||1.����||2.���||3.�ܰ�||4.����||");
		System.out.println("----------------------------------");
		System.out.println("�޴��� �����ϼ���.");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if( number == 1) {
		System.out.printf("�������� ������ %d �Դϴ�. \n", sum);
		System.out.printf("�Ա� �ݾ��� �Է����ּ��� \n");
		int in = sc.nextInt();
		sum = sum + in;
		System.out.printf("�������� ������ %d �Դϴ�. \n", sum);

			} else if ( number == 2) {
			System.out.printf("�������� ������ %d �Դϴ�. \n", sum);
			System.out.printf("��� �ݾ��� �Է����ּ��� \n");		
			int out = sc.nextInt();
			if ( out > sum ) {
				System.out.printf("�������� �ܰ��� �����մϴ�. ���� �ܰ� %d \n", sum);
				} else {
				sum = sum - out;
				}
				System.out.printf("�������� ������ %d �Դϴ�. \n", sum);

					} else if ( number == 3) {
					System.out.printf("�������� �ܾ��� %d �Դϴ�. \n", sum);

						} else if ( number == 4) {
						System.out.printf("�����մϴ�. \n");
						break;

						} else {
						System.out.printf("���ڸ� 1������ 4�� ���̷� �Է����ּ��� \n");
						}
			}	
	}
}