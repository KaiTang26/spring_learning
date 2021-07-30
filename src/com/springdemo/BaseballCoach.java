package com.springdemo;

public class BaseballCoach implements Coach{

    @Override
    public String getDailWorkout(){
        return "Spend 30 minutes on batting practice";
    }
}
