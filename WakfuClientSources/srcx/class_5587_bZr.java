import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bZr
{
  private static final Logger K = Logger.getLogger(bZr.class);
  public static final String hpJ = "a";
  public static final String hpK = "b";
  public static final String hpL = "strong";
  public static final String hpM = "p";
  public static final String hpN = "href";

  public static void main(String[] paramArrayOfString)
  {
    String str = "\t\t\t\t\t\t\t\t\t\t\t\t\tTycho: \n\t\t\t\t\tWe are also doing some kinda PAX thing downtown, I guess?&nbsp; Should be pretty cool.\n(CW)TB \t\t\t\t\t\t\t\t";

    kL(str);
  }
  public static String kL(String paramString) { lZ locallZ = new lZ();

    String str = "<text>" + cKc.nG(paramString) + "</text>";
    byte[] arrayOfByte;
    try {
      arrayOfByte = str.getBytes("utf-8");
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      arrayOfByte = str.getBytes();
    }

    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    bwZ localbwZ = new bwZ();
    bpA localbpA = new bpA();
    try {
      localbpA.i(localByteArrayInputStream);
      localbpA.a(localbwZ, new cdJ[0]);
      localbpA.close();
    } catch (Exception localException) {
      K.warn("Problème au parse du document");
      return null;
    }

    a(localbwZ.bEx(), locallZ);

    return locallZ.tP();
  }

  private static void a(CC paramCC, lZ paramlZ)
  {
    bCH localbCH = bCH.gwX;

    if ((paramCC.getName().equals("#text")) || (paramCC.getName().equals("#cdata-section")))
    {
      paramlZ.a(paramCC.getStringValue());
      localbCH = bCH.gwX;
    } else if (paramCC.getName().equalsIgnoreCase("a")) {
      localObject = paramCC.e("href");
      if (localObject != null) {
        localbCH = bCH.gwY;
        paramlZ.tF().ao(((K)localObject).getStringValue());
      }
    } else if ((paramCC.getName().equalsIgnoreCase("b")) || (paramCC.getName().equalsIgnoreCase("strong")))
    {
      localbCH = bCH.gwZ;
      paramlZ.tz();
    } else if (paramCC.getName().equalsIgnoreCase("p")) {
      localbCH = bCH.gxa;
    }

    Object localObject = paramCC.getChildren();
    int i = 0; for (int j = ((ArrayList)localObject).size(); i < j; i++) {
      CC localCC = (CC)((ArrayList)localObject).get(i);
      a(localCC, paramlZ);
    }

    switch (dBE.lJl[localbCH.ordinal()]) {
    case 1:
      paramlZ.tG();
      break;
    case 2:
      paramlZ.tA();
      break;
    case 3:
      paramlZ.tH();
    }
  }

  public static String kM(String paramString) {
    lZ locallZ = new lZ();
    locallZ.tF().ao(paramString).a(paramString).tG();
    return locallZ.tP();
  }

  public static String as(String paramString1, String paramString2) {
    lZ locallZ = new lZ();
    locallZ.tF().ao(paramString1).a(paramString2).tG();
    return locallZ.tP();
  }
}