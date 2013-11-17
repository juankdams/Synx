import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public final class dtq
{
  private static final Logger K = Logger.getLogger(dtq.class);
  public static final int lvR = 11;
  private final cYk lvS = new cYk();
  private cYk lvT = null;
  private final List lvU;

  public static dtq d(cuB paramcuB)
  {
    if ((!paramcuB.csX()) || (paramcuB.csW() <= 1)) {
      K.error("Impossible de convertir un PathFindResult sans résultat en Direction8Path");
      return null;
    }
    dtq localdtq = new dtq(paramcuB.csW() - 1);
    localdtq.am(new cYk(paramcuB.csY()));
    for (int i = 1; i < paramcuB.csW(); i++) {
      CG localCG = paramcuB.wS(i);
      int j = paramcuB.wR(i)[2] - paramcuB.wR(i - 1)[2];
      if (localCG != null) {
        localdtq.a(localCG, j);
      } else {
        K.error("Impossible de convertir le déplacement en Direction8 : le PathFindResult n'est pas continu ?");
        return null;
      }
    }
    localdtq.an(new cYk(paramcuB.csZ()));
    return localdtq;
  }

  public dtq(cYk paramcYk, List paramList) {
    this.lvU = paramList;
    if ((paramList == null) || (paramList.size() == 0)) {
      K.error("Liste de cellules vide");
      return;
    }
    am(paramcYk);
  }

  public static dtq aO(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.remaining() < 11) {
      K.error("Impossible de décoder un Direction8Path dans un buffer de " + paramByteBuffer.remaining() + " < " + 11);
      return null;
    }
    paramByteBuffer.mark();
    int i = paramByteBuffer.getInt();
    int j = paramByteBuffer.getInt();
    short s = paramByteBuffer.getShort();
    int k = paramByteBuffer.get() & 0xFF;
    dtq localdtq = new dtq(k);
    cYk localcYk = new cYk(i, j, s);
    localdtq.am(localcYk);
    if (paramByteBuffer.remaining() < localdtq.cZD()) {
      K.error("La taille du buffer ne correspond pas : attendu=" + localdtq.cZD() + " > courant=" + paramByteBuffer.remaining());
      paramByteBuffer.reset();
      return null;
    }
    for (int m = 0; m < k; m++) {
      int n = paramByteBuffer.get();
      CG localCG = CG.eu(n >> 5 & 0x7);
      int i1 = n & 0x1F;
      if ((i1 & 0x10) != 0) {
        i1 |= -32;
      }
      localdtq.a(localCG, i1);
    }
    localdtq.an(localcYk);
    return localdtq;
  }

  public static dtq a(cYk paramcYk, dtq paramdtq1, dtq paramdtq2)
  {
    cYk localcYk1 = paramdtq2.cZz();
    cYk localcYk2 = paramdtq1.cZz();
    om localom1 = -1;
    int i = -1;
    if (localcYk2.bg(paramcYk)) {
      localom1 = 0;
    }
    if (localcYk2.bg(localcYk1))
      i = 0;
    om localom2;
    for (int j = 0; j < paramdtq1.cZC(); j++) {
      localom2 = paramdtq1.BG(j);
      localcYk2.k(localom2.aTt);
      localcYk2.p(0, 0, localcYk2.IB() + localom2.aTu);
      if ((localom1 == -1) && (localcYk2.bg(paramcYk))) {
        localom1 = j + 1;
        if (i != -1) {
          break;
        }
      }
      else if ((i == -1) && (localcYk2.bg(localcYk1))) {
        i = j + 1;
        if (localom1 != -1) {
          break;
        }
      }
    }
    if ((localom1 != -1) && (i != -1)) {
      dtq localdtq = new dtq(paramdtq2.cZC() + paramdtq1.cZC());
      localdtq.am(paramcYk);
      if (i >= localom1)
      {
        for (localom2 = localom1; localom2 <= i - 1; localom2++) {
          localdtq.a(paramdtq1.BG(localom2));
        }
      }
      else {
        for (int k = localom1 - 1; k >= i; k--) {
          om localom3 = paramdtq1.BG(k);
          localdtq.a(localom3.aTt.LS(), -localom3.aTu);
        }
      }
      localdtq.lvU.addAll(paramdtq2.lvU);
      localdtq.an(new cYk(paramdtq2.cZA()));
      return localdtq;
    }
    return null;
  }

  public cYk cZz()
  {
    return new cYk(this.lvS);
  }

  public cYk cZA()
  {
    if (this.lvT == null) {
      cYk localcYk = cZz();
      for (om localom : this.lvU) {
        localcYk.k(localom.aTt);
        localcYk.p(0, 0, localom.aTu);
      }
      this.lvT = localcYk;
    }
    return new cYk(this.lvT);
  }

  public byte[] encode()
  {
    if ((!bB) && (this.lvU.size() > 255)) throw new AssertionError("Impossible d'encoder un Direction8Path de plus de 255 steps");

    ByteBuffer localByteBuffer = ByteBuffer.allocate(cZB());
    localByteBuffer.putInt(this.lvS.getX());
    localByteBuffer.putInt(this.lvS.getY());
    localByteBuffer.putShort(this.lvS.IB());
    localByteBuffer.put((byte)this.lvU.size());
    for (om localom : this.lvU) {
      int i = (localom.aTt.m_index & 0x7) << 5;
      i |= localom.aTu & 0x1F;
      localByteBuffer.put((byte)i);
    }
    return localByteBuffer.array();
  }

  public int cZB()
  {
    return 11 + cZD();
  }

  public String toString()
  {
    String str = "{ [" + this.lvS.getX() + ":" + this.lvS.getY() + ":" + this.lvS.IB() + "] ";
    cYk localcYk = cZz();
    for (om localom : this.lvU) {
      localcYk.k(localom.aTt);
      localcYk.p(0, 0, localom.aTu);
      str = str + "[" + localcYk.getX() + ":" + localcYk.getY() + ":" + localcYk.IB() + "] ";
    }
    str = str + "}";
    return str;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof dtq))) {
      dtq localdtq = (dtq)paramObject;
      if (!localdtq.lvS.equals(this.lvS)) {
        return false;
      }
      return localdtq.lvU.equals(this.lvU);
    }
    return false;
  }

  public int cZC()
  {
    return this.lvU.size();
  }

  public om BG(int paramInt)
  {
    return (om)this.lvU.get(paramInt);
  }

  public dtq eV(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= paramInt2) || (paramInt2 > cZC())) {
      throw new IllegalArgumentException("0 <= startIndex < endIndex <= size() non-respecté");
    }
    dtq localdtq = new dtq(paramInt2 - paramInt1);
    cYk localcYk = cZz();
    for (int i = 0; i < paramInt1; i++) {
      om localom = (om)this.lvU.get(i);
      localcYk.k(localom.aTt);
      localcYk.p(0, 0, localom.aTu);
    }
    localdtq.am(localcYk);
    for (i = paramInt1; i < paramInt2; i++) {
      localdtq.a((om)this.lvU.get(i));
    }
    return localdtq;
  }

  public boolean B(cYk paramcYk)
  {
    cYk localcYk = cZz();
    if (localcYk.bg(paramcYk)) {
      return true;
    }
    for (int i = 0; i < cZC(); i++) {
      om localom = (om)this.lvU.get(i);
      localcYk.k(localom.aTt);
      localcYk.p(0, 0, localom.aTu);
      if (localcYk.bg(paramcYk)) {
        return true;
      }
    }
    return false;
  }

  public boolean c(dtq paramdtq)
  {
    cYk localcYk1 = cZz();
    cYk localcYk2 = paramdtq.cZz();
    int i = -1;
    if (localcYk1.bg(localcYk2))
      i = 0;
    else {
      for (j = 0; j < cZC(); j++) {
        om localom = (om)this.lvU.get(j);
        localcYk1.k(localom.aTt);
        localcYk1.p(0, 0, localom.aTu);
        if (localcYk1.bg(localcYk2)) {
          i = j + 1;
          break;
        }
      }
    }
    if (i == -1) {
      return false;
    }
    if (cZC() - i < paramdtq.cZC()) {
      return false;
    }
    int j = i; for (int k = 0; (j < cZC()) && (k < paramdtq.cZC()); k++) {
      if (BG(j) != paramdtq.BG(k))
        return false;
      j++;
    }

    return true;
  }

  private dtq(int paramInt) {
    this.lvU = new ArrayList(paramInt);
  }

  private void a(CG paramCG, int paramInt) {
    if ((paramInt < -16) || (paramInt > 15) || (paramCG.m_index < 0) || (paramCG.m_index > 7) || (this.lvU.size() > 255)) {
      throw new IllegalArgumentException("step ou direction invalides");
    }
    this.lvU.add(new om(paramCG, paramInt));
  }

  private void a(om paramom)
  {
    if ((paramom.aTu < -16) || (paramom.aTu > 15) || (paramom.aTt.m_index < 0) || (paramom.aTt.m_index > 7)) {
      throw new IllegalArgumentException("step ou direction invalides");
    }
    a(paramom.aTt, paramom.aTu);
  }

  private void am(cYk paramcYk) {
    this.lvS.ae(paramcYk);
  }

  private void an(cYk paramcYk) {
    this.lvT = paramcYk;
  }

  private int cZD() {
    return this.lvU.size();
  }
}