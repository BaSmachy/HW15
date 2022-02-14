package com.company;

public class Programmer extends Person{
    private String ComponyName; // write with lowercase => companyName


    public Programmer() {
    }

    public Programmer(String componyName) {
        ComponyName = componyName;
    }

    public Programmer(String name, String designation, String profession, String componyName) {
        super(name, designation, profession);
        ComponyName = componyName;
    }

    public String getComponyName() {
        return ComponyName;
    }

    public void setComponyName(String componyName) {
        ComponyName = componyName;
    }

    @Override
    public void learn() {
        System.out.println("Programmer is learning");
    }

    @Override
    public void wolk() {
        System.out.println("Programmer is walking");
    }

    @Override
    public void eat() {
        System.out.println("Programmer is eating");
    }
    public void coding(){
        System.out.printf(getName() +" Coding ");
    }


    @Override
    public String toString() {
        return "\nProgrammer" +
                " name: " + getName()+
                "\nDesignation: "+"\t "+ getDesignastion()+
                "\nProfession: "+"\t "+getProfession()+
                "\nComponyName: " +"\t"+ ComponyName ;
    }

//    @Override
//    public String toString() {
//        return "Programmer{" +
//                "name='" + getName() + '\'' +
//                ", Designastion='" + Designastion + '\'' +
//                ", Profession='" + Profession + '\'' +
//                ", ComponyName='" + ComponyName + '\'' +
//                '}';
    }



