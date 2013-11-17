import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class bOp
{
  private static final Logger K = Logger.getLogger(bOp.class);

  public static final bOp gTA = new bOp();
  private static final int VERSION = 0;
  private final HashMap gTB = new HashMap();
  private String SL;

  public void setFileName(String paramString)
  {
    this.SL = paramString;
  }

  public void put(String paramString1, String paramString2) {
    this.gTB.put(paramString1, paramString2);
    save();
  }

  public String kf(String paramString) {
    return (String)this.gTB.get(paramString);
  }

  public void load() {
    this.gTB.clear();
    try {
      aYQ localaYQ = aYQ.V(dtb.readFile(this.SL));
      int i = localaYQ.readInt();
      int j = localaYQ.readInt();
      for (int k = 0; k < j; k++) {
        this.gTB.put(localaYQ.readString(), localaYQ.readString());
      }
      localaYQ.close();
    }
    catch (FileNotFoundException localFileNotFoundException) {
      K.info("No cache data file");
    } catch (IOException localIOException) {
      K.warn("Problème à l'ouverture des données de cache : " + localIOException.getMessage(), localIOException);
    }
  }

  public void save() {
    try {
      FileOutputStream localFileOutputStream = dtb.qd(this.SL);
      dSw localdSw = new dSw(localFileOutputStream);
      localdSw.writeInt(0);
      localdSw.writeInt(this.gTB.size());

      for (Map.Entry localEntry : this.gTB.entrySet()) {
        localdSw.writeString((String)localEntry.getKey());
        localdSw.writeString((String)localEntry.getValue());
      }

      localdSw.close();
      localFileOutputStream.close();
    } catch (IOException localIOException) {
      K.warn("Problème à la sauvegarde des données de cache :" + localIOException.getMessage());
    }
  }
}