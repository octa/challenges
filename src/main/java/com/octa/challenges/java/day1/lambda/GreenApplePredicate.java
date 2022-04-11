package com.octa.challenges.java.day1.lambda;

import com.octa.challenges.java.day1.lambda.Apple;

public class GreenApplePredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        if(apple.type=="green") {
            return true;
        }
        else {
            return false;
        }
    }
}
