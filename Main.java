package com.company;

//lab71

class Cow
{
    public void printAll() {
        printColor();
        printName();
    }
    public void printColor() {
        System.out.println("Я – белый");
    }
    public void printName() {
        System.out.println("Я – корова");
    }
}

class Whale extends Cow
{
    public void printName() {
        System.out.print("Это неправда: ");
        System.out.println("Я – кит");
    }
}

class Cat{
    public Cat(){
        super();
    }
    public void getChild() {
        System.out.println("Котенок");
    }
}

class Dog extends Cat{
    public Dog() {
        super();
    }
    public void getChild() {
        System.out.println("Щенок");
    }
}

class Lamp{
}

class Bird{
}

class lab73{
    public int print(int a) {
        return 10;
    }
    public int print(Integer a){
        return 101;
    }
    public int print(String a){
        return 123;
    }
    public int print(int a, long t){
        return 10;
    }
    public int print(String a, int e){
        return 123;
    }
    public int print(int a, int e){
        return 10;
    }
    public static int min(int a, int b){
        if(a<b) return a;
        else return b;
    }
    public static long min(long a, long b){
        if(a<b) return a;
        else return b;
    }
    public static double min(double a, double b){
        if(a<b) return a;
        else return b;
    }
    public static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    public static long max(long a, long b){
        if(a>b) return a;
        else return b;
    }
    public static double max(double a, double b){
        if(a>b) return a;
        else return b;
    }
}

public class Main {
    private static void lab712(Lamp d){
        System.out.println("Лампа");
    }
    private static void lab712(Bird d){
        System.out.println("Птица");
    }
    private static void lab712(Dog d) {
        System.out.println("Собака");
    }
    private static void lab712(Cat d){
        System.out.println("Кошка");
    }
    public static void main(String[] args) {
        Whale a=new Whale();
        a.printAll();
        Cat b = new Cat();
        Dog c = new Dog();
        Lamp d = new Lamp();
        Bird e = new Bird();
        lab712(b);
        lab712(c);
        lab712(d);
        lab712(e);
        b.getChild();
        c.getChild();
        lab73 l = new lab73();
        int i=1;
        Integer j=1;
        l.print(i);
        l.print(j);
    }
}
