package com.lambdaschool.solution;

public class HockeyAthleteCreationInjector implements AthleteCreationInjector {
// Athlete specific injector implements blueprint from generic AthleteCreationInjector
    @Override
    public Processor getProcess() {
        return new MyApplication(new HockeyAthleteCreationImpl());
        // getProcess returns new MyApplication object with Implementor obj as argument.
        // This is how our main knows to print from the correct implementor!!
    }
}
