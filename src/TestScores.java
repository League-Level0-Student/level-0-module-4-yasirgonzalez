import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String grade = "A+";
		String test = JOptionPane.showInputDialog(null,"What did you get on your last test");
double score = Double.parseDouble(test);
if(score>= 90.0) {
	JOptionPane.showMessageDialog(null, "You Aced it");
	grade="A";
}
else if(score >= 80.0) {
	JOptionPane.showMessageDialog(null, "B, you passed the test");
	grade="B";
}
else if (score>=70.0) {
	JOptionPane.showMessageDialog(null, "Good Job! A little more studing would not hurt");
	grade = "C";
}
else if(score>=60.0) {
	JOptionPane.showMessageDialog(null, "Well at least you pass high school");
	grade = "D";
}
else {
	JOptionPane.showMessageDialog(null, "Uh Oh, you should have studied for the test");
grade="F";
}

	JOptionPane.showMessageDialog(null, "You got a "+grade+" on that test");
	}	
}