package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oblig01 { 

	public static void main(String[] args) {
		
		String bruttolønn = showInputDialog("Din bruttolønn:"); 
		int lønn = Integer.parseInt(bruttolønn); 

		double trinn0 = 0; 
		double trinn1 = 0.093; 
		double trinn2 = 0.241; 
		double trinn3 = 0.1152; 
		double trinn4 = 0.1452; 

		if (lønn >=0 && lønn <= 164100) { 

			showMessageDialog(null, "Din trinnskatt er " + lønn * trinn0); 
		} 
		else if (lønn >=164100 && lønn <= 230950) { 
			showMessageDialog(null, "Din trinnskatt er " + lønn * trinn1); 
		} 
		else if (lønn >=230950 && lønn <= 580650) { 
			showMessageDialog(null, "Din trinnskatt er " + lønn * trinn2); 
		} 
		else if (lønn >=580650 && lønn <= 934050) { 
			showMessageDialog(null, "Din trinnskatt er " + lønn * trinn3); 
		} 
		else if (lønn >=934050) { 
			showMessageDialog(null, "Din trinnskatt er " + lønn * trinn4);	 
		} 
	} 
}