package ru.yandex.leventel8.polymorphism.shape;

public class Triangle extends Shape {
    public void draw(){
        System.out.println("Triangle.draw()");
    }
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
