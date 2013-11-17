import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ad extends doA
{
  private static final aee bx = new bOO(new dGm());

  private static final qM by = new dzQ(new ec[] { new dLx("Decurse d'etat", new dmb[] { new dmb("id de l'état à retirer", dnN.lnQ) }), new dLx("Decurse d'etat", new dmb[] { new dmb("id de l'état à retirer", dnN.lnQ), new dmb("Niveau de l'etat a retirer", dnN.lnS) }) });
  protected int bz;
  private boolean bA;

  public qM aF()
  {
    return by;
  }

  public ad() {
    aH();
  }

  public static ad a(cOE paramcOE, int paramInt, dle paramdle)
  {
    if ((!bB) && (paramdle == null)) throw new AssertionError("No target defined for StateDecurse effect");
    ad localad;
    try
    {
      localad = (ad)bx.Mm();
      localad.aOr = bx;
    } catch (Exception localException) {
      localad = new ad();
      localad.eXg = false;
      localad.aOr = null;
      K.error("Erreur lors d'un checkOut sur un ActionCost : " + localException.getMessage());
    }
    localad.aw = bsj.fSs.getId();
    localad.eWQ = ((doA)bsj.fSs.getObject()).DU();
    localad.aH();
    localad.evp = paramdle;
    localad.cxl = paramInt;
    localad.eWS = -1;
    localad.ejP = paramcOE;
    return localad;
  }

  public ad aG()
  {
    ad localad;
    try
    {
      localad = (ad)bx.Mm();
      localad.aOr = bx;
    } catch (Exception localException) {
      localad = new ad();
      localad.aOr = null;
      localad.eXg = false;
      K.error("Erreur lors d'un checkOut sur un StateDecurse : " + localException.getMessage());
    }
    return localad;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.evp == null) {
      K.warn("[Effect] Impossible d'appliquer un desenvoutement car la cible est null");
      jJ(true);
      return;
    }
    dDN localdDN = this.evp.atO();
    if (localdDN == null) {
      return;
    }
    int i = 0;
    i = a(localArrayList, localdDN, i);
    if (localArrayList.isEmpty()) {
      cVD();
      return;
    }

    for (aVc localaVc : localArrayList) {
      ((bgJ)localdDN).d(localaVc, true);
    }

    b(paramaVc, paramBoolean);

    if ((bkt()) && (this.bA) && (i > 0))
      a(i, paramaVc);
  }

  protected int a(ArrayList paramArrayList, dDN paramdDN, int paramInt)
  {
    for (aVc localaVc : paramdDN)
      if ((localaVc instanceof bPD))
      {
        bJC localbJC = ((bPD)localaVc).bWk();
        if ((localbJC.bQW() == this.cxl) && ((!localbJC.bRa()) || (bZG.hqe.contains(localbJC.bQW())))) {
          paramArrayList.add(localaVc);
          paramInt = localbJC.nU() - this.bz;
        }
      }
    return paramInt;
  }

  private void a(int paramInt, aVc paramaVc)
  {
    int i = bJC.I((short)this.cxl, (short)paramInt);
    bPD localbPD = bPD.a(this.ejP, this.evo, (bqk)this.eWM, i);

    if (localbPD == null) {
      K.error("Etat inconnu id " + this.cxl + ", level " + paramInt + ", effet correspondant : " + (this.eWL != null ? Integer.valueOf(((dpI)this.eWL).yR()) : "null"));

      return;
    }

    dji localdji = dji.a(true, false, null);
    localbPD.a(localdji);
    localbPD.b(this.eWM);
    localbPD.b(aI());
    localbPD.e(auc());
    localbPD.u(paramaVc);
    localbPD.k(this.evp);
    localbPD.release();
  }

  private dpI aI() {
    if (bkc() == null) {
      return dzg.dcV();
    }
    if (((dpI)bkc()).on()) {
      if (((dpI)bkc()).om()) {
        return cfw.cip();
      }
      return aVy.blb();
    }
    if (((dpI)bkc()).om()) {
      return bIw.bPE();
    }
    return dzg.dcV();
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();

    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
    if (((dpI)this.eWL).bep() > 1) {
      this.bz = ((dpI)this.eWL).a(1, s, dNF.meh);
      this.bA = true;
    }
  }

  public void m(int paramInt) {
    this.bz = paramInt;
    if (paramInt > 0)
      this.bA = true;
  }

  public void aJ()
  {
    this.bA = false;
    this.bz = 0;
    super.aJ();
  }

  public void aK()
  {
    super.aK();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }
}