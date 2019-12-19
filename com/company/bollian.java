package com.company;

public class bollian {


    public static void main(String[] args){
        boolean passedDoor = true;
        boolean closedDoor = false;
        int countDoor = 0;
        boolean allDoors = false;

        if(passedDoor){
            System.out.println("door one opened");
            countDoor =countDoor + 1;
        }
        if(passedDoor){
            System.out.println("door two is opened");
            countDoor =countDoor + 1;
        }
        if(countDoor == 2){
            allDoors = true;
        }
        if (allDoors){
            System.out.println("ALL the doors are opened ...");
        }
    }
}
