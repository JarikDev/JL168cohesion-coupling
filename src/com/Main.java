package com;

public class Main {
    public static void main(String[] args) {

    }
}

class A{private int i; public int getI(){return i;}}
class B{ void printI(){
    System.out.println(new A().getI());;}}



class Zakusochnaja{
    Cook cook;
    Cleaner cleaner;
    Officiant officiant;
}
class Cleaner { void cleanFloor(){}}
class Cook{void cook(){}}
class Officiant{void deliverFood(){}}