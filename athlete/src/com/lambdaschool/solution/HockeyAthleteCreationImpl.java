package com.lambdaschool.solution;

public class HockeyAthleteCreationImpl implements AthleteCreation {
    // The athlete specific Implementor implements the generic interface AthleteCreation requiring it to use displayAthlete method declared within interface.
    @Override
    public void displayAthlete() {
        System.out.println("Hockey Goalie");
    }
}
