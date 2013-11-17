public class cAL
{
  public static final String PACKAGE = "wakfu.gemItems";

  public static void drop(Qa paramQa, bfk parambfk)
  {
    gA localgA = (gA)paramQa.sq();
    bRA localbRA = new bRA();
    localbRA.ae(localgA);
    localbRA.a(parambfk.bsG());
    localbRA.a(parambfk.VH());
    cjO.clE().j(localbRA);

    byA.onDropItem();
  }
}