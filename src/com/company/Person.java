package com.company;

public class Person {
     private String name;
     private String Designastion; //designation => with lower case
     private String Profession; // profession => with lower case

    public Person() {
    }

    public Person(String name, String designastion, String profession) {
        this.name = name;
        Designastion = designastion;
        Profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignastion() {
        return Designastion;
    }

    public void setDesignastion(String designastion) {
        Designastion = designastion;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }
    public void learn() {
        System.out.printf("Learn");
    }
    public void wolk(){
        System.out.printf("Wolk");
    }
    public void eat(){
        System.out.printf("Eat");
    }
     
     //missed toString()
}
