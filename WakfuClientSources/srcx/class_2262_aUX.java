import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.io.IOException;
import org.apache.log4j.Logger;

public class aUX
  implements Runnable
{
  public aUX(Anm paramAnm, byte[] paramArrayOfByte)
  {
  }

  public void run()
  {
    try
    {
      this.eWG.d(aYQ.V(this.dfm));
    } catch (IOException localIOException) {
      Anm.gV().error("Exception while loading ANM " + this, localIOException);
    }
  }
}