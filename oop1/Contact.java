public class Contact { 
	// �Ӽ� �����ϱ�
	// ���� , �̸� , ����ó , �̸���
	int no;
	String name;
	String number;
	String email;
	
	// ��� �����ϱ�
	// ��ȭ�ϱ� call()
	// ���ں����� sendMessage()
	// ���Ϻ����� sendMail()
	public void call(){
		
		System.out.printf("%s(%s) ��ȭ�� �ɰ��ֽ��ϴ� \n",name,number);
	}

	public void sendMessage(){

		System.out.printf("%s(%s) ����ó�� ���ڸ� �����ϴ� \n",name,number);
	}

	public void sendMail(){

		System.out.printf("%s(%s) ����ó�� ��ȭ�� �ɰ��ֽ��ϴ� \n",name,number);
	}

}