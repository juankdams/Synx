import java.util.ArrayList;
import org.apache.log4j.Logger;

class bHK
  implements bBz
{
  private static final Logger K = Logger.getLogger(bHK.class);
  private static final bOO bf = new bOO(new bOj());
  private int aPq;
  private long gCz;
  private int gGv;
  private int gGw;
  private int gGx;
  private int gGy;
  private final adz gGz = new adz();

  private bHK() {
  }

  protected bHK(int paramInt) {
    this.aPq = paramInt;
  }

  long ayX() {
    return this.gCz;
  }

  public int bzL() {
    return this.gGv;
  }

  void bPo() {
    this.gGv += 1;
  }

  public int bzK() {
    return this.gGx;
  }

  public int bzJ() {
    return this.gGw;
  }

  void gc(boolean paramBoolean) {
    if (paramBoolean)
      this.gGx += 1;
    else
      this.gGw += 1;
  }

  public int bzI() {
    return this.gGy;
  }

  void bPp() {
    this.gGy += 1;
  }

  long fX(long paramLong)
  {
    long l = this.gCz + paramLong;
    if (Et.bq(l) >= 100)
      return this.gCz = Et.D((short)100);
    return this.gCz += paramLong;
  }

  public boolean qA(int paramInt)
  {
    return this.gGz.hL(paramInt);
  }

  boolean qB(int paramInt) {
    return this.gGz.contains(paramInt);
  }

  static bHK a(ZN paramZN)
  {
    int i = paramZN.cMk;
    bHK localbHK = sW(i);
    localbHK.gCz = paramZN.aGh;

    dWa localdWa = paramZN.cMl;
    aIW localaIW = localdWa.ekc;
    doW localdoW = localdWa.ekd;
    XC localXC = localdWa.eke;
    aIT localaIT = localdWa.ekf;
    localbHK.gGv = (localaIW != null ? localaIW.counter : 0);
    localbHK.gGw = (localdoW != null ? localdoW.counter : 0);
    localbHK.gGx = (localXC != null ? localXC.counter : 0);
    localbHK.gGy = (localaIT != null ? localaIT.counter : 0);

    for (int j = 0; j < paramZN.cMm.size(); j++) {
      localbHK.gGz.hL(((ccv)paramZN.cMm.get(j)).hug);
    }
    return localbHK;
  }

  ZN bzH()
  {
    ZN localZN = new ZN();
    localZN.cMk = this.aPq;
    localZN.aGh = this.gCz;

    dWa localdWa = localZN.cMl;
    if (this.gGv > 0) {
      localdWa.ekc = new aIW();
      localdWa.ekc.counter = this.gGv;
    }
    if (this.gGw > 0) {
      localdWa.ekd = new doW();
      localdWa.ekd.counter = this.gGw;
    }
    if (this.gGx > 0) {
      localdWa.eke = new XC();
      localdWa.eke.counter = this.gGx;
    }
    if (this.gGy > 0) {
      localdWa.ekf = new aIT();
      localdWa.ekf.counter = this.gGy;
    }

    for (kr localkr = this.gGz.apz(); localkr.hasNext(); )
    {
      ccv localccv = new ccv();
      localccv.hug = localkr.next();
      localZN.cMm.add(localccv);
    }
    return localZN;
  }

  static bHK sW(int paramInt)
  {
    bHK localbHK;
    try
    {
      localbHK = (bHK)bf.Mm();
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkout de " + bHK.class, localException);
      localbHK = new bHK();
    }
    localbHK.aPq = paramInt;
    return localbHK;
  }

  public void release() {
    try {
      bf.y(this);
    } catch (Exception localException) {
      K.error("Erreur lors d'un release de " + bHK.class, localException);
      bc();
    }
  }

  public void aJ() {
    this.aPq = 0;
    this.gCz = 0L;

    this.gGv = 0;
    this.gGx = 0;
    this.gGw = 0;
    this.gGy = 0;

    this.gGz.clear();
  }

  public void bc() {
    this.aPq = -1;
    this.gCz = -1L;

    this.gGv = -1;
    this.gGx = -1;
    this.gGw = -1;
    this.gGy = -1;

    this.gGz.clear();
  }
}