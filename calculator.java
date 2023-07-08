// Реализовать простой калькулятор

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
    String plus = "+";
    String minus = "-";
    String multiplication = "*";
    String division = "/";

    Scanner iScanner1 = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    boolean flag1 = iScanner1.hasNextDouble();
    //System.out.println(flag1); 

    Scanner iScanner2 = new Scanner(System.in);
    System.out.println("Введите математическую операцию: ");
    String operation = iScanner2.nextLine();

    Scanner iScanner3 = new Scanner(System.in);
    System.out.println("Введите второе число: ");
    boolean flag3 = iScanner3.hasNextDouble();
    //System.out.println(flag3); 

    if (flag1 == true && flag3 == true) {
        //System.out.println("all true");
        double a = iScanner1.nextDouble();
        double b = iScanner3.nextDouble();
        if (operation.equals(plus)) 
            System.out.println(a + " + " + b + " = " + (a+b));
        else if (operation.equals(minus))
            System.out.println(a + " - " + b + " = " + (a-b));
        else if (operation.equals(multiplication))
            System.out.println(a + " * " + b + " = " + (a*b));
        else if (operation.equals(division))
            System.out.println(a + " / " + b + " = " + (a/b));
        else
            System.out.println("Ошибка: Арифметическая операция введена неправильно. Возможные арифметические операции: + - * /");
    }
    else
        System.out.println("Ошибка: Вместо чисел введены другие символы");
    }
}
