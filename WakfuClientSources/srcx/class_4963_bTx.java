public class bTx
{
  public static void f(Runnable paramRunnable)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz != null) {
      arl localarl = localbyz.bGv();
      if (localarl != null) {
        bnc.bxw().a(localarl, new bfv(paramRunnable));
        bnc.bxw().d(localarl);
        return;
      }
    }

    paramRunnable.run();
  }
}