package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oblig02 {
	
	public static void main(String[] args) { 
	
		for (int i=1; i<=10; i++) { 

		String userInputString = showInputDialog("Skriv inn din poengsum her:"); 
		int userTestScore = Integer.parseInt(userInputString);	 

		if (userTestScore < 39 && userTestScore >= 0) { 
			showMessageDialog(null,"F"); 
		} else if (userTestScore <= 49 && userTestScore >= 40) { 
			showMessageDialog(null,"E"); 
		} else if (userTestScore <= 59 && userTestScore >= 50) { 
			showMessageDialog(null,"D"); 
		} else if (userTestScore <= 79 && userTestScore >= 60) { 
			showMessageDialog(null,"C"); 
		} else if (userTestScore <= 89 && userTestScore >= 80) { 
			showMessageDialog(null,"B");	 
		} else if (userTestScore <= 100 && userTestScore >= 90) { 
			showMessageDialog(null,"A"); 
		} else { 
			showMessageDialog(null,"Error 404"); 
			i--; 
		} 
		} 
	} 
} 
