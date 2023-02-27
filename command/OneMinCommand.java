public class OneMinCommand implements Command {
    public OneMinCommand(StopWatch watch) {

    }
    public void execute() {
        for(int i=59;i>=0;--i) {
            // havent finished this
            System.out.println(i);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
