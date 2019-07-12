package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        // Lines 11 and 12 seem to be a way to 'double' implement multiple interfaces to
        // ensure we're receiving both the injector and implementor.
        app.displayAthlete();
        // app is declared as an injector created from the athlete specific injector and
        // displayAthlete is invoked from the TrackAthleteCreationInjector which
        // created an obj from the TrackAthleteCreationImpl inheriting the correct override to print the correct string.

//        // Create a Hockey Athlete
//        injector = new HockeyAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete();
//
//
//        // Create a Rugby Athlete
//        injector = new RugbyAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete();
//
//        // Create a Baseball Athlete
//        injector = new BaseballAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete();

    }
}
