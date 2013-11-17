import java.io.IOException;
import org.apache.log4j.Logger;

class cap
  implements Runnable
{
  cap(cPV paramcPV, short paramShort1, short paramShort2)
  {
  }

  public void run()
  {
    try
    {
      this.hrg.J(this.dXq, this.dXr);
    } catch (IOException localIOException) {
      cPV.ch().error("", localIOException);
    }
  }
}