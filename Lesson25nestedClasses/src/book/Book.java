package book;

import java.util.ArrayList;

public class Book {

	private ArrayList<Page> pages;
	private String title;
	
	Book(String title){
		this.title = title;
		this.pages = new ArrayList<>();
	}
	
	public void addPage(Page p){
		this.pages.add(p);
	}
	
	public void printBook(){
		System.out.println("---"+title+"---");
		for(Page p : pages){
			System.out.println(p.getInfo());
		}
	}
	
}
