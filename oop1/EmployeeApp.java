public class EmployeeApp {
	public static void main(String[] args) {

	Employee a1 = new Employee();
	Employee a2 = new Employee();
	Employee a3 = new Employee();

	a1.no = 1601;
	a1.name = "����";
	a1.phoneNumber = "000-000-0000";
	a1.department = "������";
	a1.spot = "�븮";
	a1.salary = 200;
	
	a2.no = 1402;
	a2.name = "������";
	a2.phoneNumber = "111-111-1111";
	a2.department = "������";
	a2.spot = "���";
	a2.salary = 100;

	a3.no = 1203;
	a3.name = "����";
	a3.phoneNumber = "222-222-2222";
	a3.department = "������";
	a3.spot = "����";
	a3.salary = 300;

	System.out.printf(" %s �� ������ %d ���� \n",a1.name,a1.salaryCount() );
	System.out.printf(" %s �� ������ %d ���� \n",a2.name,a2.salaryCount() );
	System.out.printf(" %s �� ������ %d ���� \n",a3.name,a3.salaryCount() );

	a1.allData();
	a2.allData();
	a3.allData();

	}

}
