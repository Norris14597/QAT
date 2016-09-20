package com.qat;

public class TestTriangle {

    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 20; i++){
            for (int j = 1; j < 20; j++){
                for (int k = 1; k < 20; k++){
                    n++;
                    try {
                        Triangle t = new Triangle(i, j, k);
                        if (t.isEquilateral())
                            System.out.println(n + ": Equilateral - " + i + " " + j + " " + k);
                        if (t.isScalene())
                            System.out.println(n + ": Scalene - " + i + " " + j + " " + k);
                        if (t.isIsosceles())
                            System.out.println(n + ": Isosceles - " + i + " " + j + " " + k);
                        t = null;
                    } catch (IllegalArgumentException e) {
                        System.out.println(n + ": Illegitimate - " + i + " " + j + " " + k);
                    }

                }
            }
        }
    }
}
