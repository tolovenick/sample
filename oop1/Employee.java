public class Employee {
     // �Ӽ�
     // �����ȣ, �̸� , ��ȭ��ȣ , �ҼӺμ� , ���� , �޿�
	
	int no;
	String name;
	String phoneNumber;
	String department;
	String spot;
	int salary;

     // ���
     // ������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
     // ����� ��������� ����ϴ� �޼ҵ�
	public int salaryCount() {
		int result = (salary * 12);
		return result;
	}

	public void allData(){
		System.out.printf(" %d�� | �̸� :%s | ��ȭ��ȣ :%s | �ҼӺμ� :%s | �μ� : %s | �޿� :%d | \n",no,name,phoneNumber,department,spot,salary);
	}
}