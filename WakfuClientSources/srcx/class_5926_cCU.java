import java.util.ArrayList;
import java.util.List;

abstract class cCU extends cIX
{
  private static ArrayList aAG = new ArrayList();

  protected boolean ivC = true;
  protected String bUJ;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH()
  {
    return true;
  }

  cCU() {
  }

  cCU(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.ivC = true;
    if (i == 1) {
      this.ivC = false;
      this.bUJ = ((cic)paramArrayList.get(0)).getValue();
    }
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null)
      localdbE = aAw.i(paramObject1, paramObject4);
    if (localdbE == null) {
      throw new aIh("On essaie de compter les pièges en dehors d'un combat...");
    }
    Object localObject1 = null;
    if (!this.ivC) {
      if ((this.bUJ == null) || (this.bUJ.equalsIgnoreCase("caster"))) {
        localObject1 = aAw.b(false, paramObject1, paramObject2, paramObject4, paramObject3);
      } else if (this.bUJ.equalsIgnoreCase("target")) {
        localObject1 = aAw.b(true, paramObject1, paramObject2, paramObject4, paramObject3);
      }
      else
      {
        Object localObject2;
        if (this.bUJ.equalsIgnoreCase("triggeringCaster")) {
          localObject2 = aAw.al(paramObject3);
          if ((localObject2 instanceof axQ))
            localObject1 = (axQ)localObject2;
        } else if (this.bUJ.equalsIgnoreCase("triggeringTarget")) {
          localObject2 = aAw.ak(paramObject3);
          if ((localObject2 instanceof axQ))
            localObject1 = (axQ)localObject2;
        } else if (this.bUJ.equalsIgnoreCase("casterController")) {
          localObject2 = aAw.b(false, paramObject1, paramObject2, paramObject4, paramObject3);
          localObject1 = localdbE.eu(((axQ)localObject2).aJq());
        }
      }
    }
    long l = 0L;
    for (cjK localcjK : localdbE.LC().bbj()) {
      if (((this.ivC) || (a((axQ)localObject1, localcjK))) && (c(localcjK))) {
        l += 1L;
      }
    }
    return super.cDu() * l;
  }

  private boolean a(axQ paramaxQ, cjK paramcjK) {
    return (paramaxQ != null) && (paramcjK.axG() != null) && (paramcjK.axG().getId() == paramaxQ.getId());
  }

  protected boolean c(cjK paramcjK) {
    return paramcjK.getType() == VB();
  }

  protected abstract int VB();

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buY);
  }
}