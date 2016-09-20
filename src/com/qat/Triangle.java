package com.qat;

public class Triangle {
    private double sideA, sideB, sideC;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
        if (!checkSides())
            throw new IllegalArgumentException();
    }

    private boolean checkSides(){
        if (sideA > 0 && sideB > 0 && sideC > 0)
            if ((sideA < sideB + sideC && sideA >= sideB && sideA >= sideC) || (sideB < sideA + sideC  && sideB >= sideA && sideB >= sideC) || (sideC < sideA + sideB && sideC >= sideB && sideC >= sideA) )
                return true;
        return false;
    }

    private int numEqual(){
        int i = 1;
        if (sideA == sideB) i++;
        if (sideA == sideC) i++;
        if (sideB == sideC && i != 3) i++;
        return i;
    }

    public boolean isEquilateral() {
        return (numEqual() == 3);
    }

    public boolean isIsosceles() {
        return (numEqual() == 2);
    }

    public boolean isScalene() {
        return (numEqual() == 1);
    }
}
