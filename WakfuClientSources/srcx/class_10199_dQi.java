import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dQi extends doA
{
  private static final aee bx = new bOO(new dQj());

  protected static final qM by = new dzQ(new ec[] { new dLx("groupe d'effet standard", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR) }), new dLx("groupe de réussite", new dmb[] { new dmb("nb maximum d'effect à réussir", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS) }), new dLx("groupe d'effet ciblé", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS) }), new dLx("groupe d'effet ciblé, probabilité relative", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS) }), new dLx("Gestion de la tansmission de la cible originale", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles  (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS) }), new dLx("Change le caster du groupe d'effet pas sa cible", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS) }) });

  private boolean mko = false;
  private byte mkp = 0;
  private byte mkq = 0;
  private boolean mkr = false;
  private boolean mks = false;
  private int eXw = -1;
  protected boolean mkt = true;
  private boolean mku = false;

  private final BitSet gLk = new BitSet();
  protected aLM mkv;
  private final ArrayList mkw = new ArrayList();

  public qM aF()
  {
    return by;
  }

  public dQi xE()
  {
    dQi localdQi;
    try
    {
      localdQi = (dQi)bx.Mm();
      localdQi.aOr = bx;
    } catch (Exception localException) {
      localdQi = new dQi();
      localdQi.aOr = null;
      localdQi.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    localdQi.gLk.clear();
    localdQi.mkv = null;
    localdQi.mko = this.mko;
    localdQi.mkp = this.mkp;
    localdQi.mkq = this.mkq;
    localdQi.mkr = this.mkr;
    localdQi.mks = this.mks;
    localdQi.eXw = this.eXw;
    localdQi.mkt = this.mkt;
    localdQi.mkt = this.mkt;
    return localdQi;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.mkv != null) && (bkt())) {
      if (this.mku) {
        if (this.evp != null)
          this.evo = this.evp;
        else {
          K.error("On veut changer le caster d'un groupe d'effet pas la cible mais la cible est nulle, on ne fait rien");
        }
      }
      if (this.mks) {
        int i = cVC();

        int j = 0;
        this.mkw.clear();

        for (Iterator localIterator = this.mkv.iterator(); localIterator.hasNext(); ) { localdpI = (dpI)localIterator.next();

          Iterable localIterable = dtf.cZk().a(bke(), this.ejP.LE(), localdpI.beA(), this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), localdpI.atZ());
          if (!localIterable.iterator().hasNext())
          {
            int k = localdpI.zB();
            int m = localdpI.zC();

            if ((i >= k) && (i <= m))
            {
              if (localdpI.aug()) {
                j = (short)(int)(j + localdpI.bm(i));
                this.mkw.add(localdpI);
              }
              else if (localdpI.bew() != null) {
                if (localdpI.bew().i(paramaVc != null ? paramaVc.bke() : this.evo, this.evp, this, this.ejP)) {
                  j = (short)(int)(j + localdpI.bm(i));
                  this.mkw.add(localdpI);
                }
              } else {
                j = (short)(int)(j + localdpI.bm(i));
                this.mkw.add(localdpI);
              }
            }
          }
        }
        dpI localdpI;
        localIterator = this.mkw.iterator();
        while (localIterator.hasNext()) {
          localdpI = (dpI)localIterator.next();
          if (dpe.AX(j) > bMr.ax(localdpI.bm(i))) {
            localIterator.remove();
          }
        }
        a(this.mkw.iterator(), paramaVc, true);
      } else {
        a(this.mkv.iterator(), paramaVc, false);
      }
    }
    jJ(true);
  }

  private void a(Iterator paramIterator, aVc paramaVc, boolean paramBoolean) {
    dji localdji = a((doA)paramaVc, paramBoolean);
    try {
      if ((a(PY.coL)) && (localdji.cRW() == -1)) {
        localdji.Ao(cVC());
      }
      a(paramIterator, localdji);
    } catch (Exception localException) {
      K.error("Exception levee lors de l'execution d'un groupe d'effets id " + (this.eWL == null ? -1 : ((dpI)this.eWL).yR()), localException);
    } finally {
      localdji.release();
    }
  }

  protected dji a(doA paramdoA, boolean paramBoolean) {
    dji localdji = dji.a(paramBoolean, false, paramdoA);
    localdji.jt(false);
    return localdji;
  }

  private void a(Iterator paramIterator, dji paramdji) {
    int i = 0;
    int j = 0;

    while (paramIterator.hasNext()) {
      dpI localdpI = (dpI)paramIterator.next();
      if (!a(localdpI, j, i)) {
        break;
      }
      if ((this.eXw > 0) && 
        (this.mkr ? 
        j >= this.eXw : 
        i >= this.eXw))
        break;
      bbq localbbq;
      if (aM()) {
        if (this.evp == null) {
          K.error("Impossible d'executer l'effet " + localdpI.yR() + " on a plus de cible");
          return;
        }
        try
        {
          localbbq = localdpI.a(wa(), bke(), aIq(), bsj.bAv(), this.evp.fa(), this.evp.fb(), this.evp.fc(), this.mkt ? this.evp : null, paramdji);
        }
        catch (Exception localException) {
          K.error("Pb a l''execution de l'effet " + localdpI.yR(), localException);
          return;
        }

        if ((localbbq != null) && (localbbq.bpY() > 0))
          j++;
        i++;
      }
      else {
        cYk localcYk = new cYk(bkg());

        if ((this.eWL != null) && (((dpI)this.eWL).aui() != null))
        {
          bbH localbbH = ((dpI)this.eWL).aui();
          Iterable localIterable = localbbH.b(this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), this.evo.fa(), this.evo.fb(), this.evo.fc(), this.evo.E());

          Iterator localIterator = localIterable.iterator();
          while (localIterator.hasNext()) {
            int[] arrayOfInt = (int[])localIterator.next();
            localcYk.setX(arrayOfInt[0]);
            localcYk.setY(arrayOfInt[1]);

            if (aq(localcYk))
            {
              if (this.ejP.LB().p(localcYk.getX(), localcYk.getY())) {
                localbbq = localdpI.a(wa(), bke(), aIq(), bsj.bAv(), localcYk.getX(), localcYk.getY(), localcYk.IB(), null, paramdji);
                if ((localbbq != null) && (localbbq.bpY() > 0))
                  j++;
                i++;
              }
            }
            if ((this.eXw > 0) && 
              (this.mkr ? 
              j >= this.eXw : 
              i >= this.eXw))
              break;
          }
        }
      }
    }
  }

  protected boolean a(dpI paramdpI, int paramInt1, int paramInt2)
  {
    return true;
  }

  private boolean aq(cYk paramcYk) {
    UG localUG = this.ejP.LB();
    if (localUG == null) {
      K.error("On tente d'execute un groupe d'effets sur cellule sans FightMap " + ((dpI)this.eWL).yR());
      return false;
    }
    if (localUG.aq(paramcYk.getX(), paramcYk.getY())) {
      short s = localUG.aw(paramcYk.getX(), paramcYk.getY());
      if (s != -32768) {
        paramcYk.dG(s);
        return true;
      }
    }
    return false;
  }

  public void aK()
  {
    super.aK();
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    this.mkv = null;
    this.mkr = false;
    this.mks = false;
    this.mku = false;
    this.eXw = 0;
    if (this.eWL == null) {
      return;
    }
    if (dap.cMI() == null) {
      return;
    }
    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM != null) {
      this.mkv = localaLM.bi(s);
    }
    this.eXw = ((dpI)this.eWL).a(0, s, dNF.meh);

    if (((dpI)this.eWL).bep() >= 2) {
      this.mkr = (((dpI)this.eWL).a(1, s, dNF.meh) == 1);
    }

    if (((dpI)this.eWL).bep() >= 4) {
      this.mks = (((dpI)this.eWL).a(3, s, dNF.meh) == 1);
    }

    if (((dpI)this.eWL).bep() >= 5) {
      this.mkt = (((dpI)this.eWL).a(4, s, dNF.meh) == 1);
    }

    if (((dpI)this.eWL).bep() >= 6)
      this.mku = (((dpI)this.eWL).a(5, s, dNF.meh) == 1);
  }

  public boolean aL()
  {
    return true;
  }

  protected boolean afW()
  {
    return true;
  }

  public boolean drj() {
    return this.mku;
  }

  public boolean drk() {
    return this.mkt;
  }

  public boolean aM()
  {
    if ((this.eWL != null) && (((dpI)this.eWL).bep() >= 3)) {
      return ((dpI)this.eWL).nl(2) == 1.0F;
    }
    return true;
  }

  public boolean aN()
  {
    if ((this.eWL != null) && (((dpI)this.eWL).bep() >= 3)) {
      return ((dpI)this.eWL).nl(2) == 0.0F;
    }
    return false;
  }

  public void bc() {
    super.bc();
    this.mko = false;
    this.mkp = 0;
    this.mkq = 0;
    this.mkr = false;
    this.mks = false;
    this.eXw = -1;
    this.mkt = true;
    this.mku = false;
    this.mkv = null;
  }
}