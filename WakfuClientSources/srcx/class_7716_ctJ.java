import org.apache.log4j.Logger;

public class ctJ extends dqt
  implements bBz
{
  private String Tl;
  private static final bOO aCJ = new bOO(new iR());

  public static ctJ a(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    try
    {
      ctJ localctJ = (ctJ)aCJ.Mm();
      localctJ.tX(paramInt1);
      localctJ.tY(paramInt2);
      localctJ.tZ(paramInt3);
      localctJ.setMessage(paramString);

      return localctJ;
    } catch (Exception localException) {
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
    this.Tl = null;
  }

  private ctJ() {
    super(0, 0, 0);
  }

  protected long mC()
  {
    KO.Vm().a(new coS(cMS.ksg, bU.fH().getString(this.Tl), 3000));
    return 200L;
  }

  protected void kO()
  {
    release();
  }

  public String getMessage() {
    return this.Tl;
  }

  public void setMessage(String paramString) {
    this.Tl = paramString;
  }
}