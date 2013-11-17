import java.util.ArrayList;
import java.util.BitSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dDN
  implements amA, Iterable
{
  protected static final Logger K = Logger.getLogger(dDN.class);
  private static final dGy hId = new aeX();

  protected final aoL kCz = new aoL();
  private boolean lMa;
  protected cDh lMb = new cDh(this);
  public static final byte lMc = 1;
  public static final byte lMd = 10;
  public static final byte lMe = 11;
  public static final byte lMf = 2;
  public static final byte lMg = 20;
  public static final byte lMh = 21;
  public static final byte lMi = 3;
  public static final byte lMj = 30;
  public static final byte lMk = 31;
  public static final byte lMl = 4;
  public static final byte lMm = 40;
  public static final byte lMn = 41;
  public static final byte lMo = 5;
  public static final byte lMp = 6;
  public static final byte lMq = 60;
  public static final byte lMr = 61;
  private boolean lMs = false;

  public dDN() {
    this.lMa = true;
    btl();
  }

  protected void btl() {
    this.lMb = new cDh(this);
  }

  public void clear()
  {
    for (long l : this.kCz.aBb()) {
      aVc localaVc = (aVc)this.kCz.get(l);

      if (localaVc != null)
        try {
          localaVc.ef(false);
        } catch (Exception localException) {
          K.error("Exception levee lors de la déspplication d'un effet", localException);
        }
    }
    this.kCz.clear();
  }

  public void bbk() {
    this.kCz.s(hId);
    this.kCz.clear();
  }

  public void dfD() {
    this.lMa = false;
  }

  public void dfE() {
    this.lMa = true;
  }

  public dle axG() {
    return null;
  }

  public aVc kw(long paramLong) {
    return (aVc)this.kCz.get(paramLong);
  }

  public void F(aVc paramaVc)
  {
    if (!this.kCz.containsKey(paramaVc.oj())) {
      this.kCz.put(paramaVc.oj(), paramaVc);
      paramaVc.a(this);
    }
    else if ((!bB) && (paramaVc != this.kCz.get(paramaVc.oj()))) { throw new AssertionError(); }
  }

  public boolean G(aVc paramaVc)
  {
    return kx(paramaVc.oj());
  }

  public void a(aVc[] paramArrayOfaVc) {
    if ((paramArrayOfaVc != null) && (paramArrayOfaVc.length > 0))
      for (aVc localaVc : paramArrayOfaVc)
        G(localaVc);
  }

  public void H(aVc paramaVc)
  {
    paramaVc.bkG();
  }

  public boolean kx(long paramLong) {
    aVc localaVc = (aVc)this.kCz.remove(paramLong);
    if (localaVc != null) {
      H(localaVc);
      return true;
    }
    return false;
  }

  public Iterator Y(aVc paramaVc) {
    return bLC.a(this, this.kCz.aBa(), paramaVc);
  }

  public Iterable Cu(int paramInt) {
    ArrayList localArrayList = new ArrayList();
    if ((this.kCz != null) && (!this.kCz.isEmpty())) {
      this.kCz.s(new aeP(this, paramInt, localArrayList));
    }

    return localArrayList;
  }

  public Iterable Cv(int paramInt) {
    ArrayList localArrayList = new ArrayList();
    if ((this.kCz != null) && (!this.kCz.isEmpty())) {
      this.kCz.s(new aeQ(this, paramInt, localArrayList));
    }

    return localArrayList;
  }

  public Iterable Cw(int paramInt) {
    ArrayList localArrayList = new ArrayList();
    if ((this.kCz != null) && (!this.kCz.isEmpty())) {
      this.kCz.s(new aeR(this, paramInt, localArrayList));
    }

    return localArrayList;
  }

  protected dAt F(dle paramdle) {
    return dAt.a(this, this.kCz.aBa(), paramdle, false);
  }

  public dAt G(dle paramdle) {
    return dAt.a(this, this.kCz.aBa(), paramdle, true);
  }

  protected dgc g(Ce paramCe) {
    return dgc.a(this, this.kCz.aBa(), paramCe);
  }

  public void Z(aVc paramaVc) {
    try {
      for (localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        aVc localaVc = (aVc)localcHu.value();
        if (localaVc.bkn() == paramaVc) {
          localcHu.remove();
          localaVc.bkG();
        }
      }
    }
    catch (ConcurrentModificationException localConcurrentModificationException)
    {
      cHu localcHu;
      Z(paramaVc);
    }
  }

  public void o(dle paramdle) {
    try {
      for (localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        aVc localaVc = (aVc)localcHu.value();
        if ((localaVc.bke() == paramdle) || (localaVc.bkf() == paramdle)) {
          localcHu.remove();
          localaVc.bkG();
        }
      }
    }
    catch (ConcurrentModificationException localConcurrentModificationException)
    {
      cHu localcHu;
      o(paramdle);
    }
  }

  public void a(Ce paramCe, boolean paramBoolean) {
    try {
      for (localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        aVc localaVc = (aVc)localcHu.value();
        if (localaVc.wa() == paramCe) {
          localcHu.remove();
          if (paramBoolean)
            localaVc.bkG();
        }
      }
    }
    catch (ConcurrentModificationException localConcurrentModificationException)
    {
      cHu localcHu;
      a(paramCe, paramBoolean);
    }
  }

  public void a(Ce paramCe, boolean paramBoolean1, boolean paramBoolean2) {
    throw new UnsupportedOperationException("Ne devrait pas être appelé si n'est pas implémenté");
  }

  public void H(int paramInt, boolean paramBoolean) {
    try {
      for (localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        aVc localaVc = (aVc)localcHu.value();
        if ((localaVc.wa() != null) && (localaVc.wa().nS() == paramInt)) {
          localcHu.remove();
          if (paramBoolean)
            localaVc.bkG();
        }
      }
    }
    catch (ConcurrentModificationException localConcurrentModificationException)
    {
      cHu localcHu;
      H(paramInt, paramBoolean);
    }
  }

  public void d(duF paramduF) {
    try {
      for (localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        aVc localaVc = (aVc)localcHu.value();
        if (localaVc.bkc() == paramduF) {
          localcHu.remove();
          localaVc.bkG();
        }
      }
    }
    catch (ConcurrentModificationException localConcurrentModificationException)
    {
      cHu localcHu;
      d(paramduF);
    }
  }

  public Iterator iterator() {
    return new dAI(this.kCz);
  }

  public boolean a(BitSet paramBitSet, aVc paramaVc, byte paramByte) {
    if (!this.lMa) {
      return false;
    }
    return this.lMb.a(paramBitSet, paramaVc, paramByte);
  }

  public boolean isEmpty() {
    return this.kCz.isEmpty();
  }

  public int size() {
    return this.kCz.size();
  }

  public boolean Cx(int paramInt) {
    for (aVc localaVc : this) {
      if ((localaVc.bkc() != null) && (localaVc.bkc().yR() == paramInt)) {
        return true;
      }
    }
    return false;
  }

  public void kR(boolean paramBoolean) {
    this.lMs = paramBoolean;
  }

  public boolean dfF() {
    return this.lMs;
  }
}