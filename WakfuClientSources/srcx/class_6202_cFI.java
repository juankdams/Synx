import java.util.Locale;
import org.apache.log4j.Logger;

public enum cFI
{
  private static final Logger K;
  private final Locale dff;
  private final Locale iAA;
  private final String iAB;
  private final String m_name;
  private final boolean iAC;
  private final boolean iAD;
  private final boolean iAE;
  private static final dSC iAF;

  private cFI(String paramString3, String paramBoolean1, String paramBoolean2, boolean paramBoolean3, boolean arg7, boolean arg8)
  {
    this.dff = new Locale(paramString3);
    this.iAA = new Locale(paramBoolean2);
    this.iAB = paramString3;
    this.m_name = paramBoolean1;
    this.iAC = paramBoolean3;
    boolean bool1;
    this.iAD = bool1;
    boolean bool2;
    this.iAE = bool2;
  }

  public Locale getLocale() {
    return this.dff;
  }

  public Locale cAZ() {
    return this.iAA;
  }

  public static cFI no(String paramString) {
    return N(paramString, false);
  }

  public static cFI N(String paramString, boolean paramBoolean)
  {
    cFI localcFI = (cFI)iAF.get(paramString.toLowerCase());
    if ((localcFI != null) || (paramBoolean))
      return localcFI;
    K.warn("code inconnu " + paramString);
    return iAm;
  }

  public static boolean a(cFI[] paramArrayOfcFI, cFI paramcFI) {
    if ((paramArrayOfcFI == null) || (paramcFI == null)) {
      return false;
    }

    for (cFI localcFI : paramArrayOfcFI) {
      if (localcFI == paramcFI) {
        return true;
      }
    }
    return false;
  }

  public String getName() {
    return this.m_name;
  }

  public boolean cBa() {
    return this.iAC;
  }

  public boolean cBb() {
    return this.iAD;
  }

  public boolean cBc() {
    return this.iAE;
  }

  static
  {
    K = Logger.getLogger(cFI.class);

    iAF = new dSC();

    for (cFI localcFI : values())
      iAF.put(localcFI.iAB.toLowerCase(), localcFI);
  }
}