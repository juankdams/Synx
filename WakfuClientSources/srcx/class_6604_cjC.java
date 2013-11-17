import java.io.File;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cjC
  implements dLQ
{
  private static final Logger K = Logger.getLogger(cjC.class);
  private String gaO;
  private final ArrayList gHD = new ArrayList(2);
  private final StringBuffer hJd = new StringBuffer();

  public cjC(String paramString, String[] paramArrayOfString) {
    this.gaO = paramString;
    for (String str : paramArrayOfString)
      this.gHD.add(str);
  }

  public void setBasePath(String paramString)
  {
    this.gaO = paramString;
  }

  public void jN(String paramString)
  {
    this.gHD.add(paramString);
  }

  public blq gL(long paramLong)
  {
    int i = 0; for (int j = this.gHD.size(); i < j; i++) {
      this.hJd.delete(0, this.hJd.length());
      String str = this.gaO + paramLong + "." + (String)this.gHD.get(i);
      QX.log("sound", str);
      File localFile = new File(str);
      if (localFile.exists()) {
        return new aDt(localFile);
      }
    }

    K.error("Impossible de trouver le fichier d'id " + paramLong + " dans le path " + this.gaO);
    return null;
  }
}