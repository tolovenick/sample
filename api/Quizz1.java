import java.util.Scanner;

public class Quizz1 {
	
	public static void main(String[] args) {
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�
		// ��> eungsulee@hanmail.net ----> eungsulee
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸����� �Է��ϼ���:");
		String email = sc.next();

		int position = email.indexOf("@");
		String result = email.substring(0, position);
		String result1 = email.substring(position+1);
		System.out.println(result);
		System.out.println(result1);
		

		String[] arr = email.split("@");
		System.out.println("���̵�: " + arr[0]);
	}
}