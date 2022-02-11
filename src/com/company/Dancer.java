package com.company;


    public class Dancer extends Person {
        private String GroupName;


        public Dancer() {
        }

        public Dancer(String groupName) {
            GroupName = groupName;
        }

        public Dancer(String name, String designation, String profession, String groupName) {
            super(name, designation, profession);
            GroupName = groupName;
        }

        public String getGroupName(String eagles) {
            return GroupName;
        }

        public void setGroupName(String groupName) {
            GroupName = groupName;
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

        }
        public void dancing(){
            System.out.print(getName()+" Dancing! solo ");
        }

        @Override
        public String toString() {
            return "Dancer" +
                    "\nDesignation " + getDesignastion()+
                    "\nGroupName" + GroupName;


        }
    }



