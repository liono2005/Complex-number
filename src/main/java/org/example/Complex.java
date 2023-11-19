package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Complex {
    private double x;
    private double y;
    // Метод преобразования комплексного числа в строку
    public String str() {
        return x + "+" + y + "i";
    }

    // Метод сложения комплексных чисел
    public Complex add(Complex other) {
        double resultX = this.x + other.x;
        double resultY = this.y + other.y;
        return new Complex(resultX, resultY);
    }

    // Метод вычитания комплексных чисел
    public Complex sub(Complex other) {
        double resultX = this.x - other.x;
        double resultY = this.y - other.y;
        return new Complex(resultX, resultY);
    }

    // Метод умножения комплексных чисел
    public Complex mul(Complex other) {
        double resultX = this.x * other.x - this.y * other.y;
        double resultY = this.x * other.y + this.y * other.x;
        return new Complex(resultX, resultY);
    }

    // Метод деления комплексных чисел
    public Complex div(Complex other) {
        double denominator = other.x * other.x + other.y * other.y;
        double resultX = (this.x * other.x + this.y * other.y) / denominator;
        double resultY = (this.y * other.x - this.x * other.y) / denominator;
        return new Complex(resultX, resultY);
    }

    // Метод нахождения модуля комплексного числа
    public double modulus(Complex other) {
        return Math.sqrt(x * x + y * y);
    }

    // Метод сравнения двух комплексных чисел
    public boolean equals(Complex other) {
        return this.x == other.x && this.y == other.y;
    }
}
