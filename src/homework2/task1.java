package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class task1 {
    public static void main(String[] args) {
            float number = getFloatFromUser();
            System.out.println("Введенное число: " + number);
        }
    public static float getFloatFromUser() {
        boolean work = true;
        float fNumber = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Введите дробное число: ");
            try{
                fNumber = Float.parseFloat(reader.readLine());
                work = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число.");
            }

        }
        return fNumber;
    }
}