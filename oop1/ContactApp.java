public class ContactApp {
	public static void main(String[] args) {

	Contact c1 = new Contact();
	Contact c2 = new Contact();

	c1.no = 23;
	c1.name = "홍길동";
	c1.number = "010-0000-0000";
	c1.email = "hong@naver.com";

	c2.no = 43;
	c2.name = "김유신";
	c2.number = "010-1111-1111";
	c2.email = "kim@naver.com";

	c1.call();
	c2.call();
	
	/*
	배열 만들어서 저장 가능
	Contact[] = Contacts = new Contact[10];
	Contacts[0] = c1;
	Contacts[1] = c2;
	*/

	}
}

