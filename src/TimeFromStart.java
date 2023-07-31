import java.util.concurrent.TimeUnit;

class TimeFromStart implements Runnable {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (true) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - startTime;
            System.out.println("Time after program was started: " + TimeUnit.MILLISECONDS.toSeconds(elapsedTime) + " seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}