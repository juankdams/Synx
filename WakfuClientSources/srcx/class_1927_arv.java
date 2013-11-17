public class arv
{
  private static final double[] dzV = { 0.3D, 0.35D, 0.05D, 0.1D, 0.2D };
  public static final int dzW = 2;
  public static final arv dzX = new arv();

  public static final arv dzY = new dyi();

  public void a(bTI parambTI, azp paramazp, Iterable paramIterable)
  {
    if (parambTI == null) {
      return;
    }
    eu localeu = parambTI.bZR();
    if (localeu == null) {
      return;
    }
    int i = a(parambTI, paramIterable);

    a(paramazp, localeu, i);
  }

  private void a(azp paramazp, eu parameu, int paramInt) {
    Rx localRx = (Rx)paramazp.a(parameu);
    if (localRx == null) {
      return;
    }
    localRx.set(paramInt);
  }

  private int a(bTI parambTI, Iterable paramIterable) {
    bHu localbHu = new bHu();
    int i = parambTI.bJ();

    for (bfE localbfE : paramIterable) {
      if ((localbfE.bsL().bHU() == i) && 
        (localbfE.nU() > 0))
        localbHu.add(localbfE.nU());
    }
    return a(localbHu, parambTI.bZR());
  }

  public int a(bHu parambHu, eu parameu) {
    if (parameu == null) {
      return 0;
    }

    parambHu.sort();
    parambHu.reverse();

    double d = 0.0D;
    for (int i = 0; (i < parambHu.size()) && (i < dzV.length); i++) {
      d += parambHu.get(i) * dzV[i];
    }
    if (parameu == eu.aAp) {
      d /= 2.0D;
    }
    return (int)Math.round(d);
  }
}