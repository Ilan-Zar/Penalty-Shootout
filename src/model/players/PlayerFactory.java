package model.players;

import java.awt.Color;

public class PlayerFactory {

	public PlayerFactory() {}
	public Object getPlayer(String string) {
		GamePlayer player = null;
		if(string == "striker") {
			player = new Striker("Striker", Color.BLUE);
		}
		if(string == "goalkeeper") {
			player = new Goalkeeper("Goalkeeper", Color.YELLOW);
		}
		return player;
	}
}
