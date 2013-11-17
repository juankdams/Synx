import org.apache.log4j.Logger;

public class cTI
{
  public static final short kGf = -32768;
  protected static final Logger K = Logger.getLogger(cTI.class);

  public static short a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, short paramShort, int paramInt3)
  {
    if (paramInt3 <= 0)
      K.error("no moverHeight defined");
    if (paramInt2 <= 0)
      K.error("can't get highest height : no data for this element");
    if (paramInt1 + paramInt2 > paramArrayOfbep.length) {
      K.error("cell elements index and count are out of bounds");
    }

    if (paramInt2 == 1) {
      bep localbep1 = paramArrayOfbep[paramInt1];
      if (localbep1.gPY) {
        K.error("data invalid : we can move through, but this element is the only one");
        return -32768;
      }
      if (localbep1.flI == -1)
      {
        return -32768;
      }
      if (localbep1.aOl > paramShort)
      {
        return -32768;
      }
      return localbep1.aOl;
    }

    int i = 32767;

    for (int j = paramInt1 + paramInt2 - 1; j >= paramInt1; j--) {
      bep localbep2 = paramArrayOfbep[j];

      if (!localbep2.gPY)
      {
        if (localbep2.flI == -1) {
          i = (short)(localbep2.aOl - localbep2.io);
        }
        else if (localbep2.aOl > paramShort) {
          i = (short)(localbep2.aOl - localbep2.io);
        }
        else if (paramInt3 > i - localbep2.aOl) {
          i = (short)(localbep2.aOl - localbep2.io);
        }
        else
        {
          return localbep2.aOl;
        }
      }
    }

    return -32768;
  }

  public static boolean a(int paramInt1, int paramInt2, int paramInt3, bep[] paramArrayOfbep, int paramInt4)
  {
    if ((!bB) && (paramInt4 <= 0)) throw new AssertionError("no moverHeight defined");
    if ((!bB) && (paramArrayOfbep == null)) throw new AssertionError("cellData can't be null");

    if ((!bB) && ((paramInt2 < 0) || (paramInt3 <= 0) || (paramInt2 + paramInt3 > paramArrayOfbep.length))) throw new AssertionError("invalid bounds : [" + paramInt2 + ", " + (paramInt2 + paramInt3) + "]");
    if ((!bB) && ((paramInt1 < paramInt2) || (paramInt1 >= paramInt2 + paramInt3))) throw new AssertionError("moverZIndex not within the given bounds");

    if ((paramArrayOfbep[paramInt1].flI == -1) || (paramArrayOfbep[paramInt1].gPY)) {
      return false;
    }

    if ((paramInt1 == paramInt2 + paramInt3 - 1) && (!paramArrayOfbep[paramInt1].gPY)) {
      return true;
    }

    int i = paramArrayOfbep[paramInt1].aOl + paramInt4;

    for (int j = paramInt1 + 1; j < paramInt2 + paramInt3; j++) {
      bep localbep = paramArrayOfbep[j];
      int k = localbep.aOl - localbep.io;

      if (k >= i) {
        return true;
      }
      if (!localbep.gPY) {
        return false;
      }
    }

    return true;
  }

  public static short a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, short paramShort)
  {
    if ((!bB) && (paramInt2 <= 0)) throw new AssertionError("can't get index from z : no data for this element");
    if ((!bB) && (paramArrayOfbep == null)) throw new AssertionError("can't get index from z : no data array provided");
    if ((!bB) && (paramInt1 + paramInt2 > paramArrayOfbep.length)) throw new AssertionError("cell elements index and count are out of bounds");

    for (int i = paramInt1 + paramInt2 - 1; i >= paramInt1; i--) {
      if (paramArrayOfbep[i].aOl == paramShort)
        return (short)(i - paramInt1);
    }
    return -32768;
  }
}