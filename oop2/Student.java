public class Student {
	int no;		  // �й�
	String name;
	int kor;
	int eng;
	int math;

	// �⺻ ������
	public Student() {
		}

	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
		}

	// ������ ��ȯ�ϴ� ���                         ==> total
	public int total(){
		int out = kor + eng + math;
		return out;
		}

	// ����� ��ȯ�ϴ� ���                         ==> avg
	public int avg(){
		int out = total() / 3;
		return out;
		}
	
	// �л������� ����ϴ� ���(������ ��յ� ����) ==> info
	public void info(){
		System.out.printf(" %d �� %s �� ��������: %d , ��������: %d , ��������: %d , ����:%d , ���:%d \n",no,name,kor,eng,math,total(),avg());
		}
}