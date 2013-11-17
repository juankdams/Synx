public class cA
{
  private final cSR RF = new cSR();

  public static final cA RG = new cA();

  public caI Z(int paramInt) {
    caI localcaI = (caI)this.RF.get(paramInt);
    if (localcaI == null) {
      localcaI = aa(paramInt);
      if (localcaI != null) {
        this.RF.put(paramInt, localcaI);
      }
    }
    return localcaI;
  }

  private caI aa(int paramInt) {
    aRg localaRg = (aRg)dfM.lac.kD(paramInt);
    if ((localaRg instanceof cUN)) {
      return new vW((cUN)localaRg);
    }
    if ((localaRg instanceof akh)) {
      return new bHC((akh)localaRg);
    }
    if ((localaRg instanceof cZE)) {
      return new cpP((cZE)localaRg);
    }
    if ((localaRg instanceof dUN)) {
      return new oz((dUN)localaRg);
    }
    return null;
  }
}