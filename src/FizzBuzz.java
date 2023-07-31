public class FizzBuzz {
    private final int n;
    private int currentNumber;
    public FizzBuzz(int n) {
        this.n = n;
        this.currentNumber = 1;
    }
    public synchronized void fizz() {
        while (currentNumber <= n) {
            if (currentNumber % 3 == 0 && currentNumber % 5 != 0) {
                printAndIncrement("fizz");
            } else {
                waitForNotification();
            }
        }
    }
    public synchronized void buzz() {
        while (currentNumber <= n) {
            if (currentNumber % 5 == 0 && currentNumber % 3 != 0) {
                printAndIncrement("buzz");
            } else {
                waitForNotification();
            }
        }
    }
    public synchronized void fizzbuzz() {
        while (currentNumber <= n) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                printAndIncrement("fizzbuzz");
            } else {
                waitForNotification();
            }
        }
    }
    public synchronized void number() {
        while (currentNumber <= n) {
            if (currentNumber % 3 != 0 && currentNumber % 5 != 0) {
                printAndIncrement(String.valueOf(currentNumber));
            } else {
                waitForNotification();
            }
        }
    }
    private void printAndIncrement(String output) {
        System.out.print(output);
        if (currentNumber++ < n) {
            System.out.print(", ");
        } else {
            System.out.println();
        }
        notifyAll();
    }
    private void waitForNotification() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}