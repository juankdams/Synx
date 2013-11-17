import org.apache.log4j.Logger;

public class fz extends dqt
  implements bBz
{
  private ckT aCI;
  private static final bOO aCJ = new bOO(new LK());

  public static fz a(int paramInt1, int paramInt2, int paramInt3, ckT paramckT)
  {
    try
    {
      fz localfz = (fz)aCJ.Mm();
      localfz.tX(paramInt1);
      localfz.tY(paramInt2);
      localfz.tZ(paramInt3);
      localfz.a(paramckT);
      return localfz;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut sur un EndPlacementAction : ", localException);
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
  }

  private fz() {
    super(0, 0, 0);
  }

  protected long mC()
  {
    for (Su localSu : this.aCI.bgG()) {
      if ((localSu instanceof bKm)) {
        cew localcew = localSu.aeL();
        if (localcew.cgZ() == bRy.bYJ())
          bOJ.aE(localSu);
        bOJ.a(localcew, localcew.cgZ());
      }
    }

    if (byv.bFN().bFO().bGv() != this.aCI) {
      return 0L;
    }
    KO.Vm().a(new coS(cMS.ksg, bU.fH().getString("fight.start"), 3000));
    try {
      ((arl)this.aCI).Mh();
    } catch (Exception localException) {
      K.error("Erreur lors du placement : ", localException);
    }
    dLE.doY().t("isInFightCreationOrPlacement", Boolean.valueOf(false));
    return 0L;
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
}