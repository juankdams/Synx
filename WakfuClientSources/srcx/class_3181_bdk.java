import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class bdk extends dQi
{
  private static final aee bx = new bOO(new cHY());

  private static final qM by = new dzQ(new ec[] { new dLx("Param standard", new dmb[] { new dmb("Nb Cibles Max", dnN.lnS) }), new dLx("Check de critere sur les cibles", new dmb[] { new dmb("Nb Cibles Max", dnN.lnS), new dmb("Critere sur les cibles = 1, critere sur effet de base = 0 (defaut)", dnN.lnS) }) });
  private int fnY;
  private boolean fnZ;

  public qM aF()
  {
    return by;
  }

  public dQi xE()
  {
    bdk localbdk;
    try
    {
      localbdk = (bdk)bx.Mm();
      localbdk.aOr = bx;
    } catch (Exception localException) {
      localbdk = new bdk();
      localbdk.aOr = null;
      localbdk.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }

    localbdk.fnY = this.fnY;
    return localbdk;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    if ((this.mkv == null) && (bkt())) {
      return;
    }

    List localList1 = a((dpI)this.eWL, this.evo, this.ejP, this.eUw.getX(), this.eUw.getY(), this.eUw.IB());

    bZA localbZA = ((dpI)this.eWL).bew();
    ArrayList localArrayList = new ArrayList();
    int i = 0; for (int j = localList1.size(); i < j; i++) {
      List localList2 = (List)localList1.get(i);
      int k = 0; for (int m = localList2.size(); k < m; k++) {
        dle localdle = (dle)localList2.get(k);
        if (!localArrayList.contains(localdle))
        {
          if ((!this.fnZ) || (localbZA == null) || (localbZA.i(this.evo, localdle, this, this.ejP)))
          {
            localArrayList.add(localdle);
          }
        }
      }
    }
    Collections.shuffle(localArrayList);
    this.fnY = Math.min(localArrayList.size(), this.fnY);
    for (i = 0; i < this.fnY; i++)
      a(this.mkv.iterator(), paramaVc, false, (dle)localArrayList.get(i));
  }

  private void a(Iterator paramIterator, aVc paramaVc, boolean paramBoolean, dle paramdle)
  {
    dji localdji = dji.a(paramBoolean, false, (doA)paramaVc);
    if ((a(PY.coL)) && (localdji.cRW() == -1))
      localdji.Ao(cVC());
    try
    {
      a(paramIterator, localdji, paramdle);
    } catch (Exception localException) {
      K.error("Exception levee lors de l'execution d'un groupe d'effets id " + ((dpI)this.eWL).yR(), localException);
    } finally {
      localdji.release();
    }
  }

  private void a(Iterator paramIterator, ZS paramZS, dle paramdle) {
    while (paramIterator.hasNext()) {
      dpI localdpI = (dpI)paramIterator.next();
      localdpI.a(wa(), bke(), aIq(), bsj.bAv(), paramdle.fa(), paramdle.fb(), paramdle.fc(), paramdle, paramZS);
    }
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    this.fnZ = false;

    if (((dpI)this.eWL).bep() >= 1)
      this.fnY = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 2)
      this.fnZ = (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1);
    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM != null)
      this.mkv = localaLM.bi(cVC());
  }

  boolean D(aVc paramaVc)
  {
    if ((((dpI)this.eWL).bep() >= 2) && (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1))
      return true;
    return super.D(paramaVc);
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
    super.bc();
    this.fnY = -1;
    this.fnZ = false;
  }
}