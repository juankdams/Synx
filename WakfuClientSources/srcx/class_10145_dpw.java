import org.apache.log4j.Logger;

public class dpw extends dqt
  implements bBz
{
  private ckT aCI;
  private boolean lqn;
  private int cfh;
  private static final bOO aCJ = new bOO(new dyz());

  public static dpw b(int paramInt1, int paramInt2, int paramInt3, ckT paramckT)
  {
    try
    {
      dpw localdpw = (dpw)aCJ.Mm();
      localdpw.tX(paramInt1);
      localdpw.tY(paramInt2);
      localdpw.tZ(paramInt3);
      localdpw.a(paramckT);
      return localdpw;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut : ", localException);
    }
  }

  public void release()
  {
    try {
      aCJ.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + "(normalement impossible)");
    }
  }

  public void aJ() {
  }

  public void bc() {
    this.aCI = null;
    this.lqn = false;
    this.cfh = 0;
  }

  private dpw() {
    super(0, 0, 0);
  }

  protected long mC()
  {
    n(this.aCI);
    try {
      if (this.lqn) {
        ((arl)this.aCI).aDp().aD(this.cfh);
      }
      ((arl)this.aCI).cNp();
    } catch (Exception localException) {
      K.error("Error : ", localException);
    }
    dLE.doY().t("isInFightCreationOrPlacement", Boolean.valueOf(false));
    return 0L;
  }

  public void n(ckT paramckT) {
    for (Su localSu : paramckT.bgG())
      localSu.aeL().chl();
  }

  protected void kO()
  {
    release();
  }

  public ckT mD() {
    return this.aCI;
  }

  public void a(ckT paramckT) {
    this.aCI = paramckT;
  }

  public void kd(boolean paramBoolean) {
    this.lqn = paramBoolean;
  }

  public void aD(int paramInt) {
    this.cfh = paramInt;
  }
}