public class ScoreApp3 {
	public static void main(String[] args) {
	
	// �������ڸ��� "������", 40, 50, 60 ���� ���ϴ�.
	Score s = new Score("������", 40, 50, 60);
	
	System.out.println("���� :" + s.total());
	System.out.println("��� :" + s.average());
	}
}
