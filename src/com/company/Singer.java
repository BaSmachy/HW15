package com.company;

public class Singer extends Person {
    private String BandName;

    public Singer(String bandName) {
        BandName = bandName;
    }

    public Singer(String name, String designastion, String profession, String bandName) {
        super(name, designastion, profession);
        BandName = bandName;
    }

    public Singer() {

    }

    public String getBandName() {
        return BandName;
    }

    public void setBandName(String bandName) {
        BandName = bandName;
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void wolk() {
        super.wolk();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print(" diner");
    }

    public void Singing() {
        System.out.println(getName() + " Sings a song ");
    }

    public void PlayGitar() {
        System.out.print(" Play gitar after, ");
    }

    @Override
    public String toString() {
        return "\nSinger " +
                "Name: " + getName() +
                "\nDesignation: " + getDesignastion() +
                "\nBandName:\t " + BandName;
    }
}
