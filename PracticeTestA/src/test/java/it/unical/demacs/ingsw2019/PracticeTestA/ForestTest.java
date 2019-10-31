package it.unical.demacs.ingsw2019.PracticeTestA;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForestTest 
{
	private static Forest forest;
	
	@BeforeClass
	public static void init()
	{
		forest = new Forest();
	}
	
	@Before
	public void metodo1()
	{
		System.out.println("Metodo1");
		forest.resetForest();
	}
	
	@Test
	public void metodo2()
	{
		System.out.println("Metodo 2");
		//pianto 10 sequoie
		for(int i=0; i<10; i++)
			forest.plantSequoia();
		forest.growAtDay(10);
		double ox1 = forest.getForestOxygen();

		forest.resetForest();
		
		for(int i=0; i<10; i++)
			forest.plantOak();

		forest.growAtDay(10);
		double ox2 = forest.getForestOxygen();

		assertEquals(ox1, ox2, 0.01);

	}
	
	@Test
	public void metodo3()
	{
		System.out.println("Metodo 3");
		System.out.println();
		forest.plantOak();
		forest.plantSequoia();
		
		forest.growAtDay(10);
		
		assertTrue(forest.getHighestTreeHeight() <= 15.0);
		
	}
	
	
}
