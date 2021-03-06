package kreashenz.stuntguy3000.mctd;

public class Enums {

	public enum towerHealth {
		VERYEASY(4),
		EASY(8),
		EASYMEDIUM(10),
		MEDIUM(12),
		MEDIUMHARD(14),
		HARD(16),
		HARDIMPOSSIBLE(24),
		IMPOSSIBLE(32),
		IMPOSSIBLECRAZY(40),
		CRAZY(50),
		CRAZYINSANE(60),
		INSANE(70),
		UNDEFEATABLEINSANE(80),
		UNDEFEATABLE(100);

		private int multiplier;

		private towerHealth(int multiplier) {
			this.multiplier = multiplier;
		}

		public int getMax(int playerCount) {
			return (playerCount + 1) * 20 * multiplier;
		}

		public int getMultiplier() {
			return multiplier;
		}

	}
	public enum Colour {
		RED,BLUE;
		public String toString(){
			String text;
			switch(this){
			case RED:
				text = "red";
			case BLUE:
				text = "blue";
			default:
				text = "null";
			}
			return text;
		}
		public String toChatColor(){
			String colour;
			switch(this){
			case RED:
				colour = "�4";
			case BLUE:
				colour = "�9";
			default:
				colour = "�e";
			}
			return colour;
		}
	}
}
