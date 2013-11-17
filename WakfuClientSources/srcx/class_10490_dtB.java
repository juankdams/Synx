import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class dtB extends doA
{
  private static final aee bx = new bOO(new sC());

  private static final qM by = new dzQ(new ec[] { new dLx("Default", new dmb[0]), new dLx("Annulation de l'effet à rediriger", new dmb[] { new dmb("Annulation de l'effet déclencheur (1=oui, non, sinon)", dnN.lnR) }) });

  private boolean lwC = false;

  public qM aF()
  {
    return by;
  }

  public dtB()
  {
    aH();
  }

  public dtB cZO()
  {
    dtB localdtB;
    try {
      localdtB = (dtB)bx.Mm();
      localdtB.aOr = bx;
    } catch (Exception localException) {
      localdtB = new dtB();
      localdtB.aOr = null;
      localdtB.eXg = false;
      localdtB.lwC = this.lwC;
      K.error("Erreur lors d'un checkOut sur un ExecuteTriggeringEffectInEffectZone : " + localException.getMessage());
    }
    return localdtB;
  }

  public void a(aVc paramaVc)
  {
    if ((this.eWL == null) || (((dpI)this.eWL).bep() < 1))
    {
      this.lwC = false;
    }
    else
    {
      this.lwC = (1 == ((dpI)this.eWL).a(0, cVC(), dNF.meh));
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    aVc localaVc = W(paramaVc);
    if (localaVc == null) {
      K.error("On ne peut pas executer un " + getClass().getSimpleName() + " sans effet declencheur, id = " + yR());
      return;
    }

    s((doA)localaVc);

    if (this.lwC)
    {
      dji localdji = (dji)localaVc.bkh();
      if (localdji == null)
      {
        localdji = dji.a(false, false, null);
        localaVc.a(localdji);
      }
      localdji.cRY();
    }
  }

  private void s(doA paramdoA) {
    if ((this.eWL == null) || (((dpI)this.eWL).aui() == null)) {
      return;
    }
    duF localduF = paramdoA.bkc();
    if (localduF == null) {
      return;
    }
    bbH localbbH = ((dpI)this.eWL).aui();

    Iterable localIterable = dtf.cZk().a(this.evp, this.ejP.LE(), localbbH, this.eUw.getX(), this.eUw.getY(), this.eUw.IB());

    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = localIterable.iterator(); localIterator.hasNext(); ) { localObject = (dle)localIterator.next();

      cYk localcYk = ((dle)localObject).ML();
      if (!localArrayList.contains(localcYk))
      {
        localArrayList.add(localcYk);
      }
    }
    Object localObject;
    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localObject = (cYk)localIterator.next();
      localduF.a(wa(), bke(), aIq(), bsj.bAv(), ((cYk)localObject).getX(), ((cYk)localObject).getY(), ((cYk)localObject).IB(), null, a(paramdoA, false));
    }
  }

  private dji a(doA paramdoA, boolean paramBoolean)
  {
    dji localdji = dji.a(paramBoolean, false, paramdoA);
    localdji.Ao(paramdoA.cVC());
    localdji.jt(false);
    return localdji;
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

  public void bc()
  {
    super.bc();
    this.lwC = false;
  }
}