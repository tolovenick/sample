public class Account {

// 아래 변수들에 직접적인 접근은 되지 않음.
	private String owner;
	private String accountNumber;
	private int password;
	private int balance;

	public Account(String owner,String accountNumber,int password,int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
	}

	public void info() {
		System.out.printf(" %s %s %d %d \n ", owner, accountNumber , password , balance);

	}


// 기본 속성은 감추고 노출을 원하는 속성만 따로 클래스 제작 get+변수명 방식으로
	public String getOwner() {
		return owner;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}