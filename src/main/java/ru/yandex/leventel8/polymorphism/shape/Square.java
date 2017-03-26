package ru.yandex.leventel8.polymorphism.shape;

public class Square extends Shape {
    public void draw(){
        System.out.println("Square.draw()");
    }
    public void erase() {
        System.out.println("Square.erase()");
    }
}
