//Вывести все простые числа от 1 до 1000

public class prime_numbers {
    public static void main(String[] args) {
    
    for (int i = 2; i <= 1000; i++) {
        int j =2;
        int prime = 0;
        while ( j <= 1000 && prime < 2) {
            if ( i % j == 0)
                prime++;
            j++;  
        }
        if (prime == 1)
            System.out.println(i);            
    }
    }
}
