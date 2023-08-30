package homework1;

import java.util.ArrayList;

public class task1 {


    class Answer {
        public static void arrayOutOfBoundsException() {
            try {
                int[] array = {1, 2, 3};
                System.out.println(array[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }
        }


        public static void divisionByZero() {
            try {
                int numerator = 10;
                int denominator = 0;
                int result = numerator / denominator;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }

        }

        public static void numberFormatException() {
            try {
                String numberString = "abc";
                int number = Integer.parseInt(numberString);
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования строки в число");
            }

        }
    }

    public class Printer {
        public void main(String[] args) {
            Answer ans = new Answer();
            try {
                ans.arrayOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }

            try {
                ans.divisionByZero();
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }

            try {
                ans.numberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования строки в число");
            }
        }
    }
}
