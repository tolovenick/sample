public class Car {
	// �Ӽ�(�ʵ�) �����ϱ�
	// �Ӽ����� ���� ������� �� ������ ��
	int speed;

	// ���(Method) �����ϱ�
	public void speedUp() {
		speed += 10;
		System.out.println("���� �ӵ� : " + speed + "Km");
	}

	public void speedDown() {
		speed -= 10;
		System.out.println("���� �ӵ� : " + speed + "Km");
	}

}