package commonLetters;

import java.util.Comparator;

public class ComparatorByRepetition implements Comparator<Letter>{

	@Override
	public int compare(Letter o1, Letter o2) {
		if(o1.getRepetition() - o2.getRepetition() == 0){
			return o1.getSign() - o2.getSign();
		}
		return (o1.getRepetition() - o2.getRepetition())*-1;
	}

}
