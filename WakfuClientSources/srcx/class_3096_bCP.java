import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;

public final class bCP
  implements aDQ
{
  private static final int gxB = 5;
  private static final boolean aRN = true;
  private static final Logger K = Logger.getLogger(bCP.class);
  private int cSO;
  private final cSR gxC = new cSR();
  private final cSR gxD = new cSR();
  private final cSR gxE = new cSR();

  private final cSR gxF = new cSR();

  private final cSi gxG = new cSi();

  private final ArrayList gxH = new ArrayList();
  private dfH gxI;
  private final dJe gxJ = new dJe();

  bCP(int paramInt, cSR paramcSR1, cSR paramcSR2) {
    this.cSO = paramInt;

    paramcSR1.a(new cuY(this));

    paramcSR2.a(new cuW(this));
  }

  bCP(bCP parambCP)
  {
    this(parambCP.cSO, parambCP.gxC, parambCP.gxD);
  }

  public void a(dfH paramdfH) {
    this.gxI = paramdfH;
  }

  public cSi sl(int paramInt) {
    return (cSi)this.gxF.get(paramInt);
  }

  public void k(int paramInt, long paramLong) {
    dpg localdpg = (dpg)this.gxC.get(paramInt);
    if (localdpg != null) {
      localdpg.fM(paramLong);
      if (this.gxI != null)
        this.gxI.a(localdpg);
    }
    else {
      throw new RuntimeException("Variable inconnue : " + paramInt);
    }
  }

  public boolean ma(int paramInt) {
    aiJ localaiJ = (aiJ)this.gxE.get(paramInt);
    if (localaiJ != null) {
      return localaiJ.Q();
    }
    throw new RuntimeException("Objectif inconnu : " + paramInt);
  }

  public boolean lZ(int paramInt) {
    return this.gxE.containsKey(paramInt);
  }

  public boolean sm(int paramInt) {
    return this.gxC.containsKey(paramInt);
  }

  public boolean mb(int paramInt) {
    return this.gxD.containsKey(paramInt);
  }

  public boolean a(int paramInt, bEg parambEg) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      return localdEE.a(parambEg);
    }
    throw new RuntimeException("Achievement inconnu : " + paramInt);
  }

  public boolean mf(int paramInt) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      return bbK.c(localdEE, aat.cOE.VN());
    }
    throw new RuntimeException("Achievement inconnu : " + paramInt);
  }

  public boolean mg(int paramInt) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      return (bbK.a(localdEE, aat.cOE.VN())) && (!localdEE.isComplete());
    }

    throw new RuntimeException("Achievement inconnu : " + paramInt);
  }

  public boolean me(int paramInt) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      return localdEE.bnc();
    }
    throw new RuntimeException("Achievement inconnu : " + paramInt);
  }

  public boolean md(int paramInt) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      return localdEE.isComplete();
    }
    throw new RuntimeException("Achievement inconnu : " + paramInt);
  }

  public aTX gn(String paramString) {
    return dHn.lSk.gn(paramString);
  }

  public boolean mc(int paramInt) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      return bbK.a(localdEE, aat.cOE.VN());
    }
    throw new RuntimeException("Achievement inconnu : " + paramInt);
  }

  public ajv mh(int paramInt) {
    return dHn.lSk.CI(paramInt);
  }

  public long mi(int paramInt) {
    dpg localdpg = (dpg)this.gxC.get(paramInt);
    if (localdpg != null) {
      return localdpg.getValue();
    }
    throw new RuntimeException("Variable inconnue : " + paramInt);
  }

  public boolean mj(int paramInt)
  {
    return this.gxG.contains(paramInt);
  }

  public boolean o(int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      if (this.gxG.size() >= 4) {
        return false;
      }
      if (!this.gxG.contains(paramInt)) {
        this.gxG.add(paramInt);
        this.gxI.C(paramInt, true);
        return true;
      }
    }
    else if (Cu.b(this.gxG, paramInt)) {
      this.gxI.C(paramInt, false);
      return true;
    }

    return false;
  }

  public void l(int paramInt, long paramLong) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null)
      this.gxI.a(localdEE, paramLong);
  }

  public void sn(int paramInt)
  {
    u(paramInt, true);
  }

  public void u(int paramInt, boolean paramBoolean) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      localdEE.reset();
      localdEE.setActive(false);

      if (paramBoolean) {
        this.gxI.e(localdEE);
      }

      boolean bool = o(paramInt, false);
      if (bool)
        this.gxI.C(paramInt, false);
    }
  }

  public cSi aQa()
  {
    return this.gxG;
  }

  public void so(int paramInt) {
    aiJ localaiJ = (aiJ)this.gxE.get(paramInt);
    if (localaiJ != null) {
      localaiJ.cm(true);
      if (this.gxI != null) {
        this.gxI.b(localaiJ);
      }
      K.info("Achievement objective completed : " + paramInt);
    } else {
      K.error("Impossible de trouver l'objectif " + paramInt + " dans le contexte du joueur");
    }
  }

  public void sp(int paramInt) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      localdEE.g(this);
      K.info("Achievement activated : " + paramInt);
      if (this.gxI != null)
        this.gxI.d(localdEE);
    }
    else {
      K.error("Impossible de trouver l'achievement " + paramInt + " dans le contexte du joueur");
    }
  }

  public void m(int paramInt, long paramLong) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE != null) {
      localdEE.h(this);
      K.info("! Achievement unlocked ! : " + paramInt + " on " + new Date(paramLong) + " (server time)");

      this.gxH.add(new cIl(paramInt, paramLong));
      int i = this.gxH.size();
      if ((i > 0) && (i > 5)) {
        this.gxH.remove(0);
      }

      boolean bool = o(paramInt, false);

      if (this.gxI != null) {
        this.gxI.c(localdEE);
        if (bool)
          this.gxI.C(paramInt, false);
      }
    }
    else {
      K.error("Impossible de trouver l'achievement " + paramInt + " dans le contexte du joueur");
    }
  }

  public ArrayList bLp() {
    return this.gxH;
  }

  public dEE sq(int paramInt) {
    return (dEE)this.gxD.get(paramInt);
  }

  public dmn bLq() {
    return this.gxD.yF();
  }

  private void bLr() {
    this.gxD.a(new cva(this));
  }

  public void C(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    K.info("Déserialisation des achievements : size=" + paramArrayOfByte.length);

    this.cSO = localByteBuffer.getInt();

    int i = localByteBuffer.get() & 0xFF;
    for (int j = 0; j < i; j++) {
      k = localByteBuffer.getInt();
      long l1 = localByteBuffer.getLong();
      this.gxH.add(new cIl(k, l1));
    }

    j = localByteBuffer.getInt();
    for (int k = 0; k < j; k++) {
      m = localByteBuffer.getInt();
      long l2 = localByteBuffer.getLong();
      dpg localdpg = (dpg)this.gxC.get(m);
      if (localdpg != null) {
        localdpg.fM(l2);
      }
    }

    k = localByteBuffer.getInt();
    for (int m = 0; m < k; m++) {
      n = localByteBuffer.getInt();
      boolean bool1 = localByteBuffer.get() == 1;
      boolean bool2 = localByteBuffer.get() == 1;

      long l3 = this.cSO >= 1 ? localByteBuffer.getLong() : 0L;
      long l4 = this.cSO >= 2 ? localByteBuffer.getLong() : 0L;

      dEE localdEE = (dEE)this.gxD.get(n);
      if (localdEE != null) {
        localdEE.setActive(bool1);
        localdEE.cm(bool2);
        localdEE.bn(l3);
        localdEE.Z(l4);
      } else {
        K.error("Achievement inexistant : Id=" + n);
      }

    }

    m = localByteBuffer.getInt();
    for (int n = 0; n < m; n++) {
      i1 = localByteBuffer.getInt();

      aiJ localaiJ = (aiJ)this.gxE.get(i1);
      if (localaiJ != null)
        localaiJ.cm(true);
      else {
        K.error("Objectif inexistant : Id=" + i1);
      }
    }

    n = localByteBuffer.get() & 0xFF;
    for (int i1 = 0; i1 < n; i1++) {
      this.gxG.add(localByteBuffer.getInt());
    }

    bLr();

    if (this.gxI != null)
      this.gxI.f(this);
  }

  public void sr(int paramInt)
  {
    long l1 = System.currentTimeMillis();
    long l2 = this.gxJ.get(paramInt);
    if ((l2 == 0L) || (l2 + 30000L > l1))
    {
      this.gxJ.C(paramInt, l1);
      this.gxI.zU(paramInt);
    }
  }

  public boolean mk(int paramInt) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);
    if (localdEE == null) {
      return false;
    }

    return bbK.b(localdEE, aat.cOE.VN());
  }

  public void reset(int paramInt) {
    dEE localdEE = (dEE)this.gxD.get(paramInt);

    localdEE.reset();

    ArrayList localArrayList = localdEE.dgh();
    for (int i = 0; i < localArrayList.size(); i++) {
      aiJ localaiJ1 = (aiJ)localArrayList.get(i);
      this.gxE.put(localaiJ1.getId(), localaiJ1);

      aiJ localaiJ2 = dHn.lSk.CI(localaiJ1.getId());
      dpg[] arrayOfdpg = localaiJ2.avx();
      for (int j = 0; (arrayOfdpg != null) && (j < arrayOfdpg.length); j++) {
        k(arrayOfdpg[j].getId(), 0L);
      }
    }

    if (this.gxI != null)
      this.gxI.f(localdEE);
  }
}