import java.util.BitSet;
import org.apache.log4j.Logger;

public final class Zn extends doA
{
  public static final qM by = new dzQ(new ec[] { new dLx("Punition", new dmb[] { new dmb("Dmg de base", dnN.lnR), new dmb("Seuil (en % de vie restant)", dnN.lnR), new dmb("Ratio (combien de % de dommages sup pour chaque % de vie en moins, en dessous du seuil", dnN.lnR) }) });

  private static final aee bx = new bOO(new clC());
  private int cKv;
  private byte cKw;
  private float cKx;

  public qM aF()
  {
    return by;
  }

  public Zn()
  {
  }

  Zn(int paramInt, float paramFloat, byte paramByte)
  {
    this.cKv = paramInt;
    this.cKx = paramFloat;
    this.cKw = paramByte;
  }

  public aVc aO() {
    Zn localZn;
    try {
      localZn = (Zn)bx.Mm();
      localZn.aOr = bx;
    } catch (Exception localException) {
      localZn = new Zn();
      localZn.aOr = null;
      K.error("Erreur lors d'un newInstance sur un HPLoss : " + localException.getMessage());
    }

    localZn.cKv = this.cKv;
    localZn.cKw = this.cKw;
    localZn.cKx = this.cKx;
    return localZn;
  }

  public void a(aVc paramaVc) {
    if ((this.evo == null) || (this.evp == null))
      return;
    if (!this.evo.b(eu.ayM))
      return;
    if (!this.evp.b(eu.ayM))
      return;
    akw();
    cqm localcqm = this.evo.a(eu.ayM);
    int i = localcqm.value() * 100 / localcqm.max();
    hs(i);
  }

  void hs(int paramInt) {
    this.cxl = this.cKv;
    if (paramInt >= this.cKw)
      return;
    int i = this.cKw - paramInt;
    int j = (int)(i * this.cKx);
    this.cxl += this.cxl * j / 100;
  }

  private void akw() {
    short s = cVC();
    this.cKv = ((dpI)this.eWL).a(0, s, dNF.mei);
    this.cKw = ((byte)((dpI)this.eWL).a(1, s, dNF.mei));
    this.cKx = ((dpI)this.eWL).o(2, s);
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    bFw localbFw = bFw.a(aIq(), bTI.heX, dnO.lnU, this.cxl, this.evp);
    localbFw.i(this.evo);
    localbFw.c(localbFw.bNo(), (this.eWL != null) && (((dpI)this.eWL).cL(1L)), (this.eWL != null) && (((dpI)this.eWL).zi()));

    localbFw.b(bkc());
    localbFw.c(null, false);
    jJ(true);
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(2);
  }

  public boolean aL() {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  protected boolean afW()
  {
    return true;
  }
}