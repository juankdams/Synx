public class aNl
{
  private static final int[] ett = { 3, 4, 167, 168, 169, 170 };

  public static int[] bN(int paramInt1, int paramInt2) {
    SB localSB1 = SB.gG(paramInt2);
    if (localSB1 != SB.cty) {
      return new int[] { paramInt2 };
    }

    if (aUP.c(ett, paramInt1)) {
      return new int[] { SB.cty.uO() };
    }

    cSi localcSi = new cSi();
    for (SB localSB2 : SB.values()) {
      if ((localSB2 != SB.cty) && (localSB2 != SB.ctz) && (localSB2 != SB.ctQ))
        localcSi.add(localSB2.uO());
    }
    return localcSi.cIf();
  }

  public static qE a(int[] paramArrayOfInt, eu parameu) {
    int i = (aUP.c(paramArrayOfInt, SB.cty.uO())) || (paramArrayOfInt.length > 1) ? 1 : 0;
    return (i != 0) && (parameu != null) ? qE.aXQ : qE.aXR;
  }
}