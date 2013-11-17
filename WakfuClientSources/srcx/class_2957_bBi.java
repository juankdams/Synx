import java.io.IOException;
import org.apache.log4j.Logger;

public class bBi
{
  private static final Logger K = Logger.getLogger(bBi.class);

  public static ahm rX(int paramInt)
  {
    bVf localbVf = new bVf(dsE.cYX(), 0.0F, 0.0F, 0.0F);
    String str = paramInt + ".anm";
    try {
      localbVf.b(ay.bd().getString("ANMGUIPath") + str, true);
    } catch (IOException localIOException) {
      K.warn(localIOException.getMessage());
      return null;
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
      return null;
    }

    localbVf.em(str);
    return localbVf;
  }

  public static void a(ahm paramahm, aDD paramaDD) {
    paramahm.es(paramaDD.ata());
    paramahm.eq(paramaDD.ata());
  }

  public static void j(ahm paramahm) {
    a(paramahm, aDD.dYy);
  }
}