public class aUi
{
  public static final aUi eUP = new aUi();

  private final cSR eUQ = new cSR();
  private final aoL eUR = new aoL();
  private final cSR eUS = new cSR();

  public Ym a(int paramInt, Aa paramAa) {
    Ym localYm1 = (Ym)this.eUS.get(paramInt);
    if (localYm1 != null) {
      return localYm1;
    }
    Ym localYm2 = new Ym(paramAa);
    this.eUS.put(localYm2.getId(), localYm2);
    return localYm2;
  }

  public ceQ nW(int paramInt) {
    Object localObject = (ceQ)this.eUQ.get(paramInt);
    if (localObject != null) {
      return localObject;
    }

    localObject = new bbS(paramInt);
    this.eUQ.put(paramInt, localObject);

    return localObject;
  }

  public cvt ca(int paramInt1, int paramInt2) {
    long l = bCO.cM(paramInt1, paramInt2);
    cvt localcvt = (cvt)this.eUR.get(l);
    if (localcvt != null) {
      return localcvt;
    }

    localcvt = new cvt(paramInt1, paramInt2);
    this.eUR.put(l, localcvt);

    return localcvt;
  }

  public void nX(int paramInt) {
    this.eUQ.remove(paramInt);
  }

  public void nY(int paramInt) {
    this.eUR.remove(paramInt);
  }
}