public class AccountApp {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.owner = "ȫ�浿";
		acc.accountNumber = "11-22-3333";
		acc.password = 123;
		acc.balance = 10000;

		int money = acc.withdraw2 (500,123);
		System.out.println(money);
	
		Account acc2 = new Account();
		acc2.owner = "����";
		acc2.accountNumber = "123-123-123";
		acc2.password = 123;
		acc2.balance = 1000;

		acc2.info();

	}
}
