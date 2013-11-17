import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;

public class akg extends bOO
{
  private final Queue dkO = new ConcurrentLinkedQueue();

  public akg(aRy paramaRy)
  {
    super(paramaRy);
  }

  private void axu() {
    if (this.dkO != null)
    {
      Object localObject;
      while ((localObject = this.dkO.poll()) != null)
        try {
          super.y(localObject);
        } catch (Exception localException) {
          K.error("Exception", localException);
        }
    }
  }

  public synchronized Object Mm()
  {
    axu();
    return super.Mm();
  }

  public void y(Object paramObject) {
    if (this.dkO != null)
      this.dkO.offer(paramObject);
  }
}