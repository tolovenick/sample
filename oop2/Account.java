	/*
	은행 계좌를 표현하는 클래스
	 - 속성
	   예금주
	   계좌번호
	   비밀번호
	   잔액
	 - 기능
	  출금기능 - 금액과 비밀번호를 전달받아서 비밀번호가 일치하면 금액만큼의 돈을 반환한다.
	  입금기능 - 금액을 전달받아서 그 금액만큼 잔액을 증가시키고 화면에 잔액을 표시함
	  조회기능 - 예금주,계좌번호,잔액 표시
	*/

 public class Account {
	String owner;
	String accountNumber;
	int password;
	int balance;

	// 아닌경우를 미리 if문으로 없애고 코딩할것
	// return 값이 확정되면 바로 문장 종료됨.
	public int withdraw2(int amount, int pwd) {
		if(password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다");
			return 0;
		}

		if (balance < amount) {
			System.out.println("잔액이 부족합니다");
			return 0;
		}
	
		// 혹시 마일리지로 결제하는것을 넣어야 하면 이부분에 추가하면됨.

		balance -= amount;
		System.out.println(" 출금후 잔액 : "+ balance);
		return amount;
	}

	/*
	//출금기능
	//아래와 같이 짜면 로직이 복잡해지고 후에 기능추가하기 힘들어집니다.
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
 
	
	//입금기능
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.printf(" %d 원 입금 되었습니다. 잔액 %d ",amount,balance);
	}

	public void info(){
		System.out.printf(" %s 님의 계좌번호 %s 잔액 %d ",owner,accountNumber,balance);
	}


 }