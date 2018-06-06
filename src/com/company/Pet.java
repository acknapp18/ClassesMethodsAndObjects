package com.company;

public class Pet {


String ownerName;
String name;
int age;
char gender;
String homeaddress;

    public Pet(String ownerName, String name, int age, char gender, String homeaddress) {
        this.ownerName = ownerName;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.homeaddress = homeaddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }
}
