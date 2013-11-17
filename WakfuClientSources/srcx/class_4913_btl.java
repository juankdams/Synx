import java.util.Collection;

public class btl extends dqg
{
  private float gbN = 0.0F;
  private float gbO = 0.0F;
  private arl cUs;
  private UG iM;
  private byte gbP = -1;
  private final bKR gbQ = new bKR();
  private int gbR = 0;

  public void bc() {
    super.bc();

    this.gbN = 0.0F;
    this.gbO = 0.0F;

    this.cUs = null;
    this.iM = null;
    this.gbP = -1;
    this.gbQ.clear();
    this.gbR = 0;
  }

  public void reset() {
    this.cUs = null;
    this.iM = null;
    this.gbP = -1;
    this.gbR = 0;
  }

  public void a(arl paramarl, byte paramByte) {
    this.cUs = paramarl;
    this.iM = this.cUs.LB();
    this.gbP = paramByte;
  }

  protected float a(dHk paramdHk1, bep parambep1, dHk paramdHk2, bep parambep2, byte paramByte)
  {
    float f = super.a(paramdHk1, parambep1, paramdHk2, parambep2, paramByte);

    int i = parambep1.hY - this.hrQ - 1;
    int j = parambep1.hY + this.hrQ + 1;
    int k = parambep1.hZ - this.hrQ - 1;
    int m = parambep1.hZ + this.hrQ + 1;

    this.gbQ.clear();
    this.gbR = 0;
    cz(parambep1.hY, parambep1.hZ);

    for (int n = i; n <= j; n++) {
      for (int i1 = k; i1 <= m; i1++) {
        cy(n, i1);
      }
    }

    f += this.gbQ.size() * this.gbN + this.gbR * this.gbO;

    this.gbQ.clear();
    this.gbR = 0;
    return f;
  }

  private void cy(int paramInt1, int paramInt2) {
    if (!this.iM.p(paramInt1, paramInt2)) {
      return;
    }

    dhJ localdhJ = this.cUs.bo(paramInt1, paramInt2);
    if (localdhJ == null) {
      return;
    }
    if (localdhJ.aLY() != 20) {
      return;
    }
    Su localSu = (Su)localdhJ;
    if (localSu.Fx() == this.gbP) {
      return;
    }
    if (localSu.afk()) {
      return;
    }
    this.gbQ.add(localdhJ.getId());
  }

  private void cz(int paramInt1, int paramInt2) {
    if (!this.iM.p(paramInt1, paramInt2)) {
      return;
    }
    Collection localCollection = this.cUs.bbj();
    if (localCollection.isEmpty()) {
      return;
    }

    for (cjK localcjK : localCollection) {
      xj localxj = xj.dA(localcjK.getType());
      int i;
      switch (bNA.gSH[localxj.ordinal()]) {
      case 1:
      case 2:
      case 3:
        i = 1;
        break;
      case 4:
      case 5:
      default:
        i = 0;
      }
      if (i != 0)
      {
        if ((localcjK.P(paramInt1, paramInt2, (short)0)) && (n(localcjK)))
          this.gbR += 1;
      }
    }
  }

  private boolean n(cjK paramcjK) {
    cjT localcjT = paramcjK.bKe();
    int i = 0; for (int j = localcjT.size(); i < j; i++) {
      duF localduF = (duF)localcjT.get(i);
      doA localdoA = (doA)bsj.bAv().kD(localduF.eo());
      if (localdoA != null)
      {
        if (localdoA.DU() == cMe.krl)
          return true; 
      }
    }
    return false;
  }

  public void bt(float paramFloat) {
    this.gbN = paramFloat;
  }

  public void bu(float paramFloat) {
    this.gbO = paramFloat;
  }
}