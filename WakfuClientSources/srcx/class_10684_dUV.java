public enum dUV
  implements Si
{
  private final int aWH;
  private final sF mtN;
  private static final cBb mtO = new cBb(null);

  public static void test()
  {
    dUV[] arrayOfdUV = values();
    for (int i = 0; i < arrayOfdUV.length - 1; i++)
      for (int j = i + 1; j < arrayOfdUV.length; j++)
        if (arrayOfdUV[i].xj() == arrayOfdUV[j].xj())
          throw new Exception(arrayOfdUV[i].name() + " et " + arrayOfdUV[j].name() + "ont le même id");
  }

  private dUV(int arg3, sF arg4)
  {
    int i;
    this.aWH = i;
    Object localObject;
    this.mtN = localObject;
  }

  public final int xj() {
    return this.aWH;
  }

  public final sF adi() {
    return this.mtN;
  }

  public static String Ei(int paramInt) {
    return mtO.xk(paramInt);
  }

  public static agQ a(dUV paramdUV)
  {
    return mtO.a(paramdUV);
  }

  public static cBb dvj() {
    return mtO;
  }
}