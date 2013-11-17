import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aVC extends akN
{
  private static ArrayList aAG = new ArrayList();
  private ArrayList eXE;
  private aBr eXF;
  private ArrayList cVg = null;
  private boolean cVh = false;
  private boolean cVi = false;

  protected List kM()
  {
    return aAG;
  }

  private azO eg(String paramString) {
    for (azO localazO : azO.values()) {
      if (localazO.bL().equalsIgnoreCase(paramString))
        return localazO;
    }
    return null;
  }

  public aVC(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    int j;
    int k;
    Object localObject;
    if (((dKY)paramArrayList.get(0)).aNE() == Pq.chx) {
      this.eXE = null;
      this.eXF = ((aBr)paramArrayList.get(0));
      j = 1;
    } else {
      this.eXE = new ArrayList();

      for (k = 0; 
        (k < paramArrayList.size()) && (((dKY)paramArrayList.get(k)).aNE() == Pq.chv); k++) {
        localObject = (aOw)paramArrayList.get(k);
        this.eXE.add(localObject);
      }
      j = k;
    }
    if (i == 0)
      this.cVg = null;
    else if (i == 1)
    {
      for (k = j; (k < paramArrayList.size()) && (((dKY)paramArrayList.get(k)).aNE() == Pq.chu); k++) {
        localObject = (cic)paramArrayList.get(k);
        if (((cic)localObject).getValue().equalsIgnoreCase("inventory")) {
          this.cVh = true;
        } else if (((cic)localObject).getValue().equalsIgnoreCase("target")) {
          this.cVi = true;
        } else {
          if (this.cVg == null)
            this.cVg = new ArrayList();
          azO localazO = eg(((cic)localObject).getValue());
          if (localazO == null) {
            throw new IllegalArgumentException("Nom de slot qui ne correspond a rien " + ((cic)localObject).getValue());
          }
          this.cVg.add(localazO);
        }
      }
    }
  }

  public aVC() {
  }

  public cSi blc() {
    cSi localcSi = new cSi();
    int i = 0; for (int j = this.eXE.size(); i < j; i++) {
      aOw localaOw = (aOw)this.eXE.get(i);
      if (localaOw.pH()) {
        localcSi.add((int)localaOw.b(null, null, null, null));
      }
    }
    return localcSi;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ;
    if (paramObject1 == null) {
      if ((paramObject3 instanceof apn))
        localdhJ = ((apn)paramObject3).aBv();
      else
        throw new aIh("on cherche l'équipement d'un user null"); 
    } else { if (!(paramObject1 instanceof dhJ))
        throw new aIh("on cherche l'équipement d'autre chose qu'un character");
      if ((this.cVi) && ((paramObject2 instanceof dhJ)))
        localdhJ = (dhJ)paramObject2;
      else
        localdhJ = (dhJ)paramObject1;
    }
    bZH localbZH = localdhJ.ayJ();
    if (localbZH == null) {
      return -2;
    }
    cKT localcKT = localdhJ.bHr();
    cbQ localcbQ;
    if (this.eXE != null) {
      localcbQ = new cbQ();
      for (int i = 0; i < this.eXE.size(); i = (byte)(i + 1))
        localcbQ.add(((aOw)this.eXE.get(i)).b(paramObject1, paramObject2, paramObject3, paramObject4));
    }
    else {
      localcbQ = this.eXF.g(paramObject1, paramObject2, paramObject3, paramObject4);
    }
    Object localObject;
    gA localgA;
    if (this.cVh) {
      localObject = localcKT.cEg();
      Iterator localIterator;
      while (((cHu)localObject).hasNext()) {
        ((cHu)localObject).fl();
        cRs localcRs = (cRs)((cHu)localObject).value();
        for (localIterator = localcRs.cHT().iterator(); localIterator.hasNext(); ) { localgA = (gA)localIterator.next();
          if ((localgA != null) && 
            (localcbQ.N(localgA.ok())))
            return 0;
        }
      }
    }
    if (this.cVg == null)
      for (localgA : azO.values())
        if ((localbZH.dB((short)localgA.bJ()) != null) && (localcbQ.N(((gA)localbZH.dB((short)localgA.bJ())).oi().getId())))
        {
          return 0;
        }
    else
      for (localObject = this.cVg.iterator(); ((Iterator)localObject).hasNext(); ) { azO localazO = (azO)((Iterator)localObject).next();
        if ((localbZH.dB((short)localazO.bJ()) != null) && (localcbQ.N(((gA)localbZH.dB((short)localazO.bJ())).oi().getId())))
        {
          return 0;
        } }
    return -2;
  }

  public Enum gm() {
    return Bz.bxJ;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chx;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chx;
    arrayOfPq[1] = Pq.chy;
    aAG.add(arrayOfPq);
  }
}