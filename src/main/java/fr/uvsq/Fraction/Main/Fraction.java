package fr.uvsq.Fraction.Main;
public class Fraction {
	

	// Les deux attributs de notre classe
		private int num;
		private int denom;
		
	/**
	 * Le constructeur de la classe Fraction avec en param le nom et le dénom On
	 * initialise les variables
	 * 
	 * @param numerateur
	 * @param denominateur
	 */
	public Fraction(int numerateur, int denominateur)  {

		// On leve une exception si c'est egale� 0
		if (denominateur == 0) {
			throw new IllegalArgumentException("Le denominateur doit être different de 0");
		}

		num = numerateur;
		denom = denominateur;
	}

	/**
	 * Construction de la Fraction num/1.
	 * 
	 * @param n
	 * @throws Exception 
	 */
	public Fraction(int n) throws Exception {
		this(n, 1);
	}

	/**
	 * Construction de la Fraction 0/1.
	 */
	public Fraction() {
		num = 0;
		denom = 1;
	}

	// Création de la constante ZERO qui est une fraction de 0/1
	private static Fraction ZERO = new Fraction(0, 1);

	// Création de la constante UN qui est une fraction de 1/1
	private static Fraction UN = new Fraction(1, 1);
	

	/**
	 * Cette methode retourne un nombre a virgule
	 * 
	 * @return
	 */
	public double fractionVirgule() {
		double n = num; // convertion de l'entier en double
		double d = denom;
		return (n / d);
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	/**
	 * Une méthode qui retourne le numérateur
	 * 
	 * @return num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Une méthode qui retourne le dénominateur
	 * 
	 * @return denom
	 */
	public int getDenom() {
		return denom;
	}

	
	/**
	 * Cette méthode permet de réduire notre fraction en la divisant par le pgcd(num
	 * , denom)
	 */
	private void reductionFraction() {
		// Trouve le plus grand entre le num et dénom
		int n = num, d = denom, plusGrand;
		if (num < 0) {
			n = -num;
		}
		if (n > d) {
			plusGrand = n;
		} else {
			plusGrand = d;
		}

		// Chercher le pgcd du num et du dénom
		int pgcd = 0;
		for (int i = plusGrand; i >= 2; i--) {
			if (num % i == 0 && denom % i == 0) {
				pgcd = i;
				break;
			}
		}

		// On divise le num et dénom par le pgcd pour simplifier la fraction
		if (pgcd != 0) {
			num /= pgcd;
			denom /= pgcd;
		}

	}



	/**
	 * Cette m�thode retourne une chaine caract
	 * 
	 */
	public String toString() {
		return num + "/" + denom;
	}

}