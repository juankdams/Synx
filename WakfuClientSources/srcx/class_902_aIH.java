import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import org.apache.log4j.Logger;

public class aIH extends cZy
  implements djN
{
  public static final String ehp = "languageIcon";
  protected static final Logger K = Logger.getLogger(aIH.class);
  private static final short ehq = 11;
  public static final String ehr = "chatWindowModulationColor";
  private static final String[] bF = { "chatWindowModulationColor" };

  final FileFilter ehs = new dkt(this);

  public dEn gD(String paramString)
  {
    dEn localdEn = bmz.bk(paramString);
    return localdEn != null ? localdEn : super.gD(paramString);
  }

  public String[] getFields()
  {
    bmz[] arrayOfbmz = bmz.values();
    yR[] arrayOfyR = yR.values();
    String[] arrayOfString = new String[arrayOfbmz.length + arrayOfyR.length];
    int i = 0;
    Object localObject2;
    for (localObject2 : arrayOfbmz) {
      arrayOfString[i] = localObject2.getKey();
      i++;
    }

    for (localObject2 : arrayOfyR) {
      arrayOfString[i] = localObject2.getKey();
      i++;
    }

    ??? = new String[arrayOfString.length + bF.length];
    System.arraycopy(arrayOfString, 0, ???, 0, arrayOfString.length);
    System.arraycopy(bF, 0, ???, arrayOfString.length, bF.length);
    return ???;
  }

  public Object getFieldValue(String paramString)
  {
    cFI localcFI;
    if (paramString.equals("languageIcon")) {
      localcFI = bU.fH().ajJ();
      try {
        return String.format(ay.bd().getString("langIconsPath"), new Object[] { localcFI.cAZ().getLanguage().toUpperCase() });
      } catch (bdh localbdh) {
        K.warn(localbdh.getMessage());

        return null;
      }
    }
    if (paramString.equals(yR.bsz.getKey())) {
      localcFI = bU.fH().ajJ();
      return localcFI != null ? localcFI.cAZ().getLanguage() : null;
    }
    if (paramString.equals(bmz.fEd.getKey())) {
      return Boolean.valueOf(a(bmz.fEd));
    }
    if (paramString.equals(bmz.fEe.getKey())) {
      return f(bmz.fEe);
    }
    if (paramString.equals(bmz.fEf.getKey())) {
      return Integer.valueOf(d(bmz.fEf));
    }
    if (paramString.equals(bmz.fEq.getKey())) {
      return Boolean.valueOf(a(bmz.fEq));
    }
    if (paramString.equals(bmz.fEr.getKey())) {
      return Boolean.valueOf(a(bmz.fEr));
    }
    if (paramString.equals(bmz.fEp.getKey())) {
      return aFp.bH((byte)d(bmz.fEp));
    }

    if (paramString.equals(bmz.fEs.getKey())) {
      return Boolean.valueOf(a(bmz.fEs));
    }

    if (paramString.equals(bmz.fEt.getKey())) {
      return Boolean.valueOf(a(bmz.fEt));
    }

    if (paramString.equals(bmz.fEv.getKey())) {
      return Boolean.valueOf(a(bmz.fEv));
    }

    if (paramString.equals(bmz.fEw.getKey())) {
      return Boolean.valueOf(a(bmz.fEw));
    }

    if (paramString.equals(bmz.fEx.getKey())) {
      return Boolean.valueOf(a(bmz.fEx));
    }

    if (paramString.equals(bmz.fEy.getKey())) {
      return Boolean.valueOf(a(bmz.fEy));
    }
    if (paramString.equals(bmz.fEz.getKey())) {
      return Boolean.valueOf(a(bmz.fEz));
    }

    if (paramString.equals(bmz.fEA.getKey())) {
      return Boolean.valueOf(a(bmz.fEA));
    }
    if (paramString.equals(bmz.fEB.getKey())) {
      return Boolean.valueOf(a(bmz.fEB));
    }

    if (paramString.equals(bmz.fED.getKey())) {
      return dwA.BP(d(bmz.fED));
    }

    if (paramString.equals(bmz.fEE.getKey())) {
      return Boolean.valueOf(a(bmz.fEE));
    }

    if (paramString.equals(bmz.fEF.getKey())) {
      return Float.valueOf(c(bmz.fEF) * 2.0F);
    }

    if (paramString.equals(bmz.fEH.getKey())) {
      return Boolean.valueOf(a(bmz.fEH));
    }

    if (paramString.equals(bmz.fEJ.getKey())) {
      return Boolean.valueOf(a(bmz.fEJ));
    }

    if (paramString.equals(bmz.fEL.getKey())) {
      return Integer.valueOf(d(bmz.fEL));
    }

    if (paramString.equals(bmz.fEM.getKey())) {
      return Boolean.valueOf(a(bmz.fEM));
    }

    if (paramString.equals(bmz.fEO.getKey())) {
      return Boolean.valueOf(a(bmz.fEO));
    }
    if (paramString.equals(bmz.fEP.getKey())) {
      return Boolean.valueOf(a(bmz.fEP));
    }

    if (paramString.equals(bmz.fEK.getKey())) {
      return Boolean.valueOf(a(bmz.fEK));
    }

    if (paramString.equals(bmz.fEN.getKey())) {
      return Boolean.valueOf(a(bmz.fEN));
    }

    if (paramString.equals(bmz.fEU.getKey())) {
      return Boolean.valueOf(a(bmz.fEU));
    }

    if (paramString.equals(bmz.fEV.getKey())) {
      return Boolean.valueOf(a(bmz.fEV));
    }

    if (paramString.equals(bmz.fES.getKey())) {
      return Boolean.valueOf(a(bmz.fES));
    }

    if (paramString.equals(bmz.fEu.getKey())) {
      return Boolean.valueOf(a(bmz.fEu));
    }

    if (paramString.equals(bmz.fEI.getKey())) {
      return Boolean.valueOf(a(bmz.fEI));
    }

    if (paramString.equals(bmz.fET.getKey())) {
      return Boolean.valueOf(a(bmz.fET));
    }

    if (paramString.equals(bmz.fFa.getKey())) {
      return Boolean.valueOf(a(bmz.fFa));
    }

    return super.getFieldValue(paramString);
  }

  public void a(String paramString, Object paramObject)
  {
    super.a(paramString, paramObject);
  }

  public boolean l(String paramString)
  {
    return super.l(paramString);
  }

  protected void aUy()
  {
    super.aUy();

    b(bmz.fEa, true);

    b(bmz.fEj, 0);
    d(bmz.fEl, aFy.ebG.name());
    b(bmz.fEm, 0);
    b(bmz.fEn, 0);
    b(bmz.fEG, true);

    d(bmz.fEo, "0;1;2;3;4;5;6;7;8");
    b(bmz.fEI, false);

    b(bmz.fEJ, true);

    b(bmz.fEA, true);
    b(bmz.fEK, false);
    b(bmz.fEL, bha.fuT.ordinal());

    b(bmz.fEM, true);
    b(bmz.fEO, true);
    b(bmz.fEQ, -1);

    b(bmz.fEt, false);
  }

  protected void aUz()
  {
    super.aUz();

    b(bmz.fEg, 0.5D);

    b(bmz.fEx, true);

    b(bmz.fEy, false);

    b(bmz.fEB, false);

    b(bmz.fED, dwA.lBY.ordinal());

    b(bmz.fEE, true);

    b(bmz.fEF, 0.5D);

    b(bmz.fEH, true);

    b(bmz.fEu, false);

    b(bmz.fEN, true);

    d(bmz.fER, "");

    b(bmz.fES, false);

    b(bmz.fEU, false);

    b(bmz.fEV, false);

    b(bmz.fEW, true);

    b(bmz.fEP, true);

    b(bmz.fET, true);

    b(bmz.fFa, true);
  }

  public void a(ciW paramciW)
  {
    super.a(paramciW);
    if (paramciW != null)
      paramciW.a(this);
  }

  public void b(ciW paramciW)
  {
    super.b(paramciW);
    if (paramciW != null)
      paramciW.a(this);
  }

  public void c(ciW paramciW)
  {
    super.c(paramciW);
    if (paramciW != null)
      paramciW.a(this);
  }

  protected void aUA()
  {
    super.aUA();
    d(bmz.fEe, "");
    b(bmz.fEf, 1);

    b(bmz.fEd, true);

    b(bmz.fEv, true);

    b(bmz.fEw, true);

    b(bmz.fEp, aFp.ebr.bJ());

    b(bmz.fEs, true);
    b(bmz.fEr, true);

    b(yR.bsK, 2);
    b(yR.bsL, 2);
  }

  public void aUB() {
    a(bmz.fEA, g(bmz.fEA));
    a(bmz.fEL, d(bmz.fEL));
  }

  public void d(ciW paramciW) {
    e(paramciW);
  }

  private void e(ciW paramciW) {
    int i = paramciW.getInt(bmz.fDZ.getKey());
    if (i < 11) {
      URL localURL = getClass().getResource("/com/ankamagames/wakfu/client/resources/wakfuPreferencesActions.xml");
      aDN.a(localURL, this, i);

      paramciW.E(bmz.fDZ.getKey(), 11);
      try {
        paramciW.save();
      } catch (IOException localIOException) {
        K.warn("Problème à la sauvegarde", localIOException);
      }
    }
  }

  private void gE(String paramString)
  {
    File localFile1 = new File(paramString);
    File[] arrayOfFile1 = localFile1.listFiles(this.ehs);
    for (File localFile2 : arrayOfFile1)
      if (localFile2.isDirectory())
        gE(localFile2.getPath());
      else
        localFile2.delete();
  }
}