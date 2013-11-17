import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class aVk extends dQi
{
  private static final qM by = new dzQ(new ec[] { new dLx("groupe d'effets standard", new dmb[] { new dmb("nb d'effets à executer", dnN.lnR) }), new dLx("groupe d'effets ciblé", new dmb[] { new dmb("nb d'effets à executer", dnN.lnR), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS) }), new dLx("Gestion de la tansmission de la cible originale", new dmb[] { new dmb("nb d'effets à executer", dnN.lnR), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS) }) });

  protected int eXw = -1;

  private static final aee bx = new bOO(new aKq());

  public aVk xD()
  {
    aVk localaVk;
    try
    {
      localaVk = (aVk)bx.Mm();
      localaVk.aOr = bx;
    } catch (Exception localException) {
      localaVk = new aVk();
      localaVk.aOr = null;
      K.error("Erreur lors d'un newInstance sur un RandomRunningEffectGroup : " + localException.getMessage());
    }
    a(localaVk);
    return localaVk;
  }

  protected void a(aVk paramaVk) {
    paramaVk.eXw = this.eXw;
    paramaVk.mkt = this.mkt;
    paramaVk.mkv = null;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    if (!bkt()) {
      return;
    }
    List localList = bkZ();

    dji localdji = dji.a(true, false, (doA)paramaVc);
    if ((a(PY.coL)) && (localdji.cRW() == -1)) {
      localdji.Ao(cVC());
    }
    for (dpI localdpI : localList)
      if (aM()) {
        localdpI.a(wa(), bke(), aIq(), bsj.bAv(), this.evp.fa(), this.evp.fb(), this.evp.fc(), this.mkt ? this.evp : null, localdji);
      } else {
        if ((this.eWL == null) || (((dpI)this.eWL).aui() == null))
          return;
        a(localdji, localdpI);
      }
  }

  private void a(dji paramdji, dpI paramdpI)
  {
    UG localUG = this.ejP.LB();
    if (localUG == null) {
      K.warn("pas de fightmap sur le context " + this.ejP);
      return;
    }

    cYk localcYk = new cYk(bkg());
    bbH localbbH = ((dpI)this.eWL).aui();
    Iterable localIterable = localbbH.b(this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), this.evo.fa(), this.evo.fb(), this.evo.fc(), this.evo.E());

    for (int[] arrayOfInt : localIterable) {
      localcYk.setX(arrayOfInt[0]);
      localcYk.setY(arrayOfInt[1]);
      if (localUG.aq(localcYk.getX(), localcYk.getY()))
      {
        short s = localUG.aw(localcYk.getX(), localcYk.getY());
        if (s != -32768)
        {
          localcYk.dG(s);

          if (localUG.p(localcYk.getX(), localcYk.getY()))
            paramdpI.a(wa(), bke(), aIq(), bsj.bAv(), localcYk.getX(), localcYk.getY(), localcYk.IB(), null, paramdji); 
        }
      }
    }
  }

  private boolean d(dpI paramdpI) { if (paramdpI.zB() > cVC())
      return false;
    if (paramdpI.zC() < cVC()) {
      return false;
    }
    bZA localbZA = paramdpI.bew();
    if (localbZA != null) if (!localbZA.i(this.evo, aM() ? this.evp : this.eUw, null, this.ejP)) {
        return false;
      }
    return true; }

  private List bkZ()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mkv.iterator();
    while (localIterator.hasNext()) {
      localObject = (dpI)localIterator.next();
      if (d((dpI)localObject)) {
        localArrayList.add(localObject);
      }
    }
    Object localObject = new ArrayList();
    localIterator = localArrayList.iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      dpI localdpI1 = (dpI)localIterator.next();
      i = (int)(i + localdpI1.bm(cVC()));
    }

    for (int m = 0; m < this.eXw; m++) {
      int j = 0;
      int k = bCO.sf(i);
      localIterator = localArrayList.iterator();
      while (localIterator.hasNext()) {
        dpI localdpI2 = (dpI)localIterator.next();
        if (!((List)localObject).contains(localdpI2))
        {
          j = (int)(j + localdpI2.bm(cVC()));
          if (j >= k) {
            ((List)localObject).add(localdpI2);
            i = (int)(i - localdpI2.bm(cVC()));
            break;
          }
        }
      }
    }
    return localObject;
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM != null)
      this.mkv = localaLM.bi(s);
    this.eXw = ((dpI)this.eWL).a(0, s, dNF.mei);
    if (((dpI)this.eWL).bep() >= 3)
      this.mkt = (((dpI)this.eWL).a(2, s, dNF.mei) == 1);
  }

  public qM aF()
  {
    return by;
  }

  public boolean aM()
  {
    if ((this.eWL != null) && (((dpI)this.eWL).bep() >= 2)) {
      return ((dpI)this.eWL).nl(1) == 1.0F;
    }
    return true;
  }

  public boolean aN()
  {
    if ((this.eWL != null) && (((dpI)this.eWL).bep() >= 2)) {
      return ((dpI)this.eWL).nl(1) == 0.0F;
    }
    return false;
  }

  public void aJ()
  {
    super.aJ();
  }

  public void bc()
  {
    this.mkv = null;
    this.eXw = -1;
    this.mkt = false;
    super.bc();
  }
}