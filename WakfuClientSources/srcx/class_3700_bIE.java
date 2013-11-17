public class bIE
{
  public static long gHR = 0L;
  public static final int gHS = 60000;

  public static void bPR()
  {
    long l = System.currentTimeMillis();

    if (gHR + 60000L < l)
    {
      byz localbyz = byv.bFN().bFO();
      int i = (localbyz != null) && (localbyz.bHa() == localbyz.bHb()) ? 1 : 0;

      ayn localayn = i != 0 ? bWW.ccf().cch() : bWW.ccf().FB();

      if (localayn != null) {
        GI localGI = new GI();
        localGI.aM(localayn.getId());
        byv.bFN().aJK().d(localGI);
        gHR = l;
      }
    }
  }
}