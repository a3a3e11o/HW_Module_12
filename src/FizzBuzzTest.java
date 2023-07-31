import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number n = ");

        FizzBuzz fizzBuzz = new FizzBuzz(scanner.nextInt());

        Thread threadA = new Thread(fizzBuzz::fizz);
        Thread threadB = new Thread(fizzBuzz::buzz);
        Thread threadC = new Thread(fizzBuzz::fizzbuzz);
        Thread threadD = new Thread(fizzBuzz::number);

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
