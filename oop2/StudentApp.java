public class StudentApp {
	public static void main(String [] args) {

	// �����ڸ� �̿��� �� �Է�
	Student b = new Student(50,"������",70,80,90);
	System.out.printf("�հ�� %d\n",b.total());
	System.out.printf("����� %d\n",b.avg());
	b.info();

	// �� �����ڸ� ����� ���Ŀ� �� �Է�
	Student s = new Student();
	s.no = 10;
	s.name = "ȫ���";
	s.kor = 44;
	s.eng = 55;
	s.math = 66;
	
	System.out.printf("�հ�� %d\n",s.total());
	System.out.printf("����� %d\n",s.avg());
	s.info();

	}
}