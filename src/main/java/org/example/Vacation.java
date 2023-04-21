package org.example;

public class Vacation {

    private int countOfPeople;
    private int countOfDays;

    public int calculate() {
        return countOfDays * countOfPeople;
    }

    public Vacation(int countOfPeople, int countOfDays) {
        this.countOfPeople = countOfPeople;
        this.countOfDays = countOfDays;
    }
}
