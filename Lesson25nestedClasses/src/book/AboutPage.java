package book;

public class AboutPage extends Page{

	public AboutPage(String content) {
		super("About this book", content);
	}

	@Override
	public String getInfo() {
		return "about: " + content;
	}

}
