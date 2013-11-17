import org.apache.log4j.Logger;

public class bVf extends ahm
{
  private static final Logger K = Logger.getLogger(bVf.class);

  protected CG ax = CG.bFG;
  protected boolean dHg;

  public bVf()
  {
  }

  public bVf(long paramLong)
  {
    super(paramLong);
  }

  public bVf(long paramLong, float paramFloat1, float paramFloat2) {
    super(paramLong, paramFloat1, paramFloat2);
  }

  public bVf(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3) {
    super(paramLong, paramFloat1, paramFloat2, paramFloat3);
  }

  protected final float atm()
  {
    return this.ax == CG.bFG ? 1.0F : 0.0F;
  }

  protected final float atn()
  {
    return this.ax == CG.bFI ? 1.0F : 0.0F;
  }

  public void c(CG paramCG) {
    if (paramCG == null) {
      K.error("Unable to set a Direction8 to null", new Exception());
      return;
    }

    if (this.ax != paramCG) {
      this.ax = paramCG;
      this.dHg = true;
    }
  }

  public CG E() {
    return this.ax;
  }

  protected String en(String paramString)
  {
    return kw(paramString);
  }

  protected boolean atg()
  {
    return (super.atg()) || (this.dHg);
  }

  protected void ath()
  {
    super.ath();
    this.dHg = false;
  }

  public String ate()
  {
    return kw(ata());
  }

  public int H(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    String str = kw(paramString);
    return super.H(str);
  }

  public boolean J(String paramString) {
    dR localdR = aty();
    if (localdR == null) {
      return false;
    }
    return localdR.J(kw(paramString));
  }

  public final String kw(String paramString) {
    return c(this.ax.m_index, paramString, atc());
  }

  public static String c(int paramInt, String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append(paramInt).append('_').append(paramString1);
    if (paramString2 != null) {
      localStringBuilder.append(paramString2);
    }
    return localStringBuilder.toString();
  }

  protected boolean atj()
  {
    return (super.atj()) || (this.dHg);
  }
}