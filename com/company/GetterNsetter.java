package com.company;

public class GetterNsetter {
    public String name = "aisha";
    public int age = 22;

    public static void main(String[] args) {
        GetterNsetter a = new GetterNsetter();
        a.setAge(12);
        a.setName("Amaly");
        a.printDetails();

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void printDetails(){
        System.out.println(getAge() + " " + getName());
    }

}