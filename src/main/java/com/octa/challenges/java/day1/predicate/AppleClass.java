package com.octa.challenges.java.day1.predicate;

import java.util.ArrayList;
import java.util.List;

public class AppleClass {

    public static void main(String[] args) {
        List<Apple> apple = new ArrayList();
        apple.add(new Apple("green", 1000));
        apple.add(new Apple("red", 1000));
        filterApple(apple, new GreenApplePredicate());
        filterApple(apple, new HeavyApplePredicate());
    }

    public static void filterApple(List<Apple> list, ApplePredicate applePredicate) {
        List<Apple> filteredList = new ArrayList();
        for(Apple apple: list) {
            if(applePredicate.test(apple)) {
                filteredList.add(apple);
            }
        }
        System.out.println(filteredList.size());
    }
}
