import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class bAc extends brg
{
  private static final ArrayList ayr = new ArrayList();
  private aOw cYI;
  private cic goL;
  private boolean goM;

  protected List kM()
  {
    return ayr;
  }

  public bAc(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    if (i == 0) {
      this.cYI = ((aOw)paramArrayList.get(0));
      this.goL = null;
      this.fMN = aWq.fbC;
      this.goM = false;
    } else if (i == 1) {
      this.goL = ((cic)paramArrayList.get(0));
      this.cYI = null;
      this.fMN = aWq.fbC;
      this.goM = false;
    } else if (i == 2) {
      this.cYI = ((aOw)paramArrayList.get(0));
      this.goL = null;
      iN(((cic)paramArrayList.get(2)).getValue());
      this.goM = false;
    } else if (i == 3) {
      this.goL = ((cic)paramArrayList.get(0));
      this.cYI = null;
      iN(((cic)paramArrayList.get(2)).getValue());
      this.goM = false;
    } else if (i == 4) {
      this.goL = null;
      this.cYI = ((aOw)paramArrayList.get(0));

      iN(((cic)paramArrayList.get(2)).getValue());
      this.goM = true;
    }
    this.aMu = ((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target");
  }

  private xj bIA() {
    if (this.cYI != null) {
      int i = (int)this.cYI.b(null, null, null, null);
      return xj.dA(i);
    }
    return xj.valueOf(this.goL.getValue().toUpperCase());
  }

  protected boolean a(dhJ paramdhJ, dbE paramdbE, cYk paramcYk)
  {
    boolean bool = false;
    int j;
    int i;
    if (this.goM) {
      j = (int)this.cYI.b(null, null, null, null);
      i = -1;
    } else {
      j = -1;
      if (this.cYI != null) {
        i = (int)this.cYI.b(null, null, null, null);
      } else {
        localObject = xj.valueOf(this.goL.getValue().toUpperCase());
        if (localObject != null)
          i = ((xj)localObject).xj();
        else
          i = -1;
      }
    }
    Object localObject = paramdbE.LC().bbj();
    for (cjK localcjK : (Collection)localObject)
      if (a(i, j, localcjK, paramdhJ))
      {
        switch (aak.cOt[this.fMN.ordinal()]) {
        case 1:
          if (paramcYk.eE(localcjK.fa(), localcjK.fb()))
            bool = true; break;
        case 2:
          if (paramcYk.eD(localcjK.fa(), localcjK.fb()))
            bool = true;
          break;
        }
      }
    return bool;
  }

  protected boolean a(int paramInt1, int paramInt2, cjK paramcjK, dle paramdle) {
    return (paramcjK.getType() == paramInt1) || (paramcjK.clt() == paramInt2);
  }

  public Enum gm()
  {
    return Bz.bAL;
  }

  static
  {
    ayr.add(new Pq[] { Pq.chv, Pq.chu });
    ayr.add(new Pq[] { Pq.chu, Pq.chu });
    ayr.add(new Pq[] { Pq.chv, Pq.chu, Pq.chu });
    ayr.add(new Pq[] { Pq.chu, Pq.chu, Pq.chu });
    ayr.add(new Pq[] { Pq.chv, Pq.chu, Pq.chu, Pq.chw });
  }
}