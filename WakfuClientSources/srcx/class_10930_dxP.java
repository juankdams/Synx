public class dxP
  implements cvW
{
  private static dxP lEI = new dxP();

  public static dxP dcE()
  {
    return lEI;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    jy localjy;
    switch (paramcWG.getId())
    {
    case 16808:
      localObject = (NG)paramcWG;

      localjy = new jy();
      localjy.setExchangeId(((NG)localObject).ZR());
      localjy.s((byte)0);
      byv.bFN().aJK().d(localjy);
      return false;
    case 16809:
      localObject = (cbZ)paramcWG;

      localjy = new jy();
      localjy.setExchangeId(((cbZ)localObject).ZR());
      localjy.s((byte)1);
      byv.bFN().aJK().d(localjy);

      return false;
    }

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }
}