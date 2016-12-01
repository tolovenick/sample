public class Book {
	// ����ȭ�� �Ӽ� �����ϱ�
	// å��ȣ(no), ����(title), ����(author),
	// ���ǻ�(publisher), ����(price), ������(pubdata 2001-01-23)
		private int no;
		private String title;
		private String author;
		private String publisher;
		private int price;
		private String pubdata;
	
	// �⺻ ������ �����ϱ�
		public Book() {
		}
	
	// ��� �Ӽ��� �ʱ�ȭ�ϱ� ���� �Ű����� �ִ� ������ �����ϱ�
		public Book(int no,String title,String author, String publisher, int price, String pubdata){
			this.no = no;
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.price = price;
			this.pubdata = pubdata;
		}

	// ��� �Ӽ��� ���� ������ getter �Լ� �����ϱ�
		public int getNo() { return no; }
		public String getTitle() { return title; }
		public String getAuthor() { return author; }
		public String getPublisher() { return publisher; }
		public int getPrice() { return price; }
		public String getPubdata() { return pubdata; }

	// setter ���
	public void setNo(int no) { this.no = no; }
	public void setTitle(String title) { this.title = title; }
	public void setAuthor(String author) { this.author = author; }
	public void setPublisher(String publisher) { this.publisher = publisher; }
	public int setPrice(int price) {
		if (price >=0) {
			this.price = price;
		} else {
			this.price = 0;
		}
			return price;}
	public String setPubdata(String pubdata) { this.pubdata = pubdata; return pubdata; }

}