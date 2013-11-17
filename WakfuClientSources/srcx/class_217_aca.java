import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.apache.log4j.Logger;

public class aca
  implements cLq
{
  protected static Logger K = Logger.getLogger(aca.class);

  private static aca cQM = new aca();

  private final LinkedList cQN = new LinkedList();
  private final dPx cQO = new dPx();
  private final HashMap cQP = new HashMap();

  private aoL cQQ = new aoL();

  public static aca aoj()
  {
    return cQM;
  }

  public void f(vL paramvL)
  {
    h(paramvL);
    this.cQN.addFirst(paramvL);
    this.cQP.put(Long.valueOf(paramvL.EN()), paramvL);
    m(paramvL);
  }

  public void g(vL paramvL) {
    if (paramvL == null) {
      return;
    }
    vL localvL = (vL)this.cQP.get(Long.valueOf(paramvL.EN()));
    l(localvL);
    j(localvL);

    m(paramvL);
    h(paramvL);
    this.cQP.put(Long.valueOf(paramvL.EN()), paramvL);
  }

  private void h(vL paramvL) {
    long l = paramvL.EQ().cLT();
    bKR localbKR = (bKR)this.cQQ.get(l);
    if (localbKR == null) {
      localbKR = new bKR();
      this.cQQ.put(l, localbKR);
    }
    localbKR.add(paramvL.EN());
  }

  public void i(vL paramvL) {
    j(paramvL);
    this.cQN.remove(paramvL);
    l(paramvL);
    this.cQP.remove(Long.valueOf(paramvL.EN()));
  }

  private boolean j(vL paramvL) {
    long l = paramvL.EQ().cLT();

    bKR localbKR = (bKR)this.cQQ.get(l);
    if (localbKR == null) {
      return true;
    }
    localbKR.bB(paramvL.EN());
    if (localbKR.isEmpty()) {
      this.cQQ.remove(l);
    }
    return false;
  }

  public Set aok() {
    return new HashSet(this.cQP.values());
  }

  public boolean isEmpty() {
    return (this.cQQ.isEmpty()) && (this.cQP.isEmpty()) && (this.cQO.isEmpty()) && (this.cQN.isEmpty());
  }

  public boolean k(vL paramvL) {
    if (isEmpty())
      return false;
    Collection localCollection = this.cQP.values();
    int i = paramvL.EY();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      vL localvL = (vL)localIterator.next();
      if (localvL.EY() == i)
        return true;
    }
    return false;
  }

  public void clear() {
    this.cQP.clear();
    this.cQN.clear();
    this.cQO.clear();
    this.cQQ.clear();
  }

  private void l(vL paramvL) {
    bKR localbKR = (bKR)this.cQO.bf(paramvL.getType());
    if (localbKR == null) {
      return;
    }
    localbKR.bB(paramvL.EN());
    if (localbKR.isEmpty())
      this.cQO.be(paramvL.getType());
  }

  private void m(vL paramvL)
  {
    bKR localbKR = (bKR)this.cQO.bf(paramvL.getType());
    if (localbKR == null) {
      localbKR = new bKR();
      this.cQO.c(paramvL.getType(), localbKR);
    }
    localbKR.add(paramvL.EN());
  }

  public void aol() {
    vL localvL = (vL)this.cQN.removeFirst();
    if (localvL != null) {
      bKR localbKR = (bKR)this.cQO.bf(localvL.getType());
      if (localbKR != null)
        localbKR.bB(localvL.EN());
    }
    this.cQP.remove(Long.valueOf(localvL.EN()));
    i(localvL);
  }

  public void aom() {
    this.cQN.clear();
  }

  public vL cy(long paramLong) {
    return (vL)this.cQP.get(Long.valueOf(paramLong));
  }

  public bKR aI(byte paramByte) {
    return (bKR)this.cQO.bf(paramByte);
  }

  public Set m(dxL paramdxL) {
    long l1 = paramdxL.cLT();

    bKR localbKR = (bKR)this.cQQ.get(l1);
    if ((localbKR == null) || (localbKR.isEmpty()))
      return Collections.EMPTY_SET;
    HashSet localHashSet = new HashSet();
    for (bKT localbKT = localbKR.bTc(); localbKT.hasNext(); ) {
      long l2 = localbKT.bTd();
      if ((!bB) && (this.cQP.get(Long.valueOf(l2)) == null)) throw new AssertionError("Liste des eventsById foireuse");
      localHashSet.add(this.cQP.get(Long.valueOf(l2)));
    }
    return localHashSet;
  }

  public void cz(long paramLong) {
    for (Iterator localIterator = this.cQN.iterator(); localIterator.hasNext(); ) {
      vL localvL = (vL)localIterator.next();
      if (localvL.EY() == paramLong) {
        this.cQN.remove(localvL);
        return;
      }
    }
  }

  public void n(vL paramvL) {
    this.cQN.remove(paramvL);
  }

  public vL cA(long paramLong) {
    Set localSet = aok();
    for (Iterator localIterator = localSet.iterator(); localIterator.hasNext(); ) {
      vL localvL = (vL)localIterator.next();
      if (localvL.EY() == paramLong)
        return localvL;
    }
    return null;
  }

  public void display() {
    K.info(toString());
  }

  public void aJ(byte paramByte) {
    bKR localbKR = aI(paramByte);
    long[] arrayOfLong = localbKR.toArray();
    for (int i = 0; i < arrayOfLong.length; i++) {
      long l = arrayOfLong[i];
      i(cy(l));
    }
  }

  public void a(vL paramvL, long paramLong)
  {
    long l = paramvL.EQ().cLT();

    bKR localbKR1 = (bKR)this.cQQ.get(l);
    if (localbKR1 == null) {
      localbKR1 = new bKR();
      this.cQQ.put(l, localbKR1);
    } else {
      localbKR1.bB(paramvL.EN());
    }

    bKR localbKR2 = (bKR)this.cQO.bf(paramvL.getType());
    if (localbKR2 == null) {
      localbKR2 = new bKR();
      this.cQO.c(paramvL.getType(), localbKR2);
    } else {
      localbKR2.bB(paramvL.EN());
    }

    this.cQP.remove(Long.valueOf(paramvL.EN()));

    paramvL.aH(paramLong);

    localbKR1.add(paramLong);

    localbKR2.add(paramLong);

    this.cQP.put(Long.valueOf(paramLong), paramvL);
  }

  public int size() {
    return this.cQP.size();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CharacterEventsCalendar{\n");
    long[] arrayOfLong = this.cQQ.aBb();

    Arrays.sort(arrayOfLong);
    bKT localbKT;
    for (int i = 0; i < arrayOfLong.length; i++) {
      long l1 = arrayOfLong[i];
      bKR localbKR = (bKR)this.cQQ.get(l1);
      for (localbKT = localbKR.bTc(); localbKT.hasNext(); ) {
        long l2 = localbKT.bTd();
        localStringBuilder.append(this.cQP.get(Long.valueOf(l2)));
        localStringBuilder.append("\n");
      }
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void a(long paramLong, dxL paramdxL) {
    vL localvL = (vL)this.cQP.get(Long.valueOf(paramLong));
    j(localvL);
    localvL.e(paramdxL);
    h(localvL);
  }
}