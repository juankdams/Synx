public class bNl
{
  private static final SB[] gSa = { SB.ctH, SB.ctI, SB.ctF, SB.ctA, SB.ctK, SB.ctG, SB.ctD, SB.ctL, SB.ctE, SB.ctB, SB.ctJ, SB.ctC, SB.ctM, SB.ctN, SB.ctP, SB.ctQ };

  public static SB[] bVa()
  {
    return gSa;
  }

  public static boolean e(SB paramSB) {
    if (paramSB == null) {
      return false;
    }

    return tC(paramSB.uO());
  }

  public static boolean tC(int paramInt) {
    for (int i = 0; i < gSa.length; i++) {
      if (gSa[i].uO() == paramInt) {
        return gSa[i].isInitialized();
      }
    }

    return false;
  }
}