package vania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Demo {

	public static void main(String[] args) {
		
		ArrayList<String> x = new ArrayList<>();
		x.add("Vania");
		
		List<String> readonly = Collections.unmodifiableList(x);
		System.out.println(readonly);
	}
}
