package model.players;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerCollection implements Iterable<GamePlayer> {
	
	public List<GamePlayer> coll = new ArrayList<GamePlayer>();
	public int index = 0;

	public PlayerCollection() {}
	@Override
	public Iterator<GamePlayer> iterator() {
		Iterator<GamePlayer> it = new Iterator<GamePlayer>() {
			private int currindex = 0;
			@Override
			public boolean hasNext() {
				return currindex < index && coll.get(currindex) != null;
			}

			@Override
			public GamePlayer next() {
				return coll.get(currindex++);
			}
		};
		
		return it;
	}

	public void sort() {
		if(coll.get(0).playerStatistics.getStatistics() < coll.get(1).playerStatistics.getStatistics()) {
			System.out.println(coll.get(0).playerStatistics.getStatistics());
			GamePlayer temp = coll.get(0);
			coll.set(0, coll.get(1));
			coll.set(1, temp);
		}
		
	}

	public void add(Object player) {
		coll.add((GamePlayer) player);
		index++;
	}
	
	public void remove(Object player) {
		coll.remove(player);
		index--;
	}
	
	public GamePlayer get(String string) {
		GamePlayer temp = null;
		for(GamePlayer element : coll) {
			if(element.getPlayerName().equalsIgnoreCase(string))
				temp = element;
		}
		return temp;
	}


}
