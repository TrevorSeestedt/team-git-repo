import java.util.concurrent.TimeUnit;
/**
 * Class for the Stop Watch with all functions outputting
 * @author Trevor Seestedt 
 */
public class StopWatch {

    public StopWatch() {
    }

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