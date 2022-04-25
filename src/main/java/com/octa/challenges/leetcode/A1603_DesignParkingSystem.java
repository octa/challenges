package com.octa.challenges.leetcode;

public class A1603_DesignParkingSystem {
    int big, medium, small;

    public A1603_DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch(carType) {
            case 1:
                if(big-->0)return true;break;
            case 2:
                if(medium-->0)return true;break;
            case 3:
                if(small-->0)return true;break;
        }
        return false;
    }
}
