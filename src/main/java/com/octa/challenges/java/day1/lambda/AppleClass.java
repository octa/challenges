package com.octa.challenges.java.day1.lambda;

import com.octa.challenges.java.day1.lambda.Apple;
import com.octa.challenges.java.day1.lambda.ApplePredicate;
import com.octa.challenges.java.day1.lambda.GreenApplePredicate;
import com.octa.challenges.java.day1.lambda.HeavyApplePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleClass {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList();
        apples.add(new Apple("green", 1000));
        apples.add(new Apple("red", 1000));
        filterApple(apples, (Apple apple) -> apple.type == "green");
        filterApple(apples, (Apple apple) -> apple.weight > 200);
    }

    public static <T> void filterApple(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList();
        for(T apple: list) {
            if(predicate.test(apple)) {
                filteredList.add(apple);
            }
        }
        System.out.println(filteredList.size());
    }
}
