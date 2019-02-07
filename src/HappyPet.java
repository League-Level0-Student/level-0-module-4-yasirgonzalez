import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("what kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 50 ; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet", "!Task time!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Water", "Groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
System.out.println(task);
if (task == 0) {
	feed();

}
else if (task == 1) {
	h2o();
}
else if(task == 2) {
	brush();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel == 10) {
	JOptionPane.showMessageDialog(null, "You love your pet a lot, congrats");
	break;
}				
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

			
	
	
	static void feed() {
		JOptionPane.showMessageDialog(null, "Cruch, Cruch, your pets happiness level goes up by +1");
		happinessLevel=happinessLevel+1;
	}
	static void h2o() {
		JOptionPane.showMessageDialog(null, "Chug, Cough, your pets chocked, happiness level goes down by -2");
	    happinessLevel=happinessLevel-2;
	}
	static void brush() {
		JOptionPane.showMessageDialog(null, "Whossh, Whossh, your pets happiness level goes up by +2");
	happinessLevel=happinessLevel+2;
	}
	}
	}