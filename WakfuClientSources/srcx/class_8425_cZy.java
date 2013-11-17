import java.util.Locale;
import org.apache.log4j.Logger;

public class cZy
  implements dBv
{
  private static final Logger K = Logger.getLogger(cZy.class);
  private static ciW kNd;
  private static ciW kNe;
  private static ciW kNf;

  public static ciW a(cXb paramcXb)
  {
    switch (bsG.fZC[paramcXb.ordinal()]) {
    case 1:
      return kNd;
    case 2:
      return kNe;
    case 3:
      return kNf;
    }

    return null;
  }

  public dEn gD(String paramString)
  {
    return yR.bk(paramString);
  }

  public void a(dEn paramdEn, boolean paramBoolean) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.H(str, paramBoolean);
    dWe.dvA().a(this, new String[] { str });
  }

  public void a(dEn paramdEn, double paramDouble) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.e(str, paramDouble);
    dWe.dvA().a(this, new String[] { str });
  }

  public void a(dEn paramdEn, float paramFloat) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.d(str, paramFloat);
    dWe.dvA().a(this, new String[] { str });
  }

  public void a(dEn paramdEn, int paramInt) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.E(str, paramInt);
    dWe.dvA().a(this, new String[] { str });
  }

  public void a(dEn paramdEn, long paramLong) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.j(str, paramLong);
    dWe.dvA().a(this, new String[] { str });
  }

  public void c(dEn paramdEn, String paramString) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.au(str, paramString);
    dWe.dvA().a(this, new String[] { str });
  }

  public void b(dEn paramdEn, boolean paramBoolean) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.G(str, paramBoolean);
    dWe.dvA().a(this, new String[] { str });
  }

  public void b(dEn paramdEn, double paramDouble) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.d(str, paramDouble);
    dWe.dvA().a(this, new String[] { str });
  }

  public void b(dEn paramdEn, float paramFloat) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.c(str, paramFloat);
    dWe.dvA().a(this, new String[] { str });
  }

  public void b(dEn paramdEn, int paramInt) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.D(str, paramInt);
    dWe.dvA().a(this, new String[] { str });
  }

  public void b(dEn paramdEn, long paramLong) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.i(str, paramLong);
    dWe.dvA().a(this, new String[] { str });
  }

  public void d(dEn paramdEn, String paramString) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible d'enregistrer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return;
    }
    localciW.at(str, paramString);
    dWe.dvA().a(this, new String[] { str });
  }

  public boolean a(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return false;
    }
    return localciW.getBoolean(str);
  }

  public double b(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return 0.0D;
    }
    return localciW.getDouble(str);
  }

  public float c(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return 0.0F;
    }
    return localciW.getFloat(str);
  }

  public int d(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return 0;
    }
    return localciW.getInt(str);
  }

  public long e(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return 0L;
    }
    return localciW.getLong(str);
  }

  public String f(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return null;
    }
    return localciW.getString(str);
  }

  public boolean g(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return false;
    }
    return localciW.la(str);
  }

  public double h(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return 0.0D;
    }
    return localciW.lb(str);
  }

  public float i(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return 0.0F;
    }
    return localciW.lc(str);
  }

  public int j(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return 0;
    }
    return localciW.ld(str);
  }

  public long k(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return 0L;
    }
    return localciW.le(str);
  }

  public String l(dEn paramdEn) {
    ciW localciW = paramdEn.Hs();
    String str = paramdEn.getKey();
    if (localciW == null) {
      K.error("[CODE-Prefs] Impossible de rÃ©cupÃ©rer la prÃ©fÃ©rence de clef=" + str + " Ã  cet endroit, le preferenceStore n'est pas initialisÃ©.");
      return null;
    }
    return localciW.lf(str);
  }

  protected void aUz()
  {
  }

  protected void aUy()
  {
  }

  protected void aUA()
  {
    d(yR.bsz, cHO.cCb().cAZ().getLanguage());

    b(yR.bsB, 1);
    b(yR.bsC, 1);
    b(yR.bsD, 1);
    b(yR.bsE, false);
    b(yR.bsF, false);
    b(yR.bsG, false);
    b(yR.bsH, false);

    b(yR.bsJ, true);
    b(yR.bsI, 3000);

    b(yR.bsK, 2);
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals(yR.bsz.getKey())) {
      return f(yR.bsz);
    }
    if (paramString.equals(yR.bsB.getKey())) {
      return Float.valueOf(c(yR.bsB));
    }
    if (paramString.equals(yR.bsC.getKey())) {
      return Float.valueOf(c(yR.bsC));
    }
    if (paramString.equals(yR.bsD.getKey())) {
      return Float.valueOf(c(yR.bsD));
    }
    if (paramString.equals(yR.bsE.getKey())) {
      return Boolean.valueOf(a(yR.bsE));
    }
    if (paramString.equals(yR.bsF.getKey())) {
      return Boolean.valueOf(a(yR.bsF));
    }
    if (paramString.equals(yR.bsG.getKey())) {
      return Boolean.valueOf(a(yR.bsG));
    }
    if (paramString.equals(yR.bsH.getKey())) {
      return Boolean.valueOf(a(yR.bsH));
    }
    if (paramString.equals(yR.bsK.getKey())) {
      return Float.valueOf(c(yR.bsK));
    }
    if (paramString.equals(yR.bsL.getKey())) {
      return Float.valueOf(c(yR.bsL));
    }
    return null;
  }

  public String[] getFields()
  {
    yR[] arrayOfyR1 = yR.values();
    String[] arrayOfString = new String[arrayOfyR1.length];
    int i = 0;
    for (yR localyR : arrayOfyR1) {
      arrayOfString[i] = localyR.getKey();
      i++;
    }
    return arrayOfString;
  }

  public boolean l(String paramString)
  {
    return false;
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void a(String paramString, Object paramObject)
  {
  }

  protected void oE(String paramString)
  {
    dWe.dvA().a(this, new String[] { paramString });
  }

  public void ckS() {
    if (kNd != null)
      kNd.ckS();
    if (kNe != null)
      kNe.ckS();
    if (kNf != null)
      kNf.ckS();
  }

  public static ciW cMl() {
    return kNf;
  }

  public static ciW cMm() {
    return kNe;
  }

  public static ciW cMn() {
    return kNd;
  }

  public void a(ciW paramciW) {
    kNd = paramciW;
    if (kNd != null)
      aUA();
  }

  public void b(ciW paramciW) {
    kNe = paramciW;
    if (kNe != null)
      aUz();
  }

  public void c(ciW paramciW) {
    kNf = paramciW;
    if (kNf != null)
      aUy();
  }
}