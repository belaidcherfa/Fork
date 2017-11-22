package fr.uvsq.Fraction.Test;
import fr.uvsq.Fraction.Main.Fraction;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFraction {

	/**
	 * Test method for {@link Fraction#Frac(int, int)}.
	 */
	@Test(expected = Exception.class)
	public void testFractionInt() {
		Fraction a = new Fraction(5, 0);
		
	}

	/**
	 * Test method for {@link Fraction#setNum(int)}.
	 *
	 */
	@Test
	public void testSetNum()  {
		Fraction a = new Fraction(5, 4);
		a.setNum(7);
		assertEquals(7,a.getNum(),0);
	}

	/**
	 * Test method for {@link Fraction#setDenom(int)}.
	 *  
	 */
	@Test
	public void testSetDenom() {
		Fraction a = new Fraction(5, 4);
		a.setDenom(9);
		assertEquals(9,a.getDenom(),0);
	}

	/**
	 * Test method for {@link Fraction#getNum()}.
	 * 
	 */
	@Test
	public void testGetNum() {
		Fraction a = new Fraction(5, 4);
		assertEquals(5,a.getNum(),0);
	}

	/**
	 * Test method for {@link Fraction#getDenom()}.
	 * 
	 */
	@Test
	public void testGetDenom()  {
		Fraction a = new Fraction(5, 4);
		assertEquals(4,a.getDenom(),0);
	}

	/**
	 * Test method for {@link Fraction#fractionVirgule()}.
	 *
	 */
	@Test
	public void testFractionVirgule() throws Exception {
		Fraction a = new Fraction(5, 4);
		double result =5/4;
		assertEquals(result,a.getNum()/a.getDenom(),0);
	}
}
