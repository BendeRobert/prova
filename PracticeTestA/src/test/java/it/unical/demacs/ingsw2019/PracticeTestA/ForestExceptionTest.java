package it.unical.demacs.ingsw2019.PracticeTestA;

import org.junit.BeforeClass;
import org.junit.Test;

public class ForestExceptionTest {
private static Forest forest;
	
	@BeforeClass
	public static void init()
	{
		forest = new Forest();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void metodo21()
	{
		System.out.println("Metodo 21");
		forest.growAtDay(-1);
		
	}
}
