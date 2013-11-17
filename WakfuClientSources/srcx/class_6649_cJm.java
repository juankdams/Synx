import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class cJm extends doA
{
  private static final aee bx = new bOO(new jd());

  private static final qM by = new dzQ(new ec[] { new dLx("Ratio dgts/lvl", new dmb[] { new dmb("Ratio degats/level", dnN.lnR) }), new dLx("Drop améliorer", new dmb[] { new dmb("Ratio degats/level", dnN.lnR), new dmb("Drop Amélioré (1 = oui, 0 = non (defaut)", dnN.lnS) }) });
  private int cQL;
  private boolean iDZ;

  public qM aF()
  {
    return by;
  }

  public cJm() {
    aH();
  }

  public cJm cDy()
  {
    cJm localcJm;
    try {
      localcJm = (cJm)bx.Mm();
      localcJm.aOr = bx;
    } catch (Exception localException) {
      localcJm = new cJm();
      localcJm.aOr = null;
      localcJm.eXg = false;
      K.error("Erreur lors d'un checkOut sur un DropFromLootArea : " + localException.getMessage());
    }
    return localcJm;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null) {
      return;
    }

    if (((dpI)this.eWL).bep() < 1) {
      return;
    }

    this.cQL = ((dpI)this.eWL).a(0, cVC(), dNF.meh);

    if (((dpI)this.eWL).bep() < 2) {
      this.iDZ = false;
      return;
    }

    this.iDZ = (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    cVD();

    cdr localcdr = null;
    if ((this.eWM instanceof cdr)) {
      localcdr = (cdr)this.eWM;
    }

    if (!(this.ejP instanceof dMC)) {
      cVD();
      return;
    }

    dbE localdbE = ((dMC)this.ejP).dps();
    if (localcdr == null) {
      localObject1 = localdbE.LC().bbj();
      for (localObject2 = ((Collection)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) {
        cjK localcjK = (cjK)((Iterator)localObject2).next();
        if ((localcjK.getType() == xj.bpw.xj()) && (localcjK.B(this.eUw))) {
          localcdr = (cdr)localcjK;
          break;
        }
      }
    }

    Object localObject1 = (this.evo instanceof bqi) ? (bqi)this.evo : new cZb();

    this.cxl = localdbE.a((aDW)localcdr.axG(), (bqi)localObject1, false, this.iDZ);

    if (this.cxl == 0) {
      return;
    }

    Object localObject2 = Hh.QM().dh(this.cxl);
    int i = ((bBn)localObject2).nU();
    int j = this.cQL * i;

    bFw localbFw = bFw.a(this.ejP, bTI.heZ, dnO.lnU, j, null);
    localbFw.bkr();
    localbFw.b(bkc());
    localbFw.i(this.evo);
    bbq localbbq = localbFw.a(bkc(), this.eWM, this.ejP, this.evo, this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), null, bkh());

    if (localbbq != null) {
      localbbq.release();
    }
    localbFw.release();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM() {
    return false;
  }

  public boolean aN() {
    return true;
  }

  public void bc() {
    this.cQL = 0;
    this.iDZ = false;
    super.bc();
  }
}