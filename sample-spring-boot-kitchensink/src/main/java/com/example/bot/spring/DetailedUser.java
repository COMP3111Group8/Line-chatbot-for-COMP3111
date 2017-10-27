package com.example.bot.spring;

public class DetailedUser extends Users{
	private final static int numMeals = 6;
	private int amountOfExercise = 0; // in hour/day average a week
    private double bodyFat = 0; //in %
    private int caloriesConsump = 0; //per day
    private double carbsConsump = 0; // in g 
    private double proteinConsump = 0; //in g
    private double vegfruitConsump = 0; // in servings
    private boolean[] eatingHabits = {false,false,false,false,false,false};//eatBF,eatLunch,eatAFT,eatDinner,eatMS, eatMore 
	
    public DetailedUser(Users u) {
    	super(u);
    }
	public void setExercise(int t) {amountOfExercise = t;}
	public void setBodyFat(double bf) {bodyFat = bf;}
	public void setCalories(int cc) {caloriesConsump = cc;}
	public void setCarbs(double c) {carbsConsump = c;}
	public void setProtein(double p) {proteinConsump = p;}
	public void setVegfruit(double v) {vegfruitConsump = v;}
	public void setEatingHabits(boolean h, int i) {eatingHabits[i] = h;}
	public void setEatingHabits(boolean[] h) {
		assert (h.length == numMeals);
		for(int i = 0; i < h.length ; i++) 
			eatingHabits[i] = h[i];
	}
	public int getExercise() {return amountOfExercise;}
	public double getBodyFat() {return bodyFat;}
	public int getCalories() {return caloriesConsump;}
	public double getCarbs() {return carbsConsump;}
	public double getProtein() {return proteinConsump;}
	public double getVegfruit() {return vegfruitConsump;}
	public boolean[] getEatingHabits() {return eatingHabits;}
	
	
}