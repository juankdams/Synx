import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class aSD extends XB
  implements dSr
{
  private static final Logger K = Logger.getLogger(aSD.class);

  private final dFu ePS = new dFu();
  private final dFu ePT = new dFu();

  public aSD()
  {
    super((short)-1, cby.cfu(), null, false, false, false);
  }

  public int d(qE paramqE) {
    return this.ePS.get(paramqE.bJ());
  }

  public void a(qE paramqE, int paramInt) {
    this.ePS.fg(paramqE.bJ(), paramInt);
  }

  public int e(qE paramqE) {
    return this.ePT.get(paramqE.bJ());
  }

  public void b(qE paramqE, int paramInt) {
    this.ePT.fg(paramqE.bJ(), paramInt);
  }

  public Iterator iterator()
  {
    ArrayList localArrayList = new ArrayList(this.cHS.size());
    localArrayList.addAll(this.cHS.values());
    Collections.sort(localArrayList);
    return localArrayList.iterator();
  }

  public ArrayList bij() {
    return f(qE.aXQ);
  }

  public ArrayList bik() {
    return f(qE.aXR);
  }

  public ArrayList f(qE paramqE) {
    ArrayList localArrayList = new ArrayList();
    Collection localCollection = this.cHS.values();

    for (bWG localbWG : localCollection) {
      if (localbWG.cbI().bQE() == paramqE)
        localArrayList.add(localbWG);
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }

  public boolean eE(long paramLong) {
    bWG localbWG = (bWG)this.cHS.get(Long.valueOf(paramLong));
    if (localbWG == null)
      return false;
    if ((this.cHU != null) && (this.cHU.a(this, localbWG) != 0))
      return false;
    this.cHS.remove(Long.valueOf(paramLong));
    b(YS.d(this, localbWG));
    localbWG.release();
    return true;
  }

  public boolean a(cEZ paramcEZ)
  {
    paramcEZ.clear();
    for (Object localObject1 = iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bWG)((Iterator)localObject1).next();
      if (((bWG)localObject2).og()) {
        bcl localbcl = new bcl();
        if (!((bWG)localObject2).a(localbcl.flX)) {
          return false;
        }
        paramcEZ.aZC.add(localbcl);
      }
    }
    Object localObject2;
    localObject1 = this.ePS.abR();
    while (((aso)localObject1).hasNext()) {
      ((aso)localObject1).fl();
      localObject2 = new bFs();
      byte b = (byte)((aso)localObject1).zY();
      ((bFs)localObject2).gAt = b;
      ((bFs)localObject2).gAu = ((aso)localObject1).value();
      ((bFs)localObject2).gAv = this.ePT.get(b);
      paramcEZ.iza.add(localObject2);
    }

    return true;
  }

  public boolean b(cEZ paramcEZ)
  {
    ajy();
    this.ePS.clear();
    this.ePT.clear();

    boolean bool = true;
    Object localObject;
    try {
      for (localIterator1 = paramcEZ.aZC.iterator(); localIterator1.hasNext(); ) { localObject = (bcl)localIterator1.next();
        bWG localbWG = (bWG)this.cHT.o(((bcl)localObject).flX);
        if (localbWG != null) {
          if (!c(localbWG))
            bool = false;
        }
        else bool = false;
      }
    }
    catch (dI localdI)
    {
      Iterator localIterator1;
      K.error(bBd.g(localdI));
      bool = false;
    } catch (dcF localdcF) {
      K.error(bBd.g(localdcF));
      bool = false;
    }

    for (Iterator localIterator2 = paramcEZ.iza.iterator(); localIterator2.hasNext(); ) { localObject = (bFs)localIterator2.next();
      this.ePS.fg(((bFs)localObject).gAt, ((bFs)localObject).gAu);
      this.ePT.fg(((bFs)localObject).gAt, ((bFs)localObject).gAv);
    }

    return bool;
  }

  public void cleanup() {
    super.cleanup();

    this.ePS.clear();
    this.ePT.clear();
  }

  public int nP(int paramInt)
  {
    throw new UnsupportedOperationException("");
  }

  public int bP(int paramInt1, int paramInt2)
  {
    throw new UnsupportedOperationException("");
  }

  public bWG bq(short paramShort) {
    return (bWG)super.ci(paramShort);
  }
}