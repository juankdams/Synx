import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bIu
  implements dLQ
{
  private static final Logger K = Logger.getLogger(bIu.class);
  private aDo gHC;
  private final ArrayList gHD = new ArrayList();

  public void a(aDo paramaDo) {
    this.gHC = paramaDo;
  }

  public void jN(String paramString) {
    this.gHD.add(paramString);
  }

  public blq gL(long paramLong) {
    if (this.gHC == null) {
      K.error("PakFile non définie !");
      return null;
    }

    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0; for (int j = this.gHD.size(); i < j; i++) {
      int k = localStringBuilder.length();
      if (k > 0)
        localStringBuilder.delete(0, k);
      String str = paramLong + "." + (String)this.gHD.get(i);
      QX.log("sound", this.gHC.aPq() + "!/" + str);
      if (this.gHC.gi(str)) {
        return new cQw(this.gHC, str, this.gHC.aPq() + "!/" + str);
      }
    }

    return null;
  }
}