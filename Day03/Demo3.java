public class Demo3 {
	public static void main(String[] args) {
		// ���� ������
		//  ���ǻ� ? ���ϋ� ����� Ȥ�� �� : �����ϋ� ����� Ȥ�� ��
		int score = 67;
		String result1 = score >= 60 ? "�հ�" : "���հ�";
		System.out.println("���� ���: " + result1);
		
		int price = 25000;
		int creditPrice = price >= 50000 ? price : price + 2500;

}