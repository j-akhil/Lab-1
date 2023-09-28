/package c;
package com.mycompany.app;


public class TestMe {
    private double value = Double.NaN;

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public TestMe() {}

    public double square() {
        return value * value;
    }

<<<<<<< HEAD
    public void setValue(double v) {
        value = v;
    }

    public double add(double x) {
        return value + x;
    }

    public double subtract(double x) {
        return value - x;
    }

    public double multiply(double x) {
        return value * x;
    }

    public double divide(double x) {
        if (x != 0) {
            return value / x;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
