import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class bCs
{
  static final Logger K = Logger.getLogger(bCs.class);

  private final ArrayList gwJ = new ArrayList();
  private final ArrayList gwK = new ArrayList();
  private final HashSet gwL = new HashSet();
  private final long bkK;
  private final int gwM;

  bCs(long paramLong, int paramInt)
  {
    this.bkK = paramLong;
    this.gwM = paramInt;
  }

  public long sN() {
    return this.bkK;
  }

  public boolean isEmpty() {
    return this.gwK.isEmpty();
  }

  public int bKV() {
    return this.gwL.size();
  }

  public boolean B(cYk paramcYk) {
    return this.gwL.contains(paramcYk);
  }

  public boolean contains(int paramInt1, int paramInt2) {
    for (cYk localcYk : this.gwL)
      if (localcYk.ae(paramInt1, paramInt2))
        return true;
    return false;
  }

  public List bKW() {
    return Collections.unmodifiableList(this.gwK);
  }

  boolean a(cDg paramcDg, UG paramUG, dHS paramdHS) {
    if (this.gwJ.contains(paramcDg)) {
      K.error("Trying to register a microbot already registered : " + paramcDg, new RuntimeException());
      return false;
    }
    this.gwJ.add(paramcDg);

    a(paramUG, paramdHS);
    return true;
  }

  boolean b(cDg paramcDg, UG paramUG, dHS paramdHS) {
    if (!this.gwJ.remove(paramcDg)) {
      return false;
    }
    a(paramUG, paramdHS);
    return true;
  }

  protected void a(UG paramUG, dHS paramdHS) {
    ArrayList localArrayList1 = h(paramUG);
    ArrayList localArrayList3;
    ArrayList localArrayList2;
    ArrayList localArrayList4;
    Object localObject2;
    if (paramdHS == null) {
      localArrayList3 = null;
      localArrayList2 = null;
      localArrayList4 = null;
    } else {
      localArrayList3 = new ArrayList();

      for (localObject1 = localArrayList1.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bwq)((Iterator)localObject1).next();

        if (!this.gwK.remove(localObject2)) {
          localArrayList3.add(localObject2);
        }
      }

      localArrayList2 = new ArrayList(this.gwK);

      localArrayList4 = new ArrayList(this.gwL);
    }

    this.gwK.clear();
    this.gwK.addAll(localArrayList1);

    this.gwL.clear();
    for (Object localObject1 = this.gwK.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bwq)((Iterator)localObject1).next();
      for (localObject3 = ((bwq)localObject2).iterator(); ((Iterator)localObject3).hasNext(); ) { cYk localcYk = (cYk)((Iterator)localObject3).next();
        if (!this.gwL.contains(localcYk)) {
          if (paramUG != null)
            localcYk = new cYk(localcYk.getX(), localcYk.getY(), paramUG.aw(localcYk.getX(), localcYk.getY()));
          this.gwL.add(localcYk);
        }
      }
    }
    Object localObject3;
    if ((paramdHS != null) && (
      (!localArrayList3.isEmpty()) || (!localArrayList2.isEmpty()))) {
      localObject1 = new ArrayList(this.gwL);
      localObject2 = cFJ.d((List)localObject1, localArrayList4);
      localObject3 = cFJ.d(localArrayList4, (List)localObject1);
      paramdHS.a(this, localArrayList3, localArrayList2, (List)localObject2, (List)localObject3);
    }
  }

  protected ArrayList h(UG paramUG)
  {
    cSR localcSR1 = new cSR();
    cSR localcSR2 = new cSR();

    for (Object localObject1 = this.gwJ.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cDg)((Iterator)localObject1).next();
      localObject3 = ((cDg)localObject2).ML();
      int i = ((cYk)localObject3).getX();
      if (!localcSR1.containsKey(i))
        localcSR1.put(i, new bNj());
      ((bNj)localcSR1.get(i)).add(localObject2);
      int j = ((cYk)localObject3).getY();
      if (!localcSR2.containsKey(j))
        localcSR2.put(j, new bNj());
      ((bNj)localcSR2.get(j)).add(localObject2);
    }
    Object localObject3;
    if (paramUG != null) {
      localObject1 = dqg.cXq();
      ((dqg)localObject1).a(6, (byte)1, (short)4);
      ((dqg)localObject1).a(paramUG);
      paramUG.bw(true);
    } else {
      localObject1 = null;
    }
    Object localObject2 = new ArrayList();
    try
    {
      for (localObject3 = localcSR1.yF(); ((dmn)localObject3).hasNext(); ) {
        ((dmn)localObject3).fl();
        ((ArrayList)localObject2).addAll(a((bNj)((dmn)localObject3).value(), this.gwM, (dqg)localObject1));
      }
      for (localObject3 = localcSR2.yF(); ((dmn)localObject3).hasNext(); ) {
        ((dmn)localObject3).fl();
        ((ArrayList)localObject2).addAll(a((bNj)((dmn)localObject3).value(), this.gwM, (dqg)localObject1));
      }
    } finally {
      if (paramUG != null) {
        paramUG.bw(false);
        ((dqg)localObject1).release();
      }
    }

    return localObject2;
  }

  protected static ArrayList a(bNj parambNj, int paramInt, dqg paramdqg)
  {
    Object localObject = null;
    cDg localcDg = null;
    bwq localbwq = null;
    ArrayList localArrayList = new ArrayList();

    Iterator localIterator = parambNj.iterator();
    for (localObject = null; localIterator.hasNext(); localObject = localcDg) {
      localcDg = (cDg)localIterator.next();

      if (localObject != null)
      {
        if (!bwq.a(localcDg.ML(), ((cDg)localObject).ML(), paramInt)) {
          localbwq = null;
        }
        else if ((paramdqg != null) && (!paramdqg.e(((cDg)localObject).ML(), localcDg.ML()))) {
          localbwq = null;
        }
        else if (localbwq == null) {
          localbwq = new bwq((cDg)localObject, localcDg);
          localArrayList.add(localbwq);
        }
        else if (localbwq.a(localcDg.ML(), paramInt)) {
          boolean bool = localbwq.a(localcDg, paramInt);
          if (!bool) {
            localbwq = null;
          }
        }
        else
        {
          localbwq = new bwq((cDg)localObject, localcDg);
          localArrayList.add(localbwq);
        }
      }
    }

    return localArrayList;
  }

  public static boolean a(cYk paramcYk, List paramList) {
    for (bCs localbCs : paramList) {
      if (localbCs.contains(paramcYk.getX(), paramcYk.getY()))
        return true;
    }
    return false;
  }
}