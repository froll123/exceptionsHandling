// 1

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = getFloatInput(scanner);
        System.out.println("Введенное значение: " + number);
    }

    public static float getFloatInput(Scanner scanner) {
        System.out.print("Введите дробное число: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Введено некорректное значение. Повторите ввод: ");
            scanner.next();
        }
        return scanner.nextFloat();
    }
}
