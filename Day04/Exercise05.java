public class Exercise05 {
	public static void main(String[] args) {
		// 4x + 5y = 60�� ��� �ظ� ���غ��ð�
		// �� x�� 1~10�� �ڿ���
		for(int x=1; x<=10; x++){
			for(int y=1; y<=10; y++){
			if((4*x+5*y) == 60){
				System.out.printf("X�� ��%2d, Y�� ��%2d \n", x, y);
				continue;
				}
			}
		}
	}
}