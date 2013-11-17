import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bWb extends cIX
{
  private static final List aWC = new ArrayList();
  private ArrayList eXE;
  private aBr hip;

  protected List kM()
  {
    return aWC;
  }

  public boolean pH()
  {
    return true;
  }

  public bWb(List paramList) {
    if (J(paramList) == 0)
      if (((dKY)paramList.get(0)).aNE() == Pq.chx) {
        this.eXE = null;
        this.hip = ((aBr)paramList.get(0));
      } else {
        this.eXE = new ArrayList();
        this.hip = null;
        for (dKY localdKY : paramList) {
          aOw localaOw = (aOw)localdKY;
          this.eXE.add(localaOw);
        }
      }
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ;
    if (paramObject1 == null) {
      if ((paramObject3 instanceof apn))
        localdhJ = ((apn)paramObject3).aBv();
      else
        throw new aIh("on cherche l'équipement d'un user null"); 
    } else { if (!(paramObject1 instanceof dhJ)) {
        throw new aIh("on cherche l'équipement d'autre chose qu'un character");
      }
      localdhJ = (dhJ)paramObject1; }
    if (localdhJ == null)
      return 0L;
    bZH localbZH = localdhJ.ayJ();
    cKT localcKT = localdhJ.bHr();
    if (localcKT == null)
      return 0L;
    cbQ localcbQ;
    if (this.hip != null) {
      localcbQ = this.hip.g(paramObject1, paramObject2, paramObject3, paramObject4);
    } else {
      localcbQ = new cbQ();
      for (i = 0; i < this.eXE.size(); i++) {
        long l = ((aOw)this.eXE.get(i)).b(paramObject1, paramObject2, paramObject3, paramObject4);
        localcbQ.add(l);
      }
    }
    int i = 0;
    Object localObject1;
    Object localObject2;
    for (int j = 0; j < localcbQ.size(); j++)
    {
      int m = (int)localcbQ.get(j);
      cHu localcHu = localcKT.cEg();
      while (localcHu.hasNext()) {
        localcHu.fl();
        localObject1 = (cRs)localcHu.value();
        localArrayList = ((cRs)localObject1).cHT().hi(m);
        if (localArrayList != null)
          for (localObject2 = localArrayList.iterator(); ((Iterator)localObject2).hasNext(); ) { gA localgA = (gA)((Iterator)localObject2).next();
            i += localgA.nP();
          }
      }
      ArrayList localArrayList = localbZH.hi(m);
      if (localArrayList != null)
        for (localObject1 = localArrayList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (gA)((Iterator)localObject1).next();
          i += ((gA)localObject2).nP(); }
    }
    if ((localdhJ instanceof bzI)) {
      Vu localVu = (Vu)((bzI)localdhJ).b(RS.cru);
      for (int k = 0; k < localcbQ.size(); k++) {
        cEG localcEG = localVu.ha((int)localcbQ.get(k));
        if (localcEG != null)
        {
          i += localcEG.nP();
        }
      }
    }
    return i;
  }

  public Enum gm()
  {
    return Bz.byu;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chx;
    aWC.add(arrayOfPq);
  }
}