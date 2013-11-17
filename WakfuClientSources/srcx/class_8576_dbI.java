import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class dbI
  implements cFh
{
  private static final dbI kTQ = new dbI();
  private int kTR = 0;
  private final Map kTS;
  private final cSR kTT;
  private final ArrayList kTU;
  private final ArrayList bLX = new ArrayList(5);

  private dbI() {
    this.kTS = new HashMap();
    this.kTT = new cSR();
    this.kTU = new ArrayList();
  }

  public static dbI cNt() {
    return kTQ;
  }

  public int cNu() {
    return ++this.kTR;
  }

  public void a(QS paramQS) {
    if (paramQS == null) {
      return;
    }

    this.bLX.add(paramQS);
  }

  public void b(QS paramQS) {
    if (paramQS == null) {
      return;
    }
    this.bLX.remove(paramQS);
  }

  private void a(aCF paramaCF, xI paramxI) {
    if ((paramaCF == null) || (paramxI == null)) {
      return;
    }
    int i = this.bLX.size();
    if (i == 0) {
      return;
    }

    EI localEI = new EI(paramaCF, paramxI);
    for (int j = 0; j < i; j++)
      ((QS)this.bLX.get(j)).a(localEI);
  }

  public int a(aCF paramaCF)
  {
    cqz localcqz = paramaCF.Fr();
    HashSet localHashSet = (HashSet)this.kTS.get(localcqz);
    if (localHashSet == null) {
      localHashSet = new HashSet();
      this.kTS.put(localcqz, localHashSet);
    }
    if (!localHashSet.contains(paramaCF)) {
      paramaCF.d(cNu());
      localHashSet.add(paramaCF);
      this.kTT.put(paramaCF.getId(), paramaCF);
      this.kTU.add(paramaCF);
      a(paramaCF, xI.bqo);
    }
    return paramaCF.getId();
  }

  public final HashSet b(cqz paramcqz)
  {
    return (HashSet)this.kTS.get(paramcqz);
  }

  public boolean a(cqz paramcqz, int paramInt)
  {
    HashSet localHashSet = (HashSet)this.kTS.get(paramcqz);
    if (localHashSet == null) {
      return false;
    }
    Iterator localIterator = localHashSet.iterator();
    while (localIterator.hasNext()) {
      aCF localaCF = (aCF)localIterator.next();
      if (localaCF.xj() == paramInt) {
        return true;
      }
    }
    return false;
  }

  public int b(cqz paramcqz, int paramInt) {
    HashSet localHashSet = (HashSet)this.kTS.get(paramcqz);
    if (localHashSet == null) {
      return 0;
    }
    Iterator localIterator = localHashSet.iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      aCF localaCF = (aCF)localIterator.next();
      if (localaCF.xj() == paramInt) {
        i++;
      }
    }
    return i;
  }

  public final void clear()
  {
    dmn localdmn = this.kTT.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ((aCF)localdmn.value()).cleanUp();
    }
    this.kTS.clear();
    this.kTU.clear();
    this.kTT.clear();
  }

  public final aCF zC(int paramInt)
  {
    return (aCF)this.kTT.get(paramInt);
  }

  public void zD(int paramInt)
  {
    dmn localdmn = this.kTT.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      aCF localaCF = (aCF)localdmn.value();
      if (localaCF.xj() == paramInt) {
        HashSet localHashSet = (HashSet)this.kTS.get(localaCF.Fr());
        if ((!bB) && (localHashSet == null)) throw new AssertionError();
        localHashSet.remove(localaCF);
        this.kTU.remove(localaCF);
        localdmn.remove();
        localaCF.cleanUp();
        a(localaCF, xI.bqp);
      }
    }
  }

  public void c(cqz paramcqz, int paramInt)
  {
    HashSet localHashSet = (HashSet)this.kTS.get(paramcqz);
    if (localHashSet != null) {
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext()) {
        aCF localaCF = (aCF)localIterator.next();
        if (localaCF.xj() == paramInt) {
          this.kTT.remove(localaCF.getId());
          this.kTU.remove(localaCF);
          localIterator.remove();
          localaCF.cleanUp();
          a(localaCF, xI.bqp);
        }
      }
    }
  }

  public void d(cqz paramcqz, int paramInt)
  {
    HashSet localHashSet = (HashSet)this.kTS.get(paramcqz);
    if (localHashSet != null) {
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext()) {
        aCF localaCF = (aCF)localIterator.next();
        if (localaCF.xj() == paramInt) {
          this.kTT.remove(localaCF.getId());
          this.kTU.remove(localaCF);
          localIterator.remove();
          localaCF.cleanUp();
          a(localaCF, xI.bqp);
          return;
        }
      }
    }
  }

  public final void c(cqz paramcqz)
  {
    HashSet localHashSet = (HashSet)this.kTS.remove(paramcqz);
    if (localHashSet != null)
      for (aCF localaCF : localHashSet) {
        this.kTT.remove(localaCF.getId());
        this.kTU.remove(localaCF);
        localaCF.cleanUp();
        a(localaCF, xI.bqp);
      }
  }

  public final void b(aCF paramaCF)
  {
    if ((!bB) && (paramaCF == null)) throw new AssertionError();
    zE(paramaCF.getId());
  }

  public void zE(int paramInt)
  {
    aCF localaCF = (aCF)this.kTT.remove(paramInt);
    if (localaCF != null) {
      this.kTU.remove(localaCF);
      HashSet localHashSet = (HashSet)this.kTS.get(localaCF.Fr());
      if ((!bB) && (localHashSet == null)) throw new AssertionError();
      localHashSet.remove(localaCF);
      if (localHashSet.isEmpty()) {
        this.kTS.remove(localaCF.Fr());
      }
      localaCF.cleanUp();
      a(localaCF, xI.bqp);
    }
  }

  public void a(cXf paramcXf, float paramFloat1, float paramFloat2) {
    int i = 0; for (int j = this.kTU.size(); i < j; i++) {
      aCF localaCF = (aCF)this.kTU.get(i);
      Object localObject;
      if ((localaCF.Fr() instanceof cUo)) {
        localObject = (cUo)localaCF.Fr();
        if ((localObject != null) && (!((cUo)localObject).isVisible()));
      }
      else
      {
        localObject = up.a(paramcXf, localaCF.getWorldX(), localaCF.getWorldY(), localaCF.getAltitude());
        localaCF.b(((cYm)localObject).aOR, ((cYm)localObject).aOS, localaCF.getXOffset(), localaCF.getYOffset());

        Entity localEntity = localaCF.getEntity();
        if (localEntity != null) {
          localEntity.mnQ = localaCF.getWorldX();
          localEntity.mnR = localaCF.getWorldY();
          paramcXf.b(localEntity, false);
        }
      }
    }
  }

  public void a(cXf paramcXf, int paramInt) { cSi localcSi = new cSi();
    int i = 0; for (int j = this.kTU.size(); i < j; i++) {
      aCF localaCF = (aCF)this.kTU.get(i);
      if (!localaCF.isAlive())
        localcSi.add(localaCF.getId());
      else {
        localaCF.a(paramcXf, paramInt);
      }
    }
    for (i = localcSi.size() - 1; i >= 0; i--)
      zE(localcSi.wm(i));
  }
}