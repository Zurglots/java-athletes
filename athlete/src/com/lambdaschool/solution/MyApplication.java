package com.lambdaschool.solution;

public class MyApplication implements Processor
    // Implementing Processor requires us to declare display athlete.
{
    private AthleteCreation athlete;
    // Line 6 creates the variable athlete of type AthleteCreation to be used as an argument.

    public MyApplication(AthleteCreation athlete){
    // athlete as an argument is then passed into the constructor MyApplication and used to invoke .displayAthlete in the method override implemented from Processor.

        this.athlete = athlete;
    }

    @Override
    public void displayAthlete() {
        System.out.println("************");
        athlete.displayAthlete();
        System.out.println("************\n");

    }
}
