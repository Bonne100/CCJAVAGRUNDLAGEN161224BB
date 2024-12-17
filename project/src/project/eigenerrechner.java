package project;

public class eigenerrechner {
	 
	public static void main(String[] args) {
		
		addierenUndAusgeben(10, 20);
		addierenUndAusgeben(3, 13);
		addierenUndAusgeben(5, 100);
 
		/*
		int zahl1 = 3;
		int zahl2 = 13;
		int ergebnis = zahl1 + zahl2;
		
		System.out.println("Addition von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
		*/
	}
	
	public static void addierenUndAusgeben(int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
		System.out.println("Addition von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
	}}