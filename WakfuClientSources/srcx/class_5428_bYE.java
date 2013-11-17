public class bYE
{
  private final String m_name;
  private final String aLm;
  private final bxT gAJ;
  private final boolean hoy;

  public bYE(String paramString1, String paramString2, bxT parambxT, boolean paramBoolean)
  {
    if ((!bB) && (parambxT == null)) throw new AssertionError();
    this.m_name = paramString1;
    this.aLm = paramString2;
    this.gAJ = parambxT;
    this.hoy = paramBoolean;
  }

  public bYE(String paramString, bxT parambxT, boolean paramBoolean) {
    if ((!bB) && (parambxT == null)) throw new AssertionError();
    this.m_name = paramString;
    this.aLm = "";
    this.gAJ = parambxT;
    this.hoy = paramBoolean;
  }

  public final String getName() {
    return this.m_name;
  }

  public String getDescription() {
    return this.aLm;
  }

  public final boolean cdt() {
    return this.hoy;
  }

  public final bxT bNs() {
    return this.gAJ;
  }
}