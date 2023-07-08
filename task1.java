// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
    int n = 0;
    int n_sum = 1;
    int n_factorial = 1;

    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите целое число большее или равное 1: ");
    boolean flag = iScanner.hasNextInt();
    //System.out.println(flag); 

    if (flag == true) {
        n = iScanner.nextInt();
        iScanner.close();
        if (n >= 1) {
            for (int i = 2; i <= n; i++) {
                n_sum = n_sum + i;
                n_factorial = n_factorial * i;
            }
            System.out.println("n-ое треугольного число: " + n_sum);
            System.out.println("n!: " + n_factorial);
        }  
    }
    if (flag == false || n < 1) {
    System.out.println("Ошибка: Введите целое число большее или равное 1");
    }  
    } 
}