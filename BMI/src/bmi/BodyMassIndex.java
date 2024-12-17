package bmi;

import utils.IO;

public class BodyMassIndex {

	public static void main(String[] args) {
		double groesse;
		double gewicht;

		String name = IO.promptAndReadString("Wie ist ihr Name?");
		System.out.println("Servus" + name + "! Bitte gib Deine Daten ein.");

		groesse = IO.promptAndReadDouble("Groesse (m)? ");
		gewicht = IO.promptAndReadDouble("Gewicht (kg)? ");

		double bmi = gewicht / (groesse * groesse);

		System.out.println("Ihr BMI ist " + IO.round(bmi, 0));

	}

}