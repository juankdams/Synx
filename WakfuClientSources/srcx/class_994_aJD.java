import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class aJD
  implements bWU
{
  protected static final Logger K = Logger.getLogger(aJD.class);
  private aee aOr;
  private HashMap ejM;
  private HashMap ejN;
  private ayT ejO;
  private cOE ejP;

  protected aJD()
  {
    this.ejN = new HashMap();
    this.ejM = new HashMap();
  }

  public cOE aIq() {
    return this.ejP;
  }

  public void b(cOE paramcOE) {
    this.ejP = paramcOE;
  }

  public void release()
  {
    if (this.aOr != null)
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.error("impossible");
      }
    else
      K.error("Double release de " + getClass().toString());
    bc();
  }

  public void aJ()
  {
    this.ejO = null;
    this.ejN.clear();
    this.ejM.clear();
  }

  public void bc()
  {
    bbk();
    this.ejO = null;
  }

  public void a(aee paramaee) {
    this.aOr = paramaee;
  }

  public Collection bbg()
  {
    return this.ejM.values();
  }

  public Collection bbh() {
    Collection localCollection = this.ejN.values();
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      cjK localcjK = (cjK)localIterator.next();
      if (localcjK.bvL())
        localArrayList.add(localcjK);
    }
    return localArrayList;
  }

  public cjK u(cYk paramcYk) {
    int i = paramcYk.getX();
    int j = paramcYk.getY();
    return bD(i, j);
  }

  public cjK bD(int paramInt1, int paramInt2)
  {
    for (cjK localcjK : bbh()) {
      if ((paramInt1 == localcjK.fa()) && (paramInt2 == localcjK.fb())) {
        return localcjK;
      }
    }
    return null;
  }

  public List v(cYk paramcYk) {
    int i = paramcYk.getX();
    int j = paramcYk.getY();
    return bE(i, j);
  }

  public List bE(int paramInt1, int paramInt2) {
    ArrayList localArrayList = new ArrayList();
    for (cjK localcjK : bbh()) {
      if ((paramInt1 == localcjK.fa()) && (paramInt2 == localcjK.fb())) {
        localArrayList.add(localcjK);
      }
    }
    return localArrayList;
  }

  public List x(int paramInt1, int paramInt2, int paramInt3) {
    ArrayList localArrayList = new ArrayList();
    for (cjK localcjK : bbh()) {
      if ((paramInt1 == localcjK.fa()) && (paramInt2 == localcjK.fb()) && (paramInt3 == localcjK.getType())) {
        localArrayList.add(localcjK);
      }
    }
    return localArrayList;
  }

  public List w(cYk paramcYk) {
    ArrayList localArrayList = new ArrayList();
    for (cjK localcjK : this.ejN.values()) {
      if (paramcYk.ae(localcjK.fa(), localcjK.fb()))
        localArrayList.add(localcjK);
    }
    return localArrayList;
  }

  public int bbi() {
    return this.ejN.size();
  }

  public Collection bbj()
  {
    return this.ejN.values();
  }

  public cjK eb(long paramLong) {
    return (cjK)this.ejM.get(Long.valueOf(paramLong));
  }

  public cjK ec(long paramLong) {
    return (cjK)this.ejN.get(Long.valueOf(paramLong));
  }

  public void a(ayT paramayT) {
    this.ejO = paramayT;
  }

  public void g(cjK paramcjK)
  {
    if (paramcjK == null)
      return;
    if (!this.ejN.containsKey(Long.valueOf(paramcjK.getId()))) {
      if ((!bB) && (this.ejN.containsValue(paramcjK))) throw new AssertionError("Trying to insert an effectArea already present, but with a different Id");
      paramcjK.a(this.ejO);
      this.ejM.put(Long.valueOf(paramcjK.getId()), paramcjK);
      this.ejN.put(Long.valueOf(paramcjK.getId()), paramcjK);
      paramcjK.brW();
      if (this.ejO != null)
        this.ejO.a(paramcjK);
    }
  }

  public void h(cjK paramcjK)
  {
    a(paramcjK, null);
  }

  public void a(cjK paramcjK, dle paramdle) {
    if (paramcjK == null)
      return;
    if (this.ejN.containsKey(Long.valueOf(paramcjK.getId()))) {
      this.ejN.remove(Long.valueOf(paramcjK.getId()));
      paramcjK.aMa();
      if (this.ejO != null) {
        this.ejO.b(paramcjK);
      }
      paramcjK.a(10011, null, paramdle);
    }
  }

  public void i(cjK paramcjK)
  {
    if (paramcjK == null)
      return;
    this.ejM.remove(Long.valueOf(paramcjK.getId()));
  }

  public void g(dle paramdle) {
    if (paramdle == null)
      return;
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = this.ejN.values().iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if (localcjK.axG() == paramdle)
        localArrayList.add(localcjK);
    }
    cjK localcjK;
    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      h(localcjK);
    }
  }

  public void h(dle paramdle)
  {
    if (paramdle == null)
      return;
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = this.ejN.values().iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if ((localcjK.axG() == paramdle) && (localcjK.clA()))
        localArrayList.add(localcjK);
    }
    cjK localcjK;
    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      h(localcjK);
    }
  }

  public boolean j(cjK paramcjK)
  {
    return this.ejN.containsKey(Long.valueOf(paramcjK.getId()));
  }

  public void bbk()
  {
    for (cjK localcjK : bbg()) {
      localcjK.release();
    }
    this.ejN.clear();
    this.ejM.clear();
  }

  public void a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, dle paramdle)
  {
    ArrayList localArrayList1 = new ArrayList();

    for (Object localObject1 = this.ejN.values().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cjK)((Iterator)localObject1).next();
      if (((cjK)localObject2).P(paramInt1, paramInt2, paramShort1)) {
        localArrayList1.add(localObject2);
      }
    }
    localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (Iterator localIterator = this.ejN.values().iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if (localcjK.a(paramdle, paramInt3, paramInt4, paramShort2)) {
        if (!localArrayList1.contains(localcjK))
          ((ArrayList)localObject1).add(localcjK);
        else {
          localArrayList2.add(localcjK);
        }
      }
      else if (localArrayList1.contains(localcjK))
        ((ArrayList)localObject2).add(localcjK);
    }
    cjK localcjK;
    for (localIterator = ((ArrayList)localObject1).iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      localcjK.a(10001, null, paramdle);
    }

    for (localIterator = localArrayList2.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      localcjK.a(10008, null, paramdle);
    }

    for (localIterator = ((ArrayList)localObject2).iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      localcjK.a(10002, null, paramdle);
    }
  }

  public boolean ed(long paramLong)
  {
    return this.ejN.containsKey(Long.valueOf(paramLong));
  }

  public boolean k(cjK paramcjK) {
    return this.ejN.containsKey(Long.valueOf(paramcjK.getId()));
  }

  public byte[] bbl()
  {
    int i = 2;
    HashMap localHashMap = new HashMap();
    for (Object localObject1 = this.ejN.values().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cjK)((Iterator)localObject1).next();
      localObject3 = ((cjK)localObject2).pr().array();
      localHashMap.put(localObject2, localObject3);
      i = (short)(i + (10 + localObject3.length));
    }
    Object localObject3;
    localObject1 = ByteBuffer.allocate(i);
    ((ByteBuffer)localObject1).putShort((short)this.ejN.size());

    for (Object localObject2 = this.ejN.values().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (cjK)((Iterator)localObject2).next();
      ((ByteBuffer)localObject1).putLong(((cjK)localObject3).clt());
      byte[] arrayOfByte = (byte[])localHashMap.get(localObject3);
      ((ByteBuffer)localObject1).putShort((short)arrayOfByte.length);
      ((ByteBuffer)localObject1).put(arrayOfByte);
    }
    return ((ByteBuffer)localObject1).array();
  }

  public void J(byte[] paramArrayOfByte) {
    bbk();
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getShort();
    for (int j = 0; j < i; j = (short)(j + 1)) {
      long l = localByteBuffer.getLong();
      cjK localcjK = ee(l);

      byte[] arrayOfByte = new byte[localByteBuffer.getShort()];
      localByteBuffer.get(arrayOfByte);
      if (localcjK != null) {
        localcjK.u(ByteBuffer.wrap(arrayOfByte));
        g(localcjK);
      }
    }
  }

  public abstract cjK ee(long paramLong);
}