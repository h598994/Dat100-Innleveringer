package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oblig01 { 

	public static void main(String[] args) {
		
		String bruttol�nn = showInputDialog("Din bruttol�nn:"); 
		int l�nn = Integer.parseInt(bruttol�nn); 

		double trinn0 = 0; 
		double trinn1 = 0.093; 
		double trinn2 = 0.241; 
		double trinn3 = 0.1152; 
		double trinn4 = 0.1452; 

		if (l�nn >=0 && l�nn <= 164100) { 

			showMessageDialog(null, "Din trinnskatt er " + l�nn * trinn0); 
		} 
		else if (l�nn >=164100 && l�nn <= 230950) { 
			showMessageDialog(null, "Din trinnskatt er " + l�nn * trinn1); 
		} 
		else if (l�nn >=230950 && l�nn <= 580650) { 
			showMessageDialog(null, "Din trinnskatt er " + l�nn * trinn2); 
		} 
		else if (l�nn >=580650 && l�nn <= 934050) { 
			showMessageDialog(null, "Din trinnskatt er " + l�nn * trinn3); 
		} 
		else if (l�nn >=934050) { 
			showMessageDialog(null, "Din trinnskatt er " + l�nn * trinn4);	 
		} 
	} 
}