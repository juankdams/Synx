import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ael extends akN
{
  private static ArrayList aAG = new ArrayList();
  private ArrayList cVf;
  private ArrayList cVg;
  private boolean cVh;
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

  public ael(ArrayList paramArrayList)
  {
    Object localObject1;
    Object localObject2;
    aOw localaOw;
    if (u(paramArrayList) == 0)
    {
      this.cVf = new ArrayList();
      for (localObject1 = paramArrayList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dKY)((Iterator)localObject1).next();
        localaOw = (aOw)localObject2;
        this.cVf.add(localaOw);
      }
      this.cVg = null;
    }
    if (u(paramArrayList) == 1)
    {
      this.cVf = new ArrayList();
      for (localObject2 = paramArrayList.iterator(); ((Iterator)localObject2).hasNext(); ) { dKY localdKY = (dKY)((Iterator)localObject2).next();
        if (localdKY.aNE() == Pq.chv) {
          localaOw = (aOw)localdKY;
          this.cVf.add(localaOw);
        }
        if (localdKY.aNE() == Pq.chu) {
          localObject1 = (cic)localdKY;
          if (((cic)localObject1).getValue().equalsIgnoreCase("inventory")) {
            this.cVh = true;
          } else if (((cic)localObject1).getValue().equalsIgnoreCase("target")) {
            this.cVi = true;
          } else {
            if (this.cVg == null)
              this.cVg = new ArrayList();
            this.cVg.add(eg(((cic)localObject1).getValue()));
          }
        } }
    }
  }

  private boolean a(ge paramge, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    for (ge localge = paramge; localge != null; localge = localge.ne()) {
      for (int i = 0; i < this.cVf.size(); i = (byte)(i + 1))
        if ((short)(int)((aOw)this.cVf.get(i)).b(paramObject1, paramObject2, paramObject3, paramObject4) == localge.nc())
          return true;
    }
    return false;
  }

  private boolean a(azO paramazO, ge paramge) {
    if ((paramge != null) && (paramazO != null)) {
      azO[] arrayOfazO = paramge.nj();
      if ((arrayOfazO != null) && (arrayOfazO.length > 0)) {
        for (int i = 0; i < arrayOfazO.length; i++) {
          if (paramazO == arrayOfazO[i])
            return false;
        }
      }
    }
    return true;
  }

  public cSi aqd() {
    cSi localcSi = new cSi();
    for (aOw localaOw : this.cVf) {
      if (localaOw.sc()) {
        localcSi.add((int)localaOw.b(null, null, null, null));
      }
    }
    return localcSi;
  }

  public ArrayList aqe() {
    return this.cVg;
  }

  public ael()
  {
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
    Object localObject;
    gA localgA;
    if (this.cVh) {
      localObject = localcKT.cEg();
      Iterator localIterator;
      while (((cHu)localObject).hasNext()) {
        ((cHu)localObject).fl();
        cRs localcRs = (cRs)((cHu)localObject).value();
        for (localIterator = localcRs.cHT().iterator(); localIterator.hasNext(); ) { localgA = (gA)localIterator.next();
          if (a(localgA.oi().bKn(), paramObject1, paramObject2, paramObject3, paramObject4))
            return 0;
        }
      }
    }
    if (this.cVg == null)
      for (localgA : azO.values())
        if ((localbZH.dB((short)localgA.bJ()) != null) && (a(((gA)localbZH.dB((short)localgA.bJ())).oi().bKn(), paramObject1, paramObject2, paramObject3, paramObject4)))
        {
          return 0;
        }
    else
      for (localObject = this.cVg.iterator(); ((Iterator)localObject).hasNext(); ) { azO localazO = (azO)((Iterator)localObject).next();
        if ((localbZH.dB((short)localazO.bJ()) != null) && (a(localazO, ((gA)localbZH.dB((short)localazO.bJ())).oi().bKn())) && (a(((gA)localbZH.dB((short)localazO.bJ())).oi().bKn(), paramObject1, paramObject2, paramObject3, paramObject4)))
        {
          return 0;
        }
      }
    return -2;
  }

  public Enum gm() {
    return Bz.bxK;
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