package com.octa.challenges.java.day1.predicate;

public class GreenApplePredicate implements ApplePredicate{
    public boolean test(Apple apple) {
        if(apple.type=="green") {
            return true;
        }
        else {
            return false;
        }
    }
}
