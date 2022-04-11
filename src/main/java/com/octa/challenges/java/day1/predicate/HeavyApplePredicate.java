package com.octa.challenges.java.day1.predicate;

public class HeavyApplePredicate implements ApplePredicate{

    public boolean test(Apple apple) {
        if(apple.weight > 200) {
            return true;
        }
        else {
            return false;
        }
    }

}
