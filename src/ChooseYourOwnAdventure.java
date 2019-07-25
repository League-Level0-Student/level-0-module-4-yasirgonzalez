import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		int quest = JOptionPane.showOptionDialog(null, "Chose the story you wanna go on","Quest" ,0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Dragon","Apcalypse" }, null);
	if(quest==0) {
		Dragon();
	}else if(quest==1) {
		Apcalypse();
	}
	
	}
	static void Dragon() {
	String land = JOptionPane.showInputDialog("Mage: Welcome to the land of _____");	
	String sir = JOptionPane.showInputDialog("Mage: Welcome to the land of "+land+" sir______");
	JOptionPane.showMessageDialog(null, "Mage: Welcome to the land of "+land+" Sir "+sir);
	JOptionPane.showMessageDialog(null, "Mage: The king is waiting for you");
	JOptionPane.showMessageDialog(null, "As the big doors open and you walk to the kings throne, many of his followers watch you with hope");
	JOptionPane.showMessageDialog(null, "Mage: Your lord, the slayer has arrived");
	JOptionPane.showMessageDialog(null, "He was in shiny gold armor, with many gaurds with spears in their hands around him");
	JOptionPane.showMessageDialog(null,"The King in a loud voice: Ah yes, the slayer sir..." );
	JOptionPane.showMessageDialog(null, "Sir "+sir+": Sir "+sir);
	JOptionPane.showMessageDialog(null, "King: Yes yes, Sir "+sir+" is here to slay the dragon, make yourself feel at home just kill the dragon when you can" );
	JOptionPane.showMessageDialog(null, "Follower: of you can kill it know, Everyone in the room stared to pressure you");
	int Hunt = JOptionPane.showOptionDialog(null, "You have two choices","Choose" ,0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Kill the Dragon", "Relax" }, null);
	if(Hunt==0) {
		JOptionPane.showMessageDialog(null, "You walk out of the room and the Mage: The Dragon lives in a moutian south of here, he hands you a map");
	}else if(Hunt==1) {
		Relax();
	}
	JOptionPane.showMessageDialog(null, "You go to the moutian, your tired from your trip");
	int slay = JOptionPane.showOptionDialog(null, "what should you use to fight with frist", "Weapon", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Sword and Sheild", "Bow and Arrow" }, null);	

	if(slay==0) {
		JOptionPane.showMessageDialog(null, "You sneak as close as you can to the dragon, not so close that he can smell you");
	    JOptionPane.showMessageDialog(null, "You charge and stab the dragon, or at least try to, his scales were to strong and you wake him up, and he eats you alive, your time on earth has ended");
	}else if(slay==1) {
		JOptionPane.showMessageDialog(null, "You forgot to ask the Mage what kind of Dragon it is, so you did not know how strong his scales are, they deflet your arrows, but lucky you, he is still asleep");
		Bow();
		}

	}
	static void Bow() {
			JOptionPane.showMessageDialog(null, "You relize that his stomach is soft so you aim there, you pull pack with a posines arrow, aim, shoot, it flies and it goes throught his stomach, he wakes up only to let out a big cry");
		JOptionPane.showMessageDialog(null, "You start to shoot two fire arrows aiming for where you shot last, one hits, his wound starts to light on fire, but he sees you");
		JOptionPane.showMessageDialog(null, "You run to the exit, he starts to chase you, because of his injury he hit the pilers keeping the cave up, the cave starts to collapse");
		JOptionPane.showMessageDialog(null, "The mage was there to check if your still alive, you hop on his horse and get away, as the Dragon gets buried under the rocks, The End");	
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

	static void Relax() {
JOptionPane.showMessageDialog(null, "You: It was a long way here, I think it would be easyer to kill the dragon when I'm healthy and well rested, the king smiles");
		JOptionPane.showMessageDialog(null, "Most of the Followers give you bad looks, King: Just make sure the dragon is slayed at the end of the week");
JOptionPane.showMessageDialog(null, "You give king a nod and go on to your room, as your about to rest the mage comes in");	
JOptionPane.showMessageDialog(null, "Mage: The king said that you would rest better if you got a massage, somepeople come in and you get a massage and they give you grapes");
JOptionPane.showMessageDialog(null, "You wake up to relize you feel asleep, Mind: I need to find the Mage so that I know what kind of dragon I'm going against, you walk out of your room");
JOptionPane.showMessageDialog(null, "You see a servant and ask, where is the Mage, Servent: he is in the north wing, You: thank you");
JOptionPane.showMessageDialog(null, "You find the Mage talking to some students of his, he sees you walk in, the Dragon Slayer, I see you have woken up, you ask him about the Dragon, he gives you a notebook, Mage: It's all we got about it");	
JOptionPane.showMessageDialog(null, "A messenger from the king comes in, Messenger: The King says that your both invited to dinner");
JOptionPane.showMessageDialog(null, "You have a feast with the king, you stay up to study the dragon");	
JOptionPane.showMessageDialog(null, "The next day, you head off to go fight the dragon, once you get there you decide to use your arrows");
	Bow();
	}
}