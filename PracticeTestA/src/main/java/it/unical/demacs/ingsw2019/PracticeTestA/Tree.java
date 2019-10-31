package it.unical.demacs.ingsw2019.PracticeTestA;

public class Tree {

	private String treeType;
	private double height;
	private double growRate;
	private double oxygenFactor;
	
	public Tree(String treeType, double height, double growRate, double oxygenFactor) {
		super();
		this.treeType = treeType;
		this.height = height;
		this.growRate = growRate;
		this.oxygenFactor = oxygenFactor;
	}

	public void grow() {
		height += growRate;
	}

	public String getTreeType() {
		return treeType;
	}

	public double getHeight() {
		return height;
	}

	public double getGrowRate() {
		return growRate;
	}

	public double getOxygenPerDay() {
		return height * oxygenFactor;
	}

}
