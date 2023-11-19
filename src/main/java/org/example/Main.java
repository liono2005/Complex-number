package org.example;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 3);
        Complex c2 = new Complex(2, 4);

        System.out.println("c1: " + c1.str());
        System.out.println("c2: " + c2.str());

        Complex c3 = c1.add(c2);
        System.out.println("c1 + c2: " + c3.str());

        Complex c4 = c1.sub(c2);
        System.out.println("c1 - c2: " + c4.str());

        Complex c5 = c1.mul(c2);
        System.out.println("c1 * c2: " + c5.str());

        Complex c6 = c1.div(c2);
        System.out.println("c1 / c2: " + c6.str());

////fg
        //нахождение сравнения двух комплексных чисел
        System.out.println("z1 equals с2: " + c1.equals(c2));

    }
}
