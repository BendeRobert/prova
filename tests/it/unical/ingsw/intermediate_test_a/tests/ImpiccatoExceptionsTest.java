package it.unical.ingsw.intermediate_test_a.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.ingsw.intermediate_test_a.model.Impiccato;

public class ImpiccatoExceptionsTest {

	private static Impiccato impiccato;
	
	@BeforeClass
	public static void init()
	{
		impiccato = new Impiccato("prova");
	}
	
	@AfterClass
	public static void stampa2()
	{
		System.out.println("Tutti i test di eccezioni sono terminati!");
	}
	
	@After
	public void stampa1()
	{
		System.out.println("Test terminato!");
	}
	
	@Test(expected = Exception.class)
	public void test21()
	{
		impiccato.play('m');
		impiccato.play('m');
	}
	
	@Test(expected = Exception.class)
	public void test22()
	{
		impiccato.play('9');
		
	}
	
}
