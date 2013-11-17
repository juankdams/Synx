public final class bUd extends aVg
{
  private static final bUd hfV = new bUd();

  public static bUd cak()
  {
    return hfV;
  }

  protected agQ a(dUV paramdUV)
  {
    switch (czZ.ipY[paramdUV.ordinal()]) {
    case 1:
      return new aOb(paramdUV.xj());
    case 2:
      return new aKA(paramdUV.xj());
    case 3:
      return new cnc(paramdUV.xj());
    case 4:
      return new dTJ(paramdUV.xj());
    case 5:
      return new cxB(paramdUV.xj());
    case 6:
      return new blu(paramdUV.xj());
    case 7:
      return new bIm(paramdUV.xj());
    }
    return null;
  }
}