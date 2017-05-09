package book;

public class ContentsPage extends Page{

	public ContentsPage(String content) {
		super("Contents", content);
	}

	@Override
	public String getInfo() {
		return "What this book contains ...";
	}

}
