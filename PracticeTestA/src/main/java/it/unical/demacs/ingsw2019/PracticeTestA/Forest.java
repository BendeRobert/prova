package it.unical.demacs.ingsw2019.PracticeTestA;

import java.util.ArrayList;
import java.util.List;

public class Forest {

	private List<Tree> plantedTrees = new ArrayList<>();

	/**
	 * Pianta una sequoia nella foresta
	 */
	public void plantSequoia() {
		plantedTrees.add(new Tree("Sequoia", 0, 1.5, 0.2));
	}

	/**
	 * Pianta una quercia nella foresta
	 */
	public void plantOak() {
		plantedTrees.add(new Tree("Oak", 0, 1, 0.3));
	}

	/**
	 * Fa crescere per 1 giorno (chiamando il metodo grow() su ogni albero)
	 */
	private void grow() {
		for (Tree tree : plantedTrees) {
			tree.grow();
		}
	}

	/**
	 * Fa crescere per d giorni la foresta (chiamando d voltre il metodo grow())
	 */
	public void growAtDay(int d) {
		if (d < 0) {
			throw new IllegalArgumentException("invalid day " + d);
		}
		for (int i = 0; i < d; i++) {
			grow();
		}
	}
	
	
	/**
	 * Restituisce l'altezza dell'albero più alto della foresta
	 */
	public double getHighestTreeHeight() {
		double max = 0;
		for(Tree t: plantedTrees) {
			if(t.getHeight() > max) {
				max = t.getHeight();
			}
		}
		return max;

	}

	/**
	 * Restituisce l'ossigeno totale prodotto giornalmente dalla foresta 
	 */
	public double getForestOxygen() {
		double res = 0;
		for (Tree tree : plantedTrees) {
			res += tree.getOxygenPerDay();
		}
		return res;
	}

	public void resetForest() {
		plantedTrees.clear();
	}

}
