import java.util.concurrent.TimeUnit;
public class StopWatch {

    public StopWatch() {
    }
    /**
     * function will print out from 00:59 to 00:00 
     * @author Trevor Seestedt
     */
    public void countDownOneMin() {
        for (int i = 59; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.printf("%02d:%02d\n", i / 60, i % 60);
    
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void countDownFiveMin() {

    }
    public void countDownThirtySec() {
        
    }
}