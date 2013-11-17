import org.apache.log4j.Logger;

public class bjz
{
  private static final Logger K = Logger.getLogger(bjz.class);

  public static VI a(int paramInt1, byte paramByte, bZA parambZA, boolean paramBoolean1, aCH paramaCH, int paramInt2, long paramLong, boolean paramBoolean2, boolean paramBoolean3)
  {
    rn localrn = rn.cy(paramByte);
    if (localrn == null) {
      K.error("Impossible de trouver l'action de monstre " + paramByte);
      return null;
    }
    switch (aiF.dfu[localrn.ordinal()]) {
    case 1:
      return new iF(paramInt1, paramByte, parambZA, paramBoolean1, paramaCH, paramInt2, paramLong, paramBoolean2, paramBoolean3);
    case 2:
      return new dBB(paramInt1, paramByte, parambZA, paramBoolean1, paramaCH, paramInt2, paramLong, paramBoolean2, paramBoolean3);
    case 3:
      return new dPj(paramInt1, paramByte, parambZA, paramBoolean1, paramaCH, paramInt2, paramLong, paramBoolean2, paramBoolean3);
    case 4:
      return new cIN(paramInt1, paramByte, parambZA, paramBoolean1, paramaCH, paramInt2, paramLong, paramBoolean2, paramBoolean3);
    case 5:
      return new aGm(paramInt1, paramByte, parambZA, paramBoolean1, paramaCH, paramInt2, paramLong, paramBoolean2, paramBoolean3);
    }
    return null;
  }
}