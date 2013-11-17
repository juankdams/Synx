import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public final class agK extends doA
{
  private static final aee bx = new bOO(new cVw());

  private static final qM by = new dzQ(new ec[] { new dLx("valeur de l'absorption", new dmb[] { new dmb("Absorption des dégats en % ", dnN.lnR), new dmb("Base Id des blocs ", dnN.lnS) }) });
  private int daE;

  public qM aF()
  {
    return by;
  }

  public agK() {
    aH();
  }

  public agK asn()
  {
    agK localagK;
    try {
      localagK = (agK)bx.Mm();
      localagK.aOr = bx;
    } catch (Exception localException) {
      localagK = new agK();
      localagK.aOr = null;
      localagK.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SteamerBlockDamageRedirection : " + localException.getMessage());
    }
    return localagK;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    this.daE = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt())
      return;
    cVD();
    Object localObject1 = paramaVc;
    if (localObject1 == null) {
      localObject2 = (dji)bkh();
      localObject1 = localObject2 == null ? null : ((dji)localObject2).cRV();
    }

    if (localObject1 == null) {
      K.error("Cet effet doit être déclenché");
      return;
    }

    if (!((aVc)localObject1).DV().get(2)) {
      K.error("Cet effet doit être déclenché par une perte de pdv");
      return;
    }

    Object localObject2 = aso();
    if (((List)localObject2).isEmpty()) {
      return;
    }

    int i = ((aVc)localObject1).getValue() * this.cxl / 100;
    if (i == 0) {
      return;
    }
    h((List)localObject2);
    int j = a((List)localObject2, i, (aVc)localObject1);

    ((aVc)localObject1).b(1, -j, false);
  }

  private int a(List paramList, int paramInt, aVc paramaVc) {
    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM == null) {
      return 0;
    }
    if (localaLM.bdo() != 1) {
      K.error("On ne peut pas qu'un seul effet dans un groupe d'effet de ce type " + ((dpI)this.eWL).yR());
      return 0;
    }

    int[] arrayOfInt = { paramInt };
    for (cjK localcjK : paramList) {
      dji localdji = a((doA)paramaVc, true);
      localdji.a(new cVx(this, arrayOfInt));

      int i = localcjK.e(eu.ayM);
      localdji.Ap(Math.min(i, arrayOfInt[0]));

      dpI localdpI = localaLM.nc(0);
      localdpI.a(wa(), bke(), aIq(), bsj.bAv(), localcjK.fa(), localcjK.fb(), localcjK.fc(), localcjK, localdji);

      if (arrayOfInt[0] <= 0) {
        break;
      }
    }
    return paramInt - arrayOfInt[0];
  }

  private dji a(doA paramdoA, boolean paramBoolean) {
    dji localdji = dji.a(paramBoolean, false, paramdoA);
    localdji.jt(false);
    return localdji;
  }

  private void h(List paramList) {
    Collections.sort(paramList, new cVv(this));
  }

  public List aso()
  {
    aJD localaJD = aIq().LC();
    if (localaJD == null) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList();
    Collection localCollection = localaJD.bbj();
    for (cjK localcjK : localCollection) {
      if ((localcjK.clt() == this.daE) && (localcjK.axG() == this.evo)) {
        localArrayList.add(localcjK);
      }
    }
    return localArrayList;
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
    this.daE = 0;
  }
}