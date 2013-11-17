public class bCJ extends cRs
  implements bbk
{
  private final col gxg;

  public bCJ(long paramLong, int paramInt, bPr parambPr, short paramShort, bMD parambMD)
  {
    super(paramLong, paramInt, parambPr, paramShort);
    d(this);
    this.gxg = new col(this);
  }

  public void a(bNz parambNz)
  {
    YS localYS;
    Object localObject;
    switch (bMH.aOs[parambNz.bVg().ordinal()]) {
    case 1:
    case 2:
      dLE.doY().a(this.gxg, new String[] { "bagInventory", "bagSize", "bagNameSize" });
      if (EN() != 2L) {
        localYS = (YS)parambNz;
        if ((localYS.akr() instanceof gA)) {
          localObject = (gA)localYS.akr();
          if (((gA)localObject).isActive()) {
            ac((gA)localObject);
          }

          if (((gA)localObject).nI()) {
            aCg.aOq().C((gA)localObject);
          }
        }
        aWc.blo().blF();
      }break;
    case 3:
    case 4:
      localYS = (YS)parambNz;
      dLE.doY().a(this.gxg, new String[] { "bagInventory", "bagSize", "bagNameSize" });
      localObject = localYS.akr();
      gA localgA1 = (gA)dLE.doY().br("itemDetail", "equipmentDialog");
      if ((localgA1 != null) && (localgA1.equals(localObject))) {
        dLE.doY().a("itemDetail", null, "equipmentDialog");
      }

      if (EN() != 2L) {
        if ((localYS.akr() instanceof gA)) {
          gA localgA2 = (gA)localObject;
          if (localgA2.isActive()) {
            ac(localgA2);

            if (localgA2.nI()) {
              aCg.aOq().C(localgA2);
            }
          }
        }

        aWc.blo().blE(); } break;
    case 5:
      dLE.doY().a(this.gxg, new String[] { "bagInventory" });
      if (EN() != 2L) {
        localYS = (YS)parambNz;
        if ((localYS.akr() instanceof gA)) {
          localObject = (gA)localYS.akr();
          if (((gA)localObject).isActive())
            ((gA)localObject).of();
        }
      }
      break;
    }
  }

  private static void ac(gA paramgA)
  {
    paramgA.of();
    byz localbyz = byv.bFN().bFO();
    if ((localbyz != null) && (localbyz.bGD() != null))
      localbyz.bGD().m(paramgA);
  }

  public col bLg()
  {
    return this.gxg;
  }
}