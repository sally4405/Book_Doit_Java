package gameLevel;

public class MainBoard {

	public static void main(String[] args) {
		Player kim = new Player();
		kim.play(2);
		
		AdvancedLevel alevel = new AdvancedLevel();
		kim.upgradeLevel(alevel);
		kim.play(2);
		
		SuperLevel slevel = new SuperLevel();
		kim.upgradeLevel(slevel);
		kim.play(3);

	}

}
