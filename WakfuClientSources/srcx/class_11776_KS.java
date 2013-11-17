import java.util.BitSet;
import org.apache.log4j.Logger;

public final class KS extends doA
{
  private static final aee bx = new bOO(new cqi());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public KS() {
    aH();
  }

  public KS Vr()
  {
    KS localKS;
    try {
      localKS = (KS)bx.Mm();
      localKS.aOr = bx;
    } catch (Exception localException) {
      localKS = new KS();
      localKS.aOr = null;
      localKS.eXg = false;
      K.error("Erreur lors d'un checkOut sur un VoodoolSplitEffect : " + localException.getMessage());
    }
    return localKS;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    jJ(true);
    if ((paramaVc == null) || (this.evo == null) || (this.evp == null)) {
      return;
    }
    if (paramaVc.getId() == bsj.fOV.getId()) {
      return;
    }
    if (this.evp.c(cfY.hBO)) {
      paramaVc.ee(true);
      return;
    }

    if (bkn().bkq() == null) {
      return;
    }
    dMT localdMT1 = (dMT)paramaVc.bke();
    dMT localdMT2 = (dMT)bkn().bkq().axG();

    if ((localdMT1 == null) || (localdMT2 == null) || (localdMT1.Fx() != localdMT2.Fx())) {
      return;
    }
    dpI localdpI = (dpI)paramaVc.bkc();
    if ((localdpI != null) && ((localdpI.aui().eL() != chY.hGe) || (localdpI.a(PY.coz))))
    {
      paramaVc.b(0, 50.0F, true);
    }

    aVc localaVc = paramaVc.bko();
    localaVc.j(this.evp);
    localaVc.a(dji.a(true, true, null));
    localaVc.bkr();
    localaVc.DV().set(2138);
    localaVc.bkz();
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    super.bc();
  }
}