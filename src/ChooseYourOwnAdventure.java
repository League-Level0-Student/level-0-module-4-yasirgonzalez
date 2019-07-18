import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		int quest = JOptionPane.showOptionDialog(null, "What kind of adventure are we going on", "Quest", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Dragons", "Pirates","Apcalypse" }, null);	
	if(quest==0) {
		Dragon();
	}else if(quest==1) {
		Pirate();
	}else if(quest==2) {
		Apcalypse();
	}
	
	}
	static void Dragon() {
		
	}
	static void Pirate() {
		
	}
	static void Apcalypse() {
		String rain = JOptionPane.showInputDialog("Newsreporter: Oh no, its raining______.(fill in the blank)");
	JOptionPane.showMessageDialog(null, "You are hearing the news as you get ready for the end of the world.");
	JOptionPane.showMessageDialog(null, "Newsreporter:Oh no, its raining "+rain+", its the end of the world, get somewhere safe before its to late");
	String weapon = JOptionPane.showInputDialog("Your going to need a weapon, so choose a weapon");
	String Food = JOptionPane.showInputDialog("You don't want to starve, what are you going to take to eat");
	int safe = JOptionPane.showOptionDialog(null, "You need to get somewhere safe, you come up with two ideas", "Shelter", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Shaft", "Basement" }, null);	
	if(safe==0) {
		JOptionPane.showMessageDialog(null, "You ran to the shaft but unlucky for you, you hit by a" +rain+", your time on earth as ended");
	}else if(safe==1) {
		JOptionPane.showMessageDialog(null, "The basement was close to you so you got there safe");
	}
	JOptionPane.showMessageDialog(null, "Three days have gone by and it stopped raining "+rain+" you go outside to just see the earth distoryed");
	JOptionPane.showMessageDialog(null, "You get out of your basement to see whats left of your world(but of course somthing bad happens)");
	JOptionPane.showMessageDialog(null, "The "+rain+" turned into a 8ft beast that starts to chase");
	int Hunt = JOptionPane.showOptionDialog(null, "You have two choices","Survive" ,0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "run", "attack" }, null);
	if(Hunt==0) {
		JOptionPane.showMessageDialog(null, "You run into a half distoryed dinner, as the beast was going to distory his way in");
		JOptionPane.showMessageDialog(null, "You see a goup of survivers attack the beast, they killed him a he lead out a terrble bat scream, hurting eveyones ears");
		JOptionPane.showMessageDialog(null, "The group sees you and go asking for your help, you give them thanks before a group of the monsters suround you and the group");
		JOptionPane.showMessageDialog(null, ".............................................................................................................................");
	}
	if(Hunt==1) {
		JOptionPane.showMessageDialog(null, "You attack, You dunk and jump, then you see a group go your way to help, but they where to late and out of nowhere the monster grows a third arm and stabs you");
	}
	}
}
