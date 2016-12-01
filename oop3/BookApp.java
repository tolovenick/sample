public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];
		
		bookCart[0] = new Book(1,"�̰��� �ڹٴ�","ȫ�浿","�Ѻ� �̵��",35000,"2015-10-10");
		bookCart[1] = new Book(2,"�ڹ� �� �׼�","MR.1","��1",45000,"2014-10-10");
		bookCart[2] = new Book(3,"������ �����ӿ�ũ","MR.2","��2",25000,"2013-10-10");
		bookCart[3] = new Book(4,"������ ��ť��Ƽ","������","��3",15000,"2012-10-10");
		bookCart[4] = new Book(5,"�ڹ� �� ���α׷���","�Ƿ�","�Ѻ� �̵��",65000,"2011-10-10");
		
		// īƮ�� ����� ��� å���� ������ ǥ���ϱ�
		for (int i=0; i<bookCart.length; i++) {
			System.out.println(bookCart[i].getTitle());
		}
		
/*		// īƮ�� ����� å���� ���� ������ ǥ���ϱ�
		int total = 0;
		for (int i=0; i<bookCart.length; i++) {
			total = total + bookCart[i].getPrice();
		} 	System.out.println("������ :" + total);
*/		
		int total = 0;
		for ( Book book : bookCart ) {
			total = total + book.getPrice();
		} 	System.out.println("������ :" + total);

/*		// īƮ�� ����� å�߿��� ���� ��� ������ å ����
		int maxPrice = 0;
		for (int i=0; i<bookCart.length; i++) {
			if 	( bookCart[i].getPrice() > maxPrice ){
				maxPrice = bookCart[i].getPrice();
			}
		}	System.out.println("���� ��� å�� :" + maxPrice);
*/		
		int maxPrice = 0;
		String maxTitle = "";
		for ( Book book : bookCart ) {
			if ( book.getPrice() > maxPrice ){
				maxPrice = book.getPrice();
				maxTitle = book.getTitle();
			}
		}System.out.println("���� ��� å�� :" + maxTitle);
	}
}