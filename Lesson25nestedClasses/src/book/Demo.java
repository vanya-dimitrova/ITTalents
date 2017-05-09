package book;

public class Demo {

	public static void main(String[] args) {
		
		Book book = new Book("Kradecut na knigi");
		
		book.addPage(new AboutPage("ima glavi i podglavi"));
		book.addPage(new ContentsPage("glava 1, glava 2, glava 3"));
		
		book.addPage(new Page() {
			@Override
			public String getInfo() {
				return "This is a special page";
			}
		});
		
		book.addPage(new Page("",""){
			@Override
			public String getInfo() {
				return "a sad page";
			}
		});
		
		Page thankYouPage = new Page(){
			@Override
			public String getInfo() {
				return "Thank you!";
			}
		};
		
		book.addPage(thankYouPage);
		
		book.printBook();
	}
}
