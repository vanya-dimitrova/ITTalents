package commonLetters;

import java.util.ArrayList;

public class Letter implements Comparable<Letter>{
	
	private Character sign;
	private Integer repetition = 1;
	ArrayList<Character> statistics = new ArrayList();
	
	Letter(Character sign){
		if(sign != null){
			this.sign = sign;
		}
		this.statistics.add('#');
	}
	
	Character getSign(){
		return this.sign;
	}
	
	
	int getRepetition(){
		return this.repetition;
	}
	
	void increaseRepetition(){
		this.repetition++;
		this.setStatistics();
	}
	
	private void setStatistics(){
		this.statistics.add('#');	
	}
	

	@Override
	public int compareTo(Letter o) {
		return this.sign - o.sign;
	}
	
	void printStatistics(){
		for (Character ch : statistics) {
			System.out.print(ch);
		}
	}
	
	@Override
	public String toString() {
		return this.sign + ": " + this.repetition;
	}

}
