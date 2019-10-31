package it.unical.ingsw.intermediate_test_a.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.ingsw.intermediate_test_a.model.Impiccato;

public class ImpiccatoAdvancedTest {	

	private static Impiccato impiccato;
	
	@BeforeClass
	public static void init()
	{
		impiccato = new Impiccato("prova");
	}
	
	@Test
	public void test1()
	{
		
	}
	
	@Test(timeout=1000)
	public void test2()
	{
		impiccato.play('p');
		impiccato.play('r');
		impiccato.play('o');
		impiccato.play('v');
		assertEquals(false, impiccato.play('x'));
	}
	
	@Test
	public void test3()
	{
		impiccato = new Impiccato("ciccio");
		impiccato.play('i');
		impiccato.play('o');
		String s = new String(impiccato.getParolaCorrente());
		assertEquals("_i__io", s);
	}
	
	@AfterClass
	public static void stampa2()
	{
		System.out.println("Tutti i test avanzati sono terminati!");
	}
	
	@After
	public void stampa1()
	{
		System.out.println("Test avanzato terminato!");
	}
	
}
