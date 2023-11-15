package com.example.myapplication;

public class Triangulo {

    private float base;
    private float altura;
    private float area;

    @Override
    public String toString() {
        return "Triangulo{" +
                "area=" + area +
                '}';
    }

    public void calculaArea() {
        setArea((getBase() + getAltura()) / 2);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
