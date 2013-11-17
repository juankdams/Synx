import java.io.IOException;
import org.apache.log4j.Logger;

 enum Rv
{
  Rv(String arg3)
  {
    super(paramString, i, str, null);
  }
  protected dLQ dd(String paramString) {
    bIu localbIu = new bIu();
    aDo localaDo;
    try {
      String str1 = paramString;
      String str2 = ay.bd().getString("soundPakIndexExtension");
      String str3 = dtb.pZ(str1) + str2;
      if (str3.equals(str1)) {
        throw new IllegalArgumentException("mauvaise extension pour le fichier index");
      }
      localaDo = new aDo(str3, str1);
    } catch (bdh localbdh) {
      Pp.i().error(localbdh.getMessage(), localbdh);
      return null;
    } catch (IOException localIOException) {
      Pp.i().error("Impossible de charger le fichier de pak de son", localIOException);
      return null;
    }

    localbIu.a(localaDo);
    localbIu.jN("snd");
    localbIu.jN("ogg");
    return localbIu;
  }
}