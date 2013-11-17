import java.io.IOException;
import org.apache.log4j.Logger;

final class bJk
  implements Runnable
{
  bJk(short paramShort1, short paramShort2)
  {
  }

  public void run()
  {
    try
    {
      cwO.J(this.dXq, this.dXr);
    } catch (IOException localIOException) {
      cwO.ch().error("", localIOException);
    }
  }
}