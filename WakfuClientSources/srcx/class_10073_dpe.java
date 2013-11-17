import org.apache.log4j.Logger;

public final class dpe
{
  protected static final Logger K = Logger.getLogger(dpe.class);

  public static int AX(int paramInt)
  {
    if (paramInt <= 0) {
      K.error("DiceRoll.roll appelé avec une valeur de dé de " + paramInt + "\n" + bBd.g(new RuntimeException("StackTrace de DiceRoll")));
      return 1;
    }
    return yb.Ha().nextInt(paramInt) + 1;
  }

  public static long jP(long paramLong) {
    if (paramLong <= 0L) {
      K.error("DiceRoll.roll appelé avec une valeur de dé de " + paramLong + "\n" + bBd.g(new RuntimeException("StackTrace de DiceRoll")));
      return 1L;
    }
    return yb.Ha().aU(paramLong) + 1L;
  }

  public static int ae(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 <= 0) {
      K.error("DiceRoll.roll appelé avec une valeur de dé de " + paramInt2 + "\n" + bBd.g(new RuntimeException("StackTrace de DiceRoll")));
      return 1;
    }

    int i = paramInt3 + paramInt1;
    if ((paramInt2 > 0) && (paramInt1 > 0)) {
      for (int j = paramInt1; j > 0; j--) {
        i += yb.Ha().nextInt(paramInt2);
      }
    }
    return i;
  }

  public static int eL(int paramInt1, int paramInt2)
  {
    if ((!bB) && (paramInt1 <= 0)) throw new AssertionError();
    if ((!bB) && (paramInt2 < paramInt1)) throw new AssertionError();

    int i = paramInt1;
    if ((paramInt1 > 0) && (paramInt2 > 0) && (paramInt2 - paramInt1 > 0)) {
      i = paramInt1 + yb.Ha().nextInt(paramInt2 - paramInt1 + 1);
    }
    return i;
  }
}