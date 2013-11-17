import org.apache.log4j.Logger;

public class akl
{
  private static final Logger K = Logger.getLogger(akl.class);
  private final int dkV;
  private final int dkW;
  private final short dkX;

  public akl(int paramInt1, int paramInt2, short paramShort)
  {
    this.dkV = paramInt1;
    this.dkW = paramInt2;
    this.dkX = paramShort;
  }

  public short a(int paramInt1, int paramInt2, int paramInt3, bGO parambGO)
  {
    if ((!bB) && ((paramInt1 < 0) || (paramInt1 >= this.dkV))) throw new AssertionError();
    if ((!bB) && ((paramInt2 < 0) || (paramInt2 >= this.dkW))) throw new AssertionError();
    if (parambGO == null)
      return this.dkX;
    int i = parambGO.getValueCount();
    if (i == 1) {
      return parambGO.sP(0);
    }

    int j = paramInt1 + paramInt2 * this.dkV;
    return parambGO.sQ(j);
  }

  public bGO e(short[] paramArrayOfShort)
  {
    if ((!bB) && (paramArrayOfShort.length != this.dkV * this.dkW)) throw new AssertionError();

    bHu localbHu = new bHu();
    for (int i = 0; i < paramArrayOfShort.length; i++) {
      if (!localbHu.contains(paramArrayOfShort[i])) {
        localbHu.add(paramArrayOfShort[i]);
      }
    }
    i = localbHu.size();
    if (i == 0) {
      throw new cbF("pas de cellsValue");
    }
    if (i > 16) {
      throw new cbF("Trop de valeur différentes");
    }

    return bGO.a(localbHu, paramArrayOfShort, this.dkX);
  }

  public short axy()
  {
    return this.dkX;
  }
}