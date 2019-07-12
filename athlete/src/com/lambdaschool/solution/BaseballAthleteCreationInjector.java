package com.lambdaschool.solution;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector {
// Athlete specific injector implements blueprint from generic AthleteCreationInjector
    @Override
    public Processor getProcess() {
        return new MyApplication(new BaseballAthleteCreationImpl());
        // getProcess returns new MyApplication object with Implementor obj as argument.
    }
}
