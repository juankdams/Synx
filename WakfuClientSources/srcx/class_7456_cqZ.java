import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class cqZ extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private aOw iaE;
  private agp iaF;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public cqZ(ArrayList paramArrayList) {
    J(paramArrayList);

    String str = ((cic)paramArrayList.get(0)).getValue().toLowerCase();
    if (str.equals("mine"))
      this.iaF = agp.cZN;
    else if (str.equals("allies"))
      this.iaF = agp.cZO;
    else if (str.equals("ennemies"))
    {
      this.iaF = agp.cZP;
    } else if (str.equals("all"))
      this.iaF = agp.cZQ;
    else {
      throw new aIh("paramètre invalude dans une " + getClass().getSimpleName() + " : '" + str + "'");
    }
    this.iaE = ((aOw)paramArrayList.get(1));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (paramObject4 == null) {
      throw new aIh("Pas de contexte...");
    }
    if (paramObject3 == null) {
      return 0L;
    }

    if (!(paramObject3 instanceof aVc))
    {
      K.error("CriterionContent attendu, mais pas de type RunningEffect. Ce critère ne peut s'utiliser que comme critère sur un effet.");
      return 0L;
    }

    cYk localcYk1 = aAw.d(true, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localcYk1 == null)
    {
      K.error("Unable to compute target position");
      return 0L;
    }

    axQ localaxQ = aAw.b(false, paramObject1, paramObject2, paramObject3, paramObject4);
    if ((localaxQ == null) && (this.iaF != agp.cZQ)) {
      return 0L;
    }
    cYk localcYk2 = aAw.d(false, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localcYk2 == null)
    {
      K.error("Unable to compute caster position");
      return 0L;
    }

    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null) {
      throw new aIh("On essaie de compter les zones d'effet en dehors d'un combat...");
    }
    duF localduF = ((aVc)paramObject3).bkc();
    if (localduF == null)
      return 0L;
    bbH localbbH = localduF.aui();
    if (localbbH == null)
    {
      K.error("Unable to compute effect areas in effet AOE : effect doesn't have one. EffectIf : " + localduF.yR());
      return 0L;
    }

    long l = this.iaE.b(paramObject1, paramObject2, paramObject3, paramObject4);

    int i = 0;

    Iterator localIterator = localdbE.LC().bbj().iterator();
    while (localIterator.hasNext())
    {
      cjK localcjK = (cjK)localIterator.next();
      if ((localcjK != null) && 
        (localcjK.clt() == l))
      {
        int j = 0;
        switch (Wu.cGq[this.iaF.ordinal()])
        {
        case 1:
          j = localcjK.Fx() != localaxQ.Fx() ? 1 : 0;
          break;
        case 2:
          j = localcjK.Fx() == localaxQ.Fx() ? 1 : 0;
          break;
        case 3:
          j = localcjK.axG() == localaxQ ? 1 : 0;
          break;
        case 4:
          j = 1;
        }

        if (j != 0)
        {
          cYk localcYk3 = localcjK.ML();
          boolean bool = localbbH.a(localcYk1.getX(), localcYk1.getY(), localcYk1.IB(), localcYk2.getX(), localcYk2.getY(), localcYk2.IB(), localcYk3.getX(), localcYk3.getY(), localcYk3.IB());

          if (bool)
            i++; 
        }
      }
    }
    return super.cDu() * i;
  }

  public Enum gm() {
    return Bz.bBX;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}