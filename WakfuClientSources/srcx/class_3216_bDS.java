import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class bDS extends doA
{
  private static final int gzq = -2147483648;
  private static final aee bx = new bOO(new bbv());

  private static final qM by = new dzQ(new ec[] { new dLx("Défaut (on retire tous les effets)", new dmb[0]), new dLx("Désenvoutement avec l'id AGT", new dmb[] { new dmb("Id de l'effet a retirer (ID AGT)", dnN.lnR) }), new dLx("Désenvoutement avec l'id de l'action", new dmb[] { new dmb("Id de l'effet a retirer (ID de l'action)", dnN.lnR), new dmb("Pas d'utilité", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public bDS bMI()
  {
    bDS localbDS;
    try
    {
      localbDS = (bDS)bx.Mm();
      localbDS.aOr = bx;
    } catch (Exception localException) {
      localbDS = new bDS();
      localbDS.aOr = null;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    return localbDS;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    jJ(true);

    if ((this.eWL == null) || (this.evp == null) || (this.evp.atO() == null)) {
      return;
    }

    ArrayList localArrayList = new ArrayList();

    int j = ((dpI)this.eWL).bep() == 2 ? 1 : 0;
    int i;
    if (((dpI)this.eWL).bep() > 0) {
      i = ((dpI)this.eWL).a(0, cVC(), dNF.mei);
    }
    else {
      i = -2147483648;
    }

    for (Iterator localIterator = this.evp.atO().iterator(); localIterator.hasNext(); ) { localObject = (aVc)localIterator.next();

      if (((aVc)localObject).bkc() != null)
      {
        int k;
        if (j != 0)
          k = ((aVc)localObject).bkc().eo();
        else
          k = ((dpI)((doA)localObject).bkc()).yR();
        if ((((doA)localObject).bkc() != null) && (i == k)) {
          localArrayList.add((doA)localObject);
        }
        else if ((J((aVc)localObject)) && 
          (((aVc)localObject).getId() != bsj.fTp.getId()))
        {
          if (i == -2147483648)
            localArrayList.add((doA)localObject);
        }
      }
    }
    Object localObject;
    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localObject = (doA)localIterator.next();
      ((doA)localObject).jI(true);
      this.evp.atO().G((aVc)localObject);
    }
  }

  private boolean J(aVc paramaVc)
  {
    int i = (paramaVc.bkc() != null) && (paramaVc.bkc().aMG() == 2) ? 1 : 0;
    if (i != 0) {
      boolean bool = ((aAU)paramaVc.bkc()).zI();
      if (!bool) {
        return false;
      }
    }
    if ((paramaVc instanceof bPD)) {
      localObject = ((bPD)paramaVc).bWk();
      if ((localObject != null) && ((((bJC)localObject).bRa()) || (!((bJC)localObject).zI()))) {
        return false;
      }
    }
    Object localObject = paramaVc.wa();
    if (localObject == null)
      return false;
    int j = ((Ce)localObject).nS();
    if (j == 3)
      return true;
    if (j == 1)
      return true;
    if (j != 11) {
      return false;
    }
    if (!(localObject instanceof bfE))
      return true;
    bfE localbfE = (bfE)localObject;
    return !localbfE.bsL().bHY();
  }

  public void a(aVc paramaVc)
  {
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