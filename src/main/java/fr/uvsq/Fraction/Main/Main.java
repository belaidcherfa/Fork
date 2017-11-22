package fr.uvsq.Fraction.Main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Un test d'affection du constructeur");
		Fraction fr = new Fraction(2, 5);
		System.out.println(fr.toString());
		System.out.println("=============================================");
		System.out.println();
	}
}
