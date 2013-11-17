import com.ankamagames.wakfu.client.console.command.debug.WorkerTestCommand;
import java.io.PrintStream;

public class buq
  implements Runnable
{
  private long gdL = System.currentTimeMillis();

  public buq(WorkerTestCommand paramWorkerTestCommand) {  } 
  public void run() { long l = System.currentTimeMillis();
    System.err.println("Delta time : " + (l - this.gdL));
    if (l - this.gdL < 1000L) {
      int i = 0;
    }
    this.gdL = l;
  }
}