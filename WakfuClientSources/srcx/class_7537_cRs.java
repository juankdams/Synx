import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class cRs
  implements eo, Iterable
{
  public static final int kDH = 2175;
  public static final int kDI = 5;
  private static final int kDJ = 2;
  private static final Logger K = Logger.getLogger(cRs.class);
  protected long bkH;
  protected int cGS;
  protected final dfy krO;
  protected byte cQl;
  private final bPr fDv;

  protected cRs(long paramLong, int paramInt, bPr parambPr, short paramShort)
  {
    this.bkH = paramLong;
    this.krO = new dfy(Hh.QM(), parambPr, paramShort, true);
    this.cQl = 0;
    this.cGS = paramInt;
    this.fDv = parambPr;
    cHS();
  }

  private void cHS() {
    int[] arrayOfInt = cqa.hZQ.wc(this.cGS);
    if (arrayOfInt != null)
      this.krO.a(new bmd(arrayOfInt, this.fDv));
    else
      this.krO.a(this.fDv);
  }

  public int ok()
  {
    return this.cGS;
  }

  public byte cHq() {
    return this.cQl;
  }

  public void aH(byte paramByte) {
    this.cQl = paramByte;
  }

  public long EN() {
    return this.bkH;
  }

  public dfy cHT() {
    return this.krO;
  }

  public short cFy() {
    return this.krO.cFy();
  }

  public int size() {
    return this.krO.size();
  }

  public boolean g(gA paramgA, short paramShort) {
    return this.krO.d(paramgA, paramShort);
  }

  public boolean q(long paramLong, short paramShort) {
    return this.krO.q(paramLong, paramShort);
  }

  public boolean au(gA paramgA) {
    return this.krO.l(paramgA);
  }

  public boolean h(gA paramgA, short paramShort) {
    return this.krO.a(paramgA, paramShort);
  }

  public boolean aL(gA paramgA) {
    return this.krO.s(paramgA);
  }

  public void cHU() {
    this.krO.cHU();
  }

  public void c(bbk parambbk) {
    if (parambbk == null) {
      return;
    }
    this.krO.c(parambbk);
  }

  public void d(bbk parambbk) {
    this.krO.d(parambbk);
  }

  public Iterator iterator() {
    return this.krO.iterator();
  }

  public gA dR(short paramShort) {
    return (gA)this.krO.dB(paramShort);
  }

  public boolean a(btn parambtn) {
    parambtn.bPv = this.bkH;
    parambtn.bPw = this.cGS;
    parambtn.bPx = this.krO.cFy();
    parambtn.aYU = this.cQl;

    for (gA localgA : this.krO) {
      if (localgA.og()) {
        aTg localaTg = new aTg();
        localaTg.cIh = this.krO.il(localgA.oj());
        boolean bool = localgA.a(localaTg.cpq);
        if (bool) {
          parambtn.bPy.aZC.add(localaTg);
        } else {
          K.error("Impossible de convertir l'item à la position " + localaTg.cIh + " sous forme désérialisée brute");
          return false;
        }
      }
    }
    return true;
  }

  public boolean b(btn parambtn) {
    this.bkH = parambtn.bPv;
    this.cGS = parambtn.bPw;
    this.cQl = parambtn.aYU;

    this.krO.dy(parambtn.bPx);

    cHS();
    if (!a(cHW(), this.cQl)) {
      K.error("La position (" + this.cQl + ") du sac " + this.bkH + " refId=" + this.cGS + " est incorrecte");
    }

    boolean bool = true;
    for (aTg localaTg : parambtn.bPy.aZC) {
      gA localgA = (gA)this.krO.ajw().o(localaTg.cpq);
      if (localgA != null) {
        try {
          if (!i(localgA, localaTg.cIh))
            bool = false;
        }
        catch (dI localdI) {
          bool = false;
          K.error(localdI);
        } catch (dcF localdcF) {
          bool = false;
          K.error(localdcF);
        } catch (bQT localbQT) {
          bool = false;
          K.error(localbQT);
        }
      } else {
        K.error("Désérialisation d'un Item null à la position " + localaTg.cIh);
        bool = false;
      }
    }
    return bool;
  }

  public int ajy() {
    return this.krO.ajy();
  }

  public void c(dVX paramdVX) {
    this.krO.c(paramdVX);
  }

  public short bQI() {
    return this.krO.bQI();
  }

  public short aM(gA paramgA) {
    return this.krO.r(paramgA);
  }

  public boolean i(gA paramgA, short paramShort) {
    return a(paramgA, paramShort, null);
  }

  public boolean a(gA paramgA, short paramShort, cNd paramcNd)
  {
    if (paramcNd != null)
      this.krO.d(paramcNd);
    try
    {
      return this.krO.b(paramgA, paramShort);
    } finally {
      if (paramcNd != null)
        this.krO.c(paramcNd);
    }
  }

  public short aN(gA paramgA)
  {
    return this.krO.n(paramgA);
  }

  public short il(long paramLong) {
    return this.krO.il(paramLong);
  }

  public int ajx() {
    return this.krO.ajx();
  }

  public gA dS(short paramShort) {
    return (gA)this.krO.dz(paramShort);
  }

  public boolean K(gA paramgA) {
    return this.krO.d(paramgA);
  }

  public boolean isEmpty() {
    return this.krO.isEmpty();
  }

  public boolean hg(int paramInt) {
    return this.krO.hg(paramInt);
  }

  public boolean ch(long paramLong) {
    return this.krO.ch(paramLong);
  }

  public boolean c(long paramLong, short paramShort) {
    return a(paramLong, paramShort, null);
  }

  public boolean a(long paramLong, short paramShort, cNd paramcNd) {
    if (paramcNd != null)
      this.krO.d(paramcNd);
    try
    {
      return this.krO.c(paramLong, paramShort);
    } finally {
      if (paramcNd != null)
        this.krO.c(paramcNd);
    }
  }

  public gA je(long paramLong)
  {
    return (gA)this.krO.ci(paramLong);
  }

  public gA yS(int paramInt) {
    Iterator localIterator = this.krO.iterator();

    while (localIterator.hasNext())
    {
      gA localgA = (gA)localIterator.next();
      if (paramInt == localgA.oi().bKn().nc()) {
        return localgA;
      }
    }
    return null;
  }

  public gA o(ge paramge) {
    Iterator localIterator = this.krO.iterator();

    while (localIterator.hasNext()) {
      gA localgA = (gA)localIterator.next();

      if (localgA.oi().bKn().c(paramge)) {
        return localgA;
      }
    }
    return null;
  }

  public gA d(bGS parambGS) {
    Iterator localIterator = this.krO.iterator();

    while (localIterator.hasNext()) {
      gA localgA = (gA)localIterator.next();

      if (localgA.oi().b(parambGS)) {
        return localgA;
      }
    }
    return null;
  }

  public bPr ajz() {
    return this.krO.ajz();
  }

  public boolean av(gA paramgA) {
    return this.krO.c(paramgA);
  }

  public boolean a(gA paramgA, bbk parambbk)
  {
    if (parambbk != null)
      this.krO.d(parambbk);
    try
    {
      return this.krO.c(paramgA);
    } finally {
      if (parambbk != null)
        this.krO.c(parambbk);
    }
  }

  public boolean j(gA paramgA)
  {
    return this.krO.f(paramgA);
  }

  public gA yT(int paramInt) {
    return (gA)this.krO.hh(paramInt);
  }

  public gA d(int paramInt, dVX paramdVX) {
    return (gA)this.krO.a(paramInt, paramdVX);
  }

  public gA jf(long paramLong) {
    return (gA)this.krO.cg(paramLong);
  }

  public int cEj() {
    int i = this.krO.cFy();
    int j = 0;
    for (short s = 0; s < i; s = (short)(s + 1)) {
      if (this.krO.cH(s)) {
        j++;
      }
    }
    return j;
  }

  public ArrayList hi(int paramInt) {
    return this.krO.hi(paramInt);
  }

  public ArrayList b(int paramInt, dVX paramdVX) {
    return this.krO.b(paramInt, paramdVX);
  }

  public ArrayList a(dVX paramdVX) {
    return this.krO.a(paramdVX);
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName()).append(" ").append(EN()).append("{\n");
    localStringBuilder.append("\t").append("RefId ").append(ok()).append("\n");
    int j;
    for (int i = 0; i < this.krO.cFy(); j = (short)(i + 1)) {
      gA localgA = (gA)this.krO.dB(i);
      localStringBuilder.append("\t");
      if (localgA != null)
        localStringBuilder.append(i).append(" : ").append(localgA.nP()).append("x").append(localgA.ok()).append("; ");
      else {
        localStringBuilder.append(i).append(" : ").append("null").append("; ");
      }
      if (i == this.krO.cFy() / 2 - 1) {
        localStringBuilder.append("\n");
      }
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public final boolean cHV() {
    return ok() == 2175;
  }

  public boolean cHW() {
    return cqa.hZQ.wd(this.cGS);
  }

  public static boolean a(gA paramgA, dhJ paramdhJ) {
    int i = paramdhJ.nU();
    if (paramdhJ.b(eu.azz)) {
      i = (short)(i + paramdhJ.e(eu.azz));
    }
    if (paramgA.nU() > i) {
      return false;
    }

    bZA localbZA = paramgA.oi().a(Aq.bvQ);
    if (localbZA != null) {
      return localbZA.i(paramdhJ, paramgA, null, paramdhJ.bEY());
    }
    return true;
  }

  public static boolean a(boolean paramBoolean, byte paramByte) {
    byte b = paramBoolean ? 5 : 3;
    return (paramByte >= 0) && (paramByte <= b);
  }
}