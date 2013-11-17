public class bMS
{
  public ly a(ckT paramckT, byte paramByte)
  {
    byz localbyz = byv.bFN().bFO();
    dTw localdTw = paramckT.aEt();
    switch (bUr.hgp[localdTw.ordinal()])
    {
    case 1:
      return new dnh(paramckT, localbyz, paramByte);
    case 2:
      return new aZc(1039);
    case 3:
      return new dLA(paramckT, localbyz, paramByte);
    case 4:
      return new wt(paramckT, localbyz, paramByte);
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
      return new cTC(paramckT, localbyz, paramByte);
    }
    throw new IllegalArgumentException(String.format("fightModel %s non géré.", new Object[] { localdTw }));
  }
}