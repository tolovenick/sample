public class Book {
	// 은닉화된 속성 정의하기
	// 책번호(no), 제목(title), 저자(author),
	// 출판사(publisher), 가격(price), 출판일(pubdata 2001-01-23)
		private int no;
		private String title;
		private String author;
		private String publisher;
		private int price;
		private String pubdata;
	
	// 기본 생성자 정의하기
		public Book() {
		}
	
	// 모든 속성을 초기화하기 위해 매개변수 있는 생성자 정의하기
		public Book(int no,String title,String author, String publisher, int price, String pubdata){
			this.no = no;
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.price = price;
			this.pubdata = pubdata;
		}

	// 모든 속성에 대한 각각의 getter 함수 정의하기
		public int getNo() { return no; }
		public String getTitle() { return title; }
		public String getAuthor() { return author; }
		public String getPublisher() { return publisher; }
		public int getPrice() { return price; }
		public String getPubdata() { return pubdata; }

	// setter 사용
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