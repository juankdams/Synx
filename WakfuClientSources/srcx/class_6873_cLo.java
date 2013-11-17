import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class cLo
{
  private static final Logger K = Logger.getLogger(cLo.class);

  private final Collection iKN = new ArrayList();
  private final HashMap iKO = new HashMap();
  private final Collection iKP = new ArrayList();
  private final Collection iKQ = new ArrayList();
  private final Collection iKR = new ArrayList();
  private final Collection iKS = new ArrayList();
  private final Collection iKT = new ArrayList();
  private final Collection iKU = new ArrayList();
  private dle iKV;
  private cYk iKW;
  private final dbE iKX;

  public cLo(dbE paramdbE, dle paramdle, cYk paramcYk)
  {
    this.iKX = paramdbE;
    y(paramdle);
    T(paramcYk);
  }

  public void y(dle paramdle) {
    if (paramdle == null)
      throw new IllegalArgumentException("Le mover ne doit jamais etre null");
    this.iKV = paramdle;
  }

  public void T(cYk paramcYk) {
    if (paramcYk == null)
      throw new IllegalArgumentException("La cellule destination ne doit jamais etre null");
    this.iKW = paramcYk;
  }

  public void clean() {
    this.iKN.clear();
    this.iKO.clear();
    this.iKP.clear();
    this.iKQ.clear();
    this.iKR.clear();
    this.iKS.clear();
    this.iKT.clear();
    this.iKU.clear();
  }

  public void cEv() {
    U(null);
  }

  public void U(cYk paramcYk) {
    if (paramcYk == null) {
      paramcYk = this.iKV.ML();
    }
    cYk localcYk = this.iKV.ML();
    if (localcYk != paramcYk)
      this.iKV.n(paramcYk);
    try {
      for (Iterator localIterator1 = this.iKX.bbj().iterator(); localIterator1.hasNext(); ) { localcjK = (cjK)localIterator1.next();
        if (localcjK.a(this.iKV, paramcYk.getX(), paramcYk.getY(), paramcYk.IB())) {
          this.iKN.add(localcjK);
        }
        if (!localcjK.mj())
        {
          localArrayList = (ArrayList)this.iKO.get(localcjK);
          if (localArrayList == null) {
            localArrayList = new ArrayList();
            this.iKO.put(localcjK, localArrayList);
          }

          for (dhJ localdhJ : this.iKX.bgF())
            if (localcjK.a(localdhJ, localdhJ.fa(), localdhJ.fb(), localdhJ.fc()))
              localArrayList.add(localdhJ);
        }
      }
      cjK localcjK;
      ArrayList localArrayList;
      if (localcYk != paramcYk)
        this.iKV.n(localcYk);
    }
    catch (Exception localException)
    {
      K.error("Exception levee", localException);

      if (localcYk != paramcYk)
        this.iKV.n(localcYk);
    }
    finally
    {
      if (localcYk != paramcYk)
        this.iKV.n(localcYk);
    }
  }

  private void cEw() {
    this.iKP.clear();
    this.iKQ.clear();
    this.iKS.clear();
    this.iKR.clear();
    this.iKT.clear();
  }

  public void cEx() {
    cEw();
    if (this.iKX.bbj().isEmpty()) {
      return;
    }
    ArrayList localArrayList = new ArrayList(this.iKX.bbj());
    for (cjK localcjK : localArrayList) {
      t(localcjK);

      if (!localcjK.mj())
      {
        u(localcjK);
      }
    }
  }

  public boolean cEy() { if (!cEG())
      return false; cYk localcYk = new cYk(this.iKV.ML());
    this.iKV.n(this.iKW);
    boolean bool;
    try { bool = (cEB()) || (cEC());
    } catch (Exception localException) {
      bool = false;
      K.error("Exception levee", localException);
    }
    this.iKV.n(localcYk);
    return bool; }

  public boolean cEz()
  {
    if (!cEG())
      return false;
    for (Object localObject1 = this.iKQ.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cjK)((Iterator)localObject1).next();
      if ((((cjK)localObject2).vw(10002)) && (((cjK)localObject2).aMb()))
        return true;
    }
    for (localObject1 = this.iKR.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cjK)((Iterator)localObject1).next();
      if ((((cjK)localObject2).vw(10008)) && (((cjK)localObject2).aMb()))
        return true;
    }
    for (localObject1 = this.iKP.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cjK)((Iterator)localObject1).next();
      if ((((cjK)localObject2).vw(10001)) && (((cjK)localObject2).aMb())) {
        return true;
      }
    }
    for (Object localObject2 = this.iKS.iterator(); ((Iterator)localObject2).hasNext(); ) { localCs = (Cs)((Iterator)localObject2).next();
      localObject1 = (cjK)localCs.getFirst();
      if ((((cjK)localObject1).vw(10001)) && (((cjK)localObject1).aMb()))
        return true;
    }
    Cs localCs;
    for (localObject2 = this.iKU.iterator(); ((Iterator)localObject2).hasNext(); ) { localCs = (Cs)((Iterator)localObject2).next();
      localObject1 = (cjK)localCs.getFirst();
      if ((((cjK)localObject1).vw(10008)) && (((cjK)localObject1).aMb()))
        return true;
    }
    for (localObject2 = this.iKT.iterator(); ((Iterator)localObject2).hasNext(); ) { localCs = (Cs)((Iterator)localObject2).next();
      localObject1 = (cjK)localCs.getFirst();
      if ((((cjK)localObject1).vw(10002)) && (((cjK)localObject1).aMb()))
        return true;
    }
    return false;
  }

  public boolean cEA() {
    if (!cEG())
      return false;
    for (Iterator localIterator = this.iKQ.iterator(); localIterator.hasNext(); ) { localObject = (cjK)localIterator.next();
      if ((((cjK)localObject).vw(10002)) && (!s((cjK)localObject)))
        return true;
    }
    Object localObject;
    for (localIterator = this.iKR.iterator(); localIterator.hasNext(); ) { localObject = (cjK)localIterator.next();
      if ((((cjK)localObject).vw(10008)) && (!s((cjK)localObject)))
        return true;
    }
    for (localIterator = this.iKP.iterator(); localIterator.hasNext(); ) { localObject = (cjK)localIterator.next();
      if ((((cjK)localObject).vw(10001)) && (!s((cjK)localObject)))
        return true;
    }
    for (localIterator = this.iKS.iterator(); localIterator.hasNext(); ) { localObject = (Cs)localIterator.next();
      if (((cjK)((Cs)localObject).getFirst()).vw(10001))
        return true;
    }
    for (localIterator = this.iKU.iterator(); localIterator.hasNext(); ) { localObject = (Cs)localIterator.next();
      if (((cjK)((Cs)localObject).getFirst()).vw(10008))
        return true;
    }
    for (localIterator = this.iKT.iterator(); localIterator.hasNext(); ) { localObject = (Cs)localIterator.next();
      if (((cjK)((Cs)localObject).getFirst()).vw(10002))
        return true;
    }
    return false;
  }

  public boolean s(cjK paramcjK) {
    return (paramcjK.getType() == xj.bpv.xj()) && (paramcjK.axG() == this.iKV);
  }

  private boolean cEB() {
    for (Iterator localIterator = this.iKQ.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if (localcjK.a(10002, this.iKV))
        return true;
    }
    cjK localcjK;
    for (localIterator = this.iKR.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if (localcjK.a(10008, this.iKV))
        return true;
    }
    for (localIterator = this.iKP.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if (localcjK.a(10001, this.iKV))
        return true;
    }
    return false;
  }

  private boolean cEC() {
    for (Iterator localIterator = this.iKT.iterator(); localIterator.hasNext(); ) { localCs = (Cs)localIterator.next();
      if (((cjK)localCs.getFirst()).a(10002, this.iKV))
        return true;
    }
    Cs localCs;
    for (localIterator = this.iKU.iterator(); localIterator.hasNext(); ) { localCs = (Cs)localIterator.next();
      if (((cjK)localCs.getFirst()).a(10008, this.iKV))
        return true;
    }
    for (localIterator = this.iKS.iterator(); localIterator.hasNext(); ) { localCs = (Cs)localIterator.next();
      if (((cjK)localCs.getFirst()).a(10001, this.iKV))
        return true;
    }
    return false;
  }

  public void cED() {
    cEE();
    cEF();
  }

  private void cEE() {
    for (Iterator localIterator = this.iKQ.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      a(localcjK, (short)10002, this.iKV);
      if ((this.iKV.aJu()) || (this.iKV.byd()))
        return;
    }
    cjK localcjK;
    for (localIterator = this.iKR.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      a(localcjK, (short)10008, this.iKV);
      if ((this.iKV.aJu()) || (this.iKV.byd()))
        return;
    }
    for (localIterator = this.iKP.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      a(localcjK, (short)10001, this.iKV);
      if ((this.iKV.aJu()) || (this.iKV.byd()))
        return; }
  }

  private void cEF()
  {
    for (Iterator localIterator = this.iKT.iterator(); localIterator.hasNext(); ) { localCs = (Cs)localIterator.next();
      a((cjK)localCs.getFirst(), (short)10002, (alr)localCs.Lp());
      if ((this.iKV.aJu()) || (this.iKV.byd()))
        break;
    }
    Cs localCs;
    for (localIterator = this.iKU.iterator(); localIterator.hasNext(); ) { localCs = (Cs)localIterator.next();
      a((cjK)localCs.getFirst(), (short)10008, (alr)localCs.Lp());
      if ((this.iKV.aJu()) || (this.iKV.byd()))
        break;
    }
    for (localIterator = this.iKS.iterator(); localIterator.hasNext(); ) { localCs = (Cs)localIterator.next();
      a((cjK)localCs.getFirst(), (short)10001, (alr)localCs.Lp());
      if ((this.iKV.aJu()) || (this.iKV.byd()))
        break; }
  }

  private void t(cjK paramcjK)
  {
    if ((paramcjK.axG() == this.iKV) && (!paramcjK.mj()))
      return;
    if ((this.iKV != null) && (!paramcjK.c(this.iKV))) {
      return;
    }
    if (paramcjK.a(this.iKV, this.iKW.getX(), this.iKW.getY(), this.iKW.IB()))
    {
      if (!this.iKN.contains(paramcjK)) {
        this.iKP.add(paramcjK);
        this.iKN.add(paramcjK);
      } else {
        this.iKR.add(paramcjK);
      }

    }
    else if (this.iKN.contains(paramcjK)) {
      this.iKQ.add(paramcjK);
      this.iKN.remove(paramcjK);
    }
  }

  private void u(cjK paramcjK)
  {
    ArrayList localArrayList = (ArrayList)this.iKO.get(paramcjK);
    if (localArrayList == null) {
      return;
    }
    cYk localcYk = this.iKV.ML();
    try {
      this.iKV.n(this.iKW);
      for (dhJ localdhJ : this.iKX.bgF())
        if ((localdhJ != this.iKV) && 
          (this.iKV == paramcjK.axG()) && 
          (!paramcjK.mj()))
        {
          int i = localdhJ.fa();
          int j = localdhJ.fb();
          short s = localdhJ.fc();
          if (paramcjK.a(localdhJ, i, j, s))
          {
            if (!localArrayList.contains(localdhJ))
              this.iKS.add(new Cs(paramcjK, localdhJ));
            else {
              this.iKU.add(new Cs(paramcjK, localdhJ));
            }

          }
          else if (localArrayList.contains(localdhJ))
            this.iKT.add(new Cs(paramcjK, localdhJ));
        }
    }
    catch (Exception localException)
    {
      K.error("Exception levée ", localException);
    } finally {
      this.iKV.n(localcYk);
    }
  }

  private boolean cEG() {
    return (!this.iKP.isEmpty()) || (!this.iKQ.isEmpty()) || (!this.iKR.isEmpty()) || (!this.iKT.isEmpty()) || (!this.iKS.isEmpty()) || (!this.iKU.isEmpty());
  }

  private void a(cjK paramcjK, short paramShort, alr paramalr)
  {
    paramcjK.a(paramShort, null, paramalr);
  }
}