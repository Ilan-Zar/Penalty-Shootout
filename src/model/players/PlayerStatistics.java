package model.players;

public class PlayerStatistics {
	
	public int stats = 0;
	public PlayerStatistics() {}

	public void setStatistics(Integer newStatistics) {
		stats = newStatistics;
	}

	public Integer getStatistics() {
		return stats;
	}
	
	public String toString() {
		return String.valueOf(stats);
	}
}
