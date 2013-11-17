import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class oy extends doA
{
  private static final aee bx = new bOO(new dvb());

  private static final qM by = new dzQ(new ec[] { new dLx("Zones", new dmb[] { new dmb("Zone a retirer (-1 pour tout retirer)", dnN.lnR), new dmb("Zone a poser (infinie) (-1 pour ne rien poser)", dnN.lnR) }), new dLx("Zones", new dmb[] { new dmb("Zone a retirer", dnN.lnR), new dmb("Zone a poser (-1 pour ne rien poser)", dnN.lnR), new dmb("Durée (0=durée de l'effet, 1=infinie(defaut))", dnN.lnS) }) });
  private static final int aTH = -1;
  private int aTI;
  private int aTJ;
  private boolean aTK;

  public qM aF()
  {
    return by;
  }

  public oy() {
    aH();
  }

  public oy vV()
  {
    oy localoy;
    try {
      localoy = (oy)bx.Mm();
      localoy.aOr = bx;
    } catch (Exception localException) {
      localoy = new oy();
      localoy.aOr = null;
      localoy.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RemoveArea : " + localException.getMessage());
    }
    return localoy;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() < 1) {
      return;
    }
    this.aTI = ((dpI)this.eWL).a(0, cVC(), dNF.meh);

    if (((dpI)this.eWL).bep() < 2)
      this.aTJ = -1;
    else {
      this.aTJ = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    }

    if (((dpI)this.eWL).bep() < 3)
      this.aTK = true;
    else
      this.aTK = (((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    if (this.ejP == null) {
      return;
    }

    Object localObject1 = null;
    if ((this.evp == null) || (!(this.evp instanceof cjK))) {
      localObject2 = this.ejP.LC().bbj();
      for (localObject3 = ((Collection)localObject2).iterator(); ((Iterator)localObject3).hasNext(); ) { cjK localcjK = (cjK)((Iterator)localObject3).next();
        if (!d(localcjK))
        {
          if (localcjK.B(this.eUw)) {
            localObject1 = localcjK;
            break;
          }
        } }
      this.evp = ((dle)localObject1);
    } else {
      localObject1 = (cjK)this.evp;
      if (d((cjK)localObject1)) {
        localObject1 = null;
      }
    }

    if (localObject1 == null) {
      cVD();
      return;
    }

    if (!((cjK)localObject1).clx()) {
      cVD();
      return;
    }

    b(paramaVc, paramBoolean);

    Object localObject2 = ((cjK)localObject1).axG();
    this.ejP.LC().h((cjK)localObject1);

    if (this.aTJ == -1) {
      return;
    }

    Object localObject3 = bIL.a(this.ejP, this.eUw, this.aTJ);
    ((bIL)localObject3).i((dle)localObject2);
    ((bIL)localObject3).ge(this.aTK);

    ((bIL)localObject3).cD((short)1);
    ((bIL)localObject3).b(this.eWL);
    ((bIL)localObject3).b(wa());
    ((bIL)localObject3).u(this);
    ((bIL)localObject3).bkz();
    if (localObject2 != null)
      ((dle)localObject2).atO().F((aVc)localObject3);
  }

  protected boolean d(cjK paramcjK)
  {
    return (this.aTI != -1) && (paramcjK.clt() != this.aTI);
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public void bc()
  {
    this.aTI = 0;
    this.aTJ = 0;
    super.bc();
  }
}