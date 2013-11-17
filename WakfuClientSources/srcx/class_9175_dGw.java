import org.apache.log4j.Logger;

public class dGw extends dqt
  implements bBz
{
  private Su ehe;
  private String bU;
  private long dbD;
  private static final bOO aCJ = new bOO(new dru());

  public static dGw a(int paramInt1, int paramInt2, int paramInt3, Su paramSu, String paramString, int paramInt4)
  {
    try
    {
      dGw localdGw = (dGw)aCJ.Mm();
      localdGw.tX(paramInt1);
      localdGw.tY(paramInt2);
      localdGw.tZ(paramInt3);
      localdGw.aH(paramSu);
      localdGw.setAnimation(paramString);
      localdGw.setTime(paramInt4);

      return localdGw;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut : ", localException);
    }
  }

  public void release()
  {
    try
    {
      aCJ.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + "(normalement impossible)");
    }
  }

  public void aJ()
  {
  }

  public void bc()
  {
    this.ehe = null;
    this.bU = null;
    this.dbD = 0L;
  }

  private dGw() {
    super(0, 0, 0);
  }

  protected long mC()
  {
    this.ehe.aeL().eq(this.bU);
    return this.dbD;
  }

  protected void kO()
  {
    release();
  }

  public Su aUs()
  {
    return this.ehe;
  }

  public void aH(Su paramSu) {
    this.ehe = paramSu;
  }

  public String ata() {
    return this.bU;
  }

  public void setAnimation(String paramString) {
    this.bU = paramString;
  }

  public long getTime() {
    return this.dbD;
  }

  public void setTime(long paramLong) {
    this.dbD = paramLong;
  }
}