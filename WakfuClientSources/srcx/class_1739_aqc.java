import java.util.ArrayList;

public final class aqc
{
  private static final int dxy = 0;
  private arl aXG = null;
  private ZH dxz;
  private ctJ dxA;
  private Kh dxB;
  private dpw dxC;
  private ei dxD;
  private aFf dxE;

  public void execute()
  {
    a(new bSR[] { ctJ.a(dqt.cXz(), dPD.mhH.bJ(), 0, "fight.beginning"), this.dxz, ccQ.a(dqt.cXz(), dPD.mhM.bJ(), 0, aCm()), this.dxA, this.dxB, this.dxC, this.dxD, this.dxE });

    bnc.bxw().d(this.aXG);
  }

  private ArrayList aCm() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(aKj.bbx());
    localArrayList.add(axB.aIZ());
    localArrayList.add(bIR.bQl());
    return localArrayList;
  }

  private void a(bSR[] paramArrayOfbSR) {
    for (int i = 0; i < paramArrayOfbSR.length; i++) {
      bSR localbSR = paramArrayOfbSR[i];
      a(localbSR);
    }
  }

  private void a(bSR parambSR) {
    bnc.bxw().a(this.aXG, parambSR);
  }

  public void reset() {
    this.dxz = null;
    this.dxA = null;
    this.dxB = null;
    this.dxC = null;
    this.dxD = null;
    this.dxE = null;
  }

  public void e(arl paramarl) {
    this.aXG = paramarl;
  }

  public void a(ctJ paramctJ) {
    this.dxA = paramctJ;
  }

  public void a(aFf paramaFf) {
    this.dxE = paramaFf;
  }

  public void a(ei paramei) {
    this.dxD = paramei;
  }

  public void a(dpw paramdpw) {
    this.dxC = paramdpw;
  }

  public void a(Kh paramKh) {
    this.dxB = paramKh;
  }

  public void a(Su paramSu, cYk paramcYk) {
    if (this.dxz == null)
      this.dxz = ZH.a(dqt.cXz(), dPD.mhD.bJ(), 0, paramSu, paramcYk);
    else
      this.dxz.a(paramSu, paramcYk);
  }
}