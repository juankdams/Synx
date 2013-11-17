import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class azP
{
  private static final Logger K = Logger.getLogger(azP.class);

  private final Xg bIt = new Xg();
  private final ArrayList aBf = new ArrayList();

  public cXB b(deT paramdeT)
  {
    if (this.bIt.contains(paramdeT.getId())) {
      return cXB.kKU;
    }

    this.bIt.put(paramdeT.getId(), bHK.sW(paramdeT.getId()));

    for (int i = 0; i < this.aBf.size(); i++) {
      ((cTu)this.aBf.get(i)).f(paramdeT);
    }
    return cXB.kKQ;
  }

  public cXB c(deT paramdeT)
  {
    bHK localbHK = (bHK)this.bIt.remove(paramdeT.getId());
    if (localbHK == null) {
      return cXB.kKS;
    }
    localbHK.release();
    return cXB.kKQ;
  }

  public cXB bw(int paramInt1, int paramInt2)
  {
    bHK localbHK = (bHK)this.bIt.get(paramInt1);
    if (localbHK == null) {
      return cXB.kKV;
    }

    boolean bool = localbHK.qA(paramInt2);
    if (!bool) {
      return cXB.kKQ;
    }

    for (int i = 0; i < this.aBf.size(); i++) {
      ((cTu)this.aBf.get(i)).cj(paramInt1, paramInt2);
    }
    return cXB.kKQ;
  }

  public long d(int paramInt, long paramLong) {
    if (paramInt == 0)
      return 0L;
    if (getLevel(paramInt) >= 100) {
      return ll(paramInt);
    }

    bHK localbHK = (bHK)this.bIt.get(paramInt);
    if (localbHK == null) {
      K.error("Tentative d'ajout d'XP à un métier inconnu " + paramInt, new IllegalArgumentException());
      return 0L;
    }

    long l1 = localbHK.ayX();
    long l2 = localbHK.fX(paramLong);

    if (l1 != l2) {
      for (int i = 0; i < this.aBf.size(); i++) {
        ((cTu)this.aBf.get(i)).b(paramInt, paramLong);
      }
    }
    return l2;
  }

  public void lh(int paramInt) {
    if (paramInt == 0) {
      return;
    }
    ((bHK)this.bIt.get(paramInt)).bPo();
  }

  public void n(int paramInt, boolean paramBoolean) {
    if (paramInt == 0) {
      return;
    }
    ((bHK)this.bIt.get(paramInt)).gc(paramBoolean);
  }

  public void li(int paramInt) {
    if (paramInt == 0) {
      return;
    }
    ((bHK)this.bIt.get(paramInt)).bPp();
  }

  public boolean contains(int paramInt) {
    if (paramInt == 0) {
      return true;
    }
    return this.bIt.contains(paramInt);
  }

  public short getLevel(int paramInt) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? Et.bq(localbHK.ayX()) : 0;
  }

  public double e(int paramInt, long paramLong) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? Et.br(paramLong) : 0.0D;
  }

  public double lj(int paramInt) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? Et.br(localbHK.ayX()) : 0.0D;
  }

  public long lk(int paramInt) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? Et.bo(localbHK.ayX()) : 0L;
  }

  public long ll(int paramInt) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? localbHK.ayX() : 0L;
  }

  public int lm(int paramInt) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? localbHK.bzL() : 0;
  }

  public int ln(int paramInt) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? localbHK.bzJ() : 0;
  }

  public int lo(int paramInt) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? localbHK.bzK() : 0;
  }

  public int lp(int paramInt) {
    bHK localbHK = (bHK)this.bIt.get(paramInt);
    return localbHK != null ? localbHK.bzI() : 0;
  }

  public int[] aLI()
  {
    return this.bIt.qe();
  }

  public boolean bx(int paramInt1, int paramInt2) {
    bHK localbHK = (bHK)this.bIt.get(paramInt1);
    return (localbHK != null) && (localbHK.qB(paramInt2));
  }

  public void a(cTu paramcTu)
  {
    if (!this.aBf.contains(paramcTu))
      this.aBf.add(paramcTu);
  }

  public void b(cTu paramcTu) {
    this.aBf.remove(paramcTu);
  }

  public void clear()
  {
    int i = 0; for (int j = this.bIt.size(); i < j; i++) {
      ((bHK)this.bIt.hc(i)).release();
    }
    this.bIt.clear();
  }

  public void a(bxl parambxl)
  {
    int i = 0; for (int j = this.bIt.size(); i < j; i++) {
      bHK localbHK = (bHK)this.bIt.hc(i);
      ZN localZN = localbHK.bzH();
      if (localZN != null)
      {
        parambxl.aHr.add(localZN);
      }
    }
  }

  public void b(bxl parambxl) { EQ localEQ = new EQ(parambxl.aHr.size());
    for (Iterator localIterator = parambxl.aHr.iterator(); localIterator.hasNext(); ) {
      ZN localZN = (ZN)localIterator.next();
      deT localdeT = DA.bIr.eD(localZN.cMk);
      if (localdeT == null) {
        K.error("[SERIALISATION] Chargement d'un métier inconnu : " + localZN.cMk, new IllegalArgumentException());
        localIterator.remove();
      }
      else {
        this.bIt.put(localZN.cMk, bHK.a(localZN));
        localEQ.add(localZN.cMk);
      }
    }
    DA.bIr.g(new bDU(this, localEQ));
  }

  public static bHK d(deT paramdeT)
  {
    if (paramdeT.cMu()) {
      return DA.bIr.eE(paramdeT.getId());
    }
    return bHK.sW(paramdeT.getId());
  }
}