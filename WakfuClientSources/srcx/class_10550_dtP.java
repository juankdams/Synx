import java.util.LinkedList;
import java.util.Queue;
import org.apache.log4j.Logger;

public class dtP
{
  private static final Logger K = Logger.getLogger(dtP.class);

  public static dtP lwZ = new dtP();

  final aoL lxa = new aoL();

  public void a(long paramLong, dWn paramdWn)
  {
    Object localObject = (Queue)this.lxa.get(paramLong);
    if (localObject == null) {
      localObject = new LinkedList();
      this.lxa.put(paramLong, localObject);
    }
    ((Queue)localObject).offer(paramdWn);
  }

  public void kl(long paramLong) {
    Queue localQueue = (Queue)this.lxa.remove(paramLong);
    if (localQueue == null)
      return;
    while (!localQueue.isEmpty())
      ((dWn)localQueue.poll()).avs();
  }
}