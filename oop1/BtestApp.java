public class BtestApp {
	public static void main(String[] args) {
// 1) �迭�� ���޹޾Ƽ� �� �迭���� ���� ū ���� ��ȯ�ϴ� �޼ҵ�
// 2) �迭�� ���ڸ� ���޹޾Ƽ� �� �迭�� ���ڰ� ���ԵǾ��ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	
	Btest t1 = new Btest();

	t1.list[0] = 10;
	t1.list[1] = 20;
	t1.list[2] = 30;
	System.out.printf(" %d �� ���� ū�� �Դϴ�.\n",t1.mostNumber());

	t1.existNumber = 10;
			if(t1.yesNumber() == true) {
				System.out.printf(" %d �� �������� �ʽ��ϴ�. \n",t1.existNumber);
			}	else {
				System.out.printf(" %d �� �����մϴ�. \n",t1.existNumber);

		}
	}
}