package com.lambdaschool.initial;

public class MyApplication implements Processor
{
//    private Athlete athlete = new Athlete();
    private AthleteService athleteSrv;

    public MyApplication(AthleteService athleteSrv){
        this.athleteSrv = athleteSrv;
    }

    @Override
    public void displayAthlete(String athlete) {
        athleteSrv.displayAthlete(athleteSrv);
    }
//    {
//        System.out.println("************");
//        athlete.display(sport);
//        System.out.println("************\n");
//    }
}
