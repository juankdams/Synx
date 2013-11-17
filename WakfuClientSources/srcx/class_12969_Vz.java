import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class Vz
  implements aFA
{
  private static final Logger K = Logger.getLogger(Vz.class);

  protected boolean cAx = false;
  private final cIK cAy;

  public Vz()
  {
    this.cAy = cTH.iIq;
  }

  public Vz(cIK paramcIK) {
    this.cAy = paramcIK;
  }

  protected boolean h(String paramString, int paramInt) {
    return (paramString != null) && (paramString.length() != 0);
  }

  public final int a(lZ paramlZ, dpI paramdpI, cFo paramcFo)
  {
    if (!paramcFo.g(paramdpI))
      return -1;
    String str1 = null;
    boolean bool1 = false;
    boolean bool2 = paramcFo.cAM();
    if ((!bool2) && (cxo.feH.ed(cxo.lI, paramdpI.yR()))) {
      str1 = cxo.feH.ec(cxo.lI, paramdpI.yR());
    }
    if ((str1 == null) || (str1.length() == 0))
      str1 = cxo.feH.ec(cxo.lq, paramdpI.eo());
    else {
      bool1 = true;
    }

    if (!h(str1, paramdpI.yR())) {
      return -1;
    }

    short s = paramcFo.nU();

    float f = paramdpI.bm(s);
    int j = 0;
    int k = 0;

    lZ locallZ = cxo.ill.cLY();
    int i = 0;

    Matcher localMatcher = cxo.ikn.matcher(str1);
    while (localMatcher.find()) {
      localObject1 = localMatcher.group(1);
      int m = ((String)localObject1).charAt(0);
      locallZ.a(str1, i, localMatcher.start());
      int n;
      switch (m) {
      case 112:
        n = ((String)localObject1).charAt(1);
        switch (n) {
        case 114:
          locallZ.a(String.valueOf(Math.round(f)));
          j = 1;
          break;
        case 108:
          locallZ.a(cxo.ilj);
        }

        break;
      case 97:
        n = ((String)localObject1).charAt(1);
        switch (n) {
        case 101:
          locallZ.a(b(paramdpI));
          k = 1;
        }

        break;
      case 115:
        n = ((String)localObject1).charAt(1);
        switch (n) {
        case 101:
          paramcFo.hX(true);
          aFA localaFA = cxo.xb(paramdpI.eo());
          localaFA.a(locallZ, paramdpI, paramcFo);
          paramcFo.hX(bool2);

          if (!h(str1, paramdpI.yR())) {
            return -1;
          }
          break;
        }

        break;
      }

      i = localMatcher.end();
    }

    locallZ.a(str1, i, str1.length());
    str1 = locallZ.toString();

    str1 = dI(str1);

    this.cAx = false;

    locallZ = cxo.ill.cLY();
    i = 0;
    Object localObject1 = cxo.ikR.matcher(str1);

    while (((Matcher)localObject1).find())
    {
      localObject2 = ((Matcher)localObject1).group(3);
      locallZ.a(str1, i, ((Matcher)localObject1).start());
      if (((String)localObject2).length() > 0) {
        locallZ.a(cxo.l(bTI.dx(Byte.parseByte((String)localObject2))));
      } else {
        locallZ.a(cxo.n(paramdpI));
        this.cAx = true;
      }
      i = ((Matcher)localObject1).end();
    }
    locallZ.a(str1, i, str1.length());
    str1 = locallZ.toString();
    String str2;
    if (k == 0)
    {
      locallZ = cxo.ill.cLY();
      i = 0;
      localObject2 = cxo.ikT.matcher(str1);

      while (((Matcher)localObject2).find()) {
        str2 = ((Matcher)localObject2).group(1);
        locallZ.a(str1, i, ((Matcher)localObject2).start());
        locallZ.a(cxo.ilm.hu(str2));
        i = ((Matcher)localObject2).end();
      }

      locallZ.a(str1, i, str1.length());
      str1 = locallZ.toString();
    }

    Object localObject2 = this.cAy.a(paramdpI, s);
    paramlZ.a(a(paramdpI, str1, (Object[])localObject2, bool1, paramcFo));

    if (!bool2) {
      if (!this.cAx) {
        str2 = cxo.n(paramdpI);
        if ((str2 != null) && (str2.length() > 0)) {
          paramlZ.a(" ").a(str2);
        }
      }
      if (k == 0) {
        str2 = b(paramdpI);
        if (str2 != null) {
          paramlZ.a(str2);
        }
      }

    }

    if ((!bool2) && (f < 100.0F) && (j == 0)) {
      paramlZ.a(" (").bw(Math.round(f)).a("%)");
    }

    return 0;
  }

  public static String dI(String paramString) {
    lZ locallZ = cxo.ill.cLY();
    int i = 0;

    Matcher localMatcher = cxo.ikG.matcher(paramString);
    while (localMatcher.find()) {
      localObject = localMatcher.group(1);
      locallZ.a(paramString, i, localMatcher.start());
      cxo.ilm.b(locallZ, (String)localObject);
      i = localMatcher.end();
    }
    locallZ.a(paramString, i, paramString.length());
    paramString = locallZ.tP();

    locallZ = cxo.ill.cLY();
    i = 0;

    Object localObject = cxo.ikS.matcher(paramString);
    while (((Matcher)localObject).find()) {
      locallZ.a(paramString, i, ((Matcher)localObject).start());
      i = ((Matcher)localObject).end();

      String str = ((Matcher)localObject).group(3);
      Integer localInteger = Integer.valueOf(str);
      bJC localbJC = cNO.cFX().yF(localInteger.intValue());
      if (localbJC == null) {
        K.error("Impossible de récupérer l'état d'id=" + localInteger);
      }
      else {
        locallZ.a(cxo.a(localbJC, (short)1, (short)1, false));
      }
    }
    locallZ.a(paramString, i, paramString.length());
    paramString = locallZ.tP();

    return paramString;
  }

  protected String a(dpI paramdpI, String paramString, Object[] paramArrayOfObject, boolean paramBoolean, cFo paramcFo) {
    return bjv.format(paramString, paramArrayOfObject);
  }

  public static String b(dpI paramdpI) {
    String str = paramdpI.aui().eP().toString();
    if ((!str.equals(cgr.hDT.name())) && (!str.equals(cgr.hDU.name()))) {
      return cxo.ilm.a(paramdpI.aui());
    }
    return "";
  }
}