import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cDH
  implements dLQ
{
  private static final Logger K = Logger.getLogger(cDH.class);
  private String ixe;
  private final ArrayList gHD = new ArrayList();
  private final StringBuffer ixf = new StringBuffer();

  public cDH(String[] paramArrayOfString) {
    for (String str : paramArrayOfString)
      this.gHD.add(str);
  }

  public void nj(String paramString)
  {
    this.ixe = paramString;
  }

  public void jN(String paramString)
  {
    this.gHD.add(paramString);
  }

  public blq gL(long paramLong)
  {
    int i = 0; for (int j = this.gHD.size(); i < j; i++) {
      this.ixf.delete(0, this.ixf.length());
      String str = this.ixe + paramLong + "." + (String)this.gHD.get(i);
      QX.log("sound", str);
      try {
        URL localURL = new URL(str);
        if (bAy.d(localURL))
          return new deQ(localURL);
      }
      catch (MalformedURLException localMalformedURLException) {
        K.error("URL malformée à partie de l'ID spécifié: result=" + str);
      }
    }

    K.error("Impossible de trouver le fichier d'id " + paramLong + " dans le path " + this.ixe);
    return null;
  }
}