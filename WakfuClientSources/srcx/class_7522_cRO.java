public class cRO
{
  public static void x(dOc paramdOc)
  {
    bNa localbNa1 = new bNa(clP.hPd.get());

    bNa localbNa2 = new bNa(bNa.gRx.get());

    Jg localJg = paramdOc.getAppearance();
    gm localgm = new gm(localbNa1, localbNa2, localJg, 0, 500, -1, ddp.kWG);

    localJg.a(localgm);

    xv localxv = new xv(localJg, paramdOc);

    paramdOc.a(CH.bGw, localxv, false);
  }
}