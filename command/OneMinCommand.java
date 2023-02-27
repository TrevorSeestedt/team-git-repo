/**
 * The command that calls the countDownOneMin method
 */
public class OneMinCommand implements Command {
    private StopWatch watch;
    
    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }
    public void execute() {
        watch.countDownOneMin();
    }
}