package com.octa.challenges.java.day1.lambda;

import com.octa.challenges.java.day1.lambda.Apple;

public class HeavyApplePredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        if(apple.weight > 200) {
            return true;
        }
        else {
            return false;
        }
    }

}
