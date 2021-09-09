package no.hvl.dat100;

public class Oblig03 {

	public static void main(String[] args) { 

		System.out.println(fakultet(7)); 
	} 
	public static int fakultet(int n) { 
		if(n == 1) { 
			System.out.println("Fakultet(" + n + ") = 1"); 
			return 1; 
		} else { 
			System.out.println("Fakultet(" + n + ") = " + n + " * Fakultet(" + (n - 1) + ")"); 
			return n * fakultet(n - 1); 
		}	 
	} 
} 
