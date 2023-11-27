import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        NegativeNumberException negativeNumberException;
        Scanner scanner = new Scanner(System.in);
       try {
           System.out.println("Введите положительное число:");
           negativeNumber(scanner.nextInt());
           System.out.println("Вы ввели правильное число");
       } catch (NegativeNumberException e) {
           System.out.println(e.getMessage());
       }
        System.out.println("Введите число");
       int number = scanner.nextInt();
    }
    public static void negativeNumber (int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Число отрицательное");
        }
    }
}