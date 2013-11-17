import org.apache.log4j.Logger;

public class cdH
{
  private static final Logger K = Logger.getLogger(cdH.class);
  public static final int hxD = 10;
  public static final cdH hxE = new cdH();

  private final Dq[] hxF = new Dq[11];

  public void a(Dq paramDq)
  {
    this.hxF[paramDq.getId()] = paramDq;
  }

  public int uO(int paramInt) {
    if ((!bB) && (!uP(paramInt))) throw new AssertionError("Level de guilde invalide !");
    dax localdax = clr.vI(paramInt);
    if (localdax == null) {
      return 0;
    }
    return localdax.cMJ().qW();
  }

  public static boolean uP(int paramInt) {
    return (paramInt >= 0) && (paramInt <= 10);
  }

  public int uQ(int paramInt) {
    for (int i = 0; i <= 10; i++) {
      Dq localDq = this.hxF[i];
      if ((localDq != null) && (localDq.eC(paramInt))) {
        return localDq.getId();
      }
    }

    return 0;
  }

  public boolean dw(int paramInt1, int paramInt2) {
    cSi localcSi = uR(paramInt2);
    return localcSi.contains(paramInt1);
  }

  public cSi uR(int paramInt) {
    cSi localcSi = new cSi();
    for (int i = 0; i <= paramInt; i++) {
      if (this.hxF[i] != null) {
        this.hxF[i].a(localcSi);
      }
    }
    return localcSi;
  }
}