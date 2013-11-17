public class bSq
{
  public static String c(djv paramdjv, int paramInt)
  {
    se localse = paramdjv.bFZ();
    lZ locallZ = new lZ();
    Object localObject;
    if (localse.cH(paramInt)) {
      localObject = localse.cE(paramInt);
      locallZ.a(bU.fH().getString("dungeon.unlockDate")).a(bU.fH().c(((awq)localObject).tw()));
    } else if (localse.cG(paramInt)) {
      localObject = localse.cI(paramInt);
      locallZ.a(bU.fH().getString("dungeon.lockedUntil")).a(bU.fH().c((dxL)localObject));
    } else if (localse.cJ(paramInt) != 0) {
      localObject = localse.cE(paramInt);
      int i = ((awq)localObject).tt() - localse.cJ(paramInt);
      dxL localdxL = localse.cI(paramInt);
      String str = bU.fH().c(localdxL);
      locallZ.a(bU.fH().getString("dungeon.remainingTriesBefore", new Object[] { Integer.valueOf(i), str }));
    }
    return locallZ.tP();
  }
}