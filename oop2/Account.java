	/*
	���� ���¸� ǥ���ϴ� Ŭ����
	 - �Ӽ�
	   ������
	   ���¹�ȣ
	   ��й�ȣ
	   �ܾ�
	 - ���
	  ��ݱ�� - �ݾװ� ��й�ȣ�� ���޹޾Ƽ� ��й�ȣ�� ��ġ�ϸ� �ݾ׸�ŭ�� ���� ��ȯ�Ѵ�.
	  �Աݱ�� - �ݾ��� ���޹޾Ƽ� �� �ݾ׸�ŭ �ܾ��� ������Ű�� ȭ�鿡 �ܾ��� ǥ����
	  ��ȸ��� - ������,���¹�ȣ,�ܾ� ǥ��
	*/

 public class Account {
	String owner;
	String accountNumber;
	int password;
	int balance;

	// �ƴѰ�츦 �̸� if������ ���ְ� �ڵ��Ұ�
	// return ���� Ȯ���Ǹ� �ٷ� ���� �����.
	public int withdraw2(int amount, int pwd) {
		if(password != pwd) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			return 0;
		}

		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�");
			return 0;
		}
	
		// Ȥ�� ���ϸ����� �����ϴ°��� �־�� �ϸ� �̺κп� �߰��ϸ��.

		balance -= amount;
		System.out.println(" ����� �ܾ� : "+ balance);
		return amount;
	}

	/*
	//��ݱ��
	//�Ʒ��� ���� ¥�� ������ ���������� �Ŀ� ����߰��ϱ� ��������ϴ�.
	public int withdraw(int amount, int pwd){
		if(password == pwd) {
				if(	balance >= amount ) {
					balance = balance - amount;
				}	
		} else {
			balance = 0;
		}
		return amount;
	}
	*/
 
	
	//�Աݱ��
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.printf(" %d �� �Ա� �Ǿ����ϴ�. �ܾ� %d ",amount,balance);
	}

	public void info(){
		System.out.printf(" %s ���� ���¹�ȣ %s �ܾ� %d ",owner,accountNumber,balance);
	}


 }