package book;

public abstract class Page {
	
	private String header;
	protected String content;
	
	public Page(){
		
	}

	public Page(String header, String content) {
		this.header = header;
		this.content = content;
	}

	public abstract String getInfo();

}
