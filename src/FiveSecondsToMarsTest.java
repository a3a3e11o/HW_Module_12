public class FiveSecondsToMarsTest {
    public static void main(String[] args) {
        Thread timeFromStart = new Thread(new TimeFromStart());
        Thread messagePerTime = new Thread(new MessagePerTime());

        timeFromStart.start();
        messagePerTime.start();
    }
}
