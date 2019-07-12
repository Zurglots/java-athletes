package com.lambdaschool.solution;

public class RugbyAthleteCreationImpl implements AthleteCreation {
    // The athlete specific Implementor implements the generic interface AthleteCreation requiring it to use displayAthlete method declared within interface.
    @Override
    public void displayAthlete() {
        System.out.println("Rugby Athlete");
    }
}
