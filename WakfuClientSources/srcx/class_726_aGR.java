import org.apache.log4j.Logger;

public class aGR extends bLe
{
  private final int eei;
  private int eej;

  public aGR(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt5);
    this.eei = paramInt4;
  }

  protected void kN()
  {
    if (!Ij()) {
      return;
    }
    arl localarl = (arl)mD();
    zu localzu = localarl.aDp();
    Su localSu = localzu.Ia();
    long l = bwv();

    if ((byv.bFN().c(cmT.cnA())) && (cmT.cnA().xg().getId() == l)) {
      byv.bFN().b(cmT.cnA());
    }
    a(localarl, localzu, localSu, l);

    byv.bFN().aJK().d(new dyw(localzu.AX()));
  }

  private void a(arl paramarl, zu paramzu, Su paramSu, long paramLong) {
    if (paramSu == null) {
      if (!paramzu.ak(paramLong)) {
        K.error("impossible de terminer le tour du fighter " + paramLong);
        paramarl.aDA();
      }
      return;
    }

    if (paramSu.getId() != bwv()) {
      K.info("fin de tour prématurée du client");
      return;
    }

    paramzu.bPN().a(paramLong, this.eei);
    paramzu.bPN().c(paramLong, this.eej);

    cew localcew = paramSu.aeL();
    if (paramarl.R(paramSu)) {
      localcew.dI(paramSu.Fx());
    }
    if (!paramarl.aK(paramSu)) {
      K.error("impossible de terminer le tour du fighter " + paramSu.getId());
      paramarl.aDA();
    }
  }

  protected void kO()
  {
  }

  public void mB(int paramInt) {
    this.eej = paramInt;
  }
}