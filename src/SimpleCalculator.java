

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String one =JOptionPane.showInputDialog("Give a number");
String two=JOptionPane.showInputDialog("Give another number");
int first= Integer.parseInt(one);
int second=Integer.parseInt(two);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Problem", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
	}	
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int first, int second) {
	int c=first+second;
	JOptionPane.showMessageDialog(null, first+"+"+second+"="+c);
}
	// 4. Create similar methods for subtraction, multiplication and division.


	}