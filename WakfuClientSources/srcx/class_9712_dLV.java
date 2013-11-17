import org.apache.log4j.Logger;

class dLV
{
  private static final Logger K = Logger.getLogger(dLV.class);

  private static final bep[] beo = bep.brZ();
  private static final String mcd = "debug_walkable";
  private static final String mce = "debug_non_walkable";
  private static final String mcf = "debug_mobosteryl";
  private static boolean mcg;

  public static void iP(boolean paramBoolean)
  {
    mcg = paramBoolean;
    try {
      if (mcg) {
        ciL localciL1 = dbL.cNv().oL("debug_walkable");
        localciL1.g(new float[] { 0.1F, 0.7F, 0.1F, 0.8F });

        ciL localciL2 = dbL.cNv().oL("debug_non_walkable");
        localciL2.g(new float[] { 0.7F, 0.1F, 0.1F, 0.8F });

        ciL localciL3 = dbL.cNv().oL("debug_mobosteryl");
        localciL3.g(new float[] { 0.6F, 0.7F, 0.1F, 0.8F });
      } else {
        dbL.cNv().oM("debug_walkable");
        dbL.cNv().oM("debug_non_walkable");
        dbL.cNv().oM("debug_mobosteryl");
      }
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  public static boolean cLf() {
    return mcg;
  }

  private static void fk(int paramInt1, int paramInt2) {
    if ((!bB) && (!mcg)) throw new AssertionError();

    int i = paramInt1;
    int j = paramInt2;

    int k = 18;

    dbL.cNv().oO("debug_walkable");
    dbL.cNv().oO("debug_non_walkable");
    dbL.cNv().oO("debug_mobosteryl");

    for (int m = i - 18; m < i + 18; m++)
      for (int n = j - 18; n < j + 18; n++) {
        tF localtF = cwO.dV(m, n);
        if (localtF != null)
        {
          int i1 = localtF.BV().a(m, n, beo, 0);
          for (int i2 = 0; i2 < i1; i2++)
            if (beo[i2].aOl != -32768)
            {
              long l = dbL.ac(m, n, beo[i2].aOl);
              if (beo[i2].gPY) {
                dbL.cNv().h(l, "debug_non_walkable");
              }
              else {
                boolean bool = localtF.i(m, n, beo[i2].aOl);

                if ((bool) || (beo[i2].flI == -1)) {
                  dbL.cNv().h(l, "debug_non_walkable");
                }
                else if (beo[i2].bsf())
                  dbL.cNv().h(l, "debug_mobosteryl");
                else
                  dbL.cNv().h(l, "debug_walkable");
              }
            }
        }
      }
  }
}