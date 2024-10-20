public class Fraction {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
        throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
    }
        this.numerator = numerator;
        this.denominator = denominator;
    simplify(); // Упрощение дроби при создании
    }

    // Метод для упрощения дроби
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {// Обеспечиваем, чтобы знаменатель был положительным
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Метод для вычисления НОД
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    // Строковое представление
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод сложения
    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
    }

    // Метод вычитания
    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
    }

    // Метод умножения
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
    }

    // Метод деления
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для сложения дроби и целого числа
    public Fraction sum1(int integer) {
        return this.sum(new Fraction(integer, 1));
    }

    // Метод для вычитания дроби и целого числа
    public Fraction minus1(int integer) {
        return this.minus(new Fraction(integer, 1));
    }

    // Метод для умножения дроби на целое число
    public Fraction multiply1(int integer) {
        return new Fraction(this.numerator * integer, this.denominator);
    }

    // Метод для деления дроби на целое число
    public Fraction divide1(int integer) {
        if (integer == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
        return new Fraction(this.numerator, this.denominator * integer);
    }
}