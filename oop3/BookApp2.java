public class BookApp2 {
	public static void main(String[] args) {
		Book[] bookCart = new Book[2];
		
		Book book1 = new Book();
		book1.setNo(23);
		book1.setTitle("�ϵ� �� �׼�");
		book1.setAuthor("ô ��");
		book1.setPublisher("���ؼ�");
		book1.setPrice(30000);
		book1.setPubdata("2014-01-05");
	
		Book book2 = new Book();
		book2.setNo(25);
		book2.setTitle("�ڹ� �� ���α׷���");
		book2.setAuthor("���缺");
		book2.setPublisher("�������ǻ�");
		book2.setPrice(28000);
		book2.setPubdata("2016-07-05");
		
		bookCart[0] = book1;
		bookCart[1] = book2;

		for (Book book : bookCart) {
			System.out.printf(" %s %s %d \n",book.getTitle(),book.getPublisher(),book.getPrice());
		}

	}

}