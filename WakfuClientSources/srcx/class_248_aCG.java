import java.io.IOException;
import org.apache.log4j.Logger;

class aCG
  implements Runnable
{
  aCG(bMp parambMp, short paramShort1, short paramShort2)
  {
  }

  public void run()
  {
    try
    {
      this.dXs.J(this.dXq, this.dXr);
    } catch (IOException localIOException) {
      bMp.ch().error("", localIOException);
    }
  }
}