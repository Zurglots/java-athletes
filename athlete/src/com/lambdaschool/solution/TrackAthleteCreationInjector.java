package com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteCreationInjector {
// Athlete specific injector implements blueprint from generic AthleteCreationInjector
    @Override
    public Processor getProcess() {
        return new MyApplication(new TrackAthleteCreationImpl());
        // getProcess returns new MyApplication object with Implementor obj as argument.
    }
}
