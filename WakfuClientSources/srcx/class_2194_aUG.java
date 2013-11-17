public abstract class aUG extends aOw
{
  public static final int eVP = 18;
  public static final int eVQ = 10;
  private static final long eVR = 262143L;
  private static final long eVS = 1023L;
  private static final long eVT = 131071L;
  private static final long eVU = 511L;

  public static long B(int paramInt1, int paramInt2, short paramShort)
  {
    long l1 = paramInt1 + 131071L & 0x3FFFF;
    long l2 = paramInt2 + 131071L & 0x3FFFF;
    long l3 = paramShort + 511L & 0x3FF;

    if (Math.abs(paramInt1) <= 131072 - (paramInt1 < 0 ? 1 : 0)) if (Math.abs(paramInt2) <= 131072 - (paramInt2 < 0 ? 1 : 0)) if (Math.abs(paramShort) <= 512 - (paramShort < 0 ? 1 : 0))
        {
          return l1 << 28 | l2 << 10 | l3;
        }
    throw new aIh("Paramètres d'une position en dehors de la map - position : " + paramInt1 + ", " + paramInt2 + ", " + paramShort);
  }

  public static long y(cYk paramcYk) {
    return B(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public static cYk eF(long paramLong)
  {
    short s = (short)(int)((paramLong & 0x3FF) - 511L);

    int i = (int)((paramLong >> 10 & 0x3FFFF) - 131071L);
    int j = (int)((paramLong >> 28 & 0x3FFFF) - 131071L);
    return new cYk(j, i, s);
  }

  public static int eG(long paramLong) {
    return (int)((paramLong >> 28 & 0x3FFFF) - 131071L);
  }

  public static int eH(long paramLong) {
    return (int)((paramLong >> 10 & 0x3FFFF) - 131071L);
  }

  public static short eI(long paramLong) {
    return (short)(int)((paramLong & 0x3FF) - 511L);
  }

  public Pq aNE() {
    return Pq.chz;
  }

  public abstract boolean sc();

  public void bfq() {
  }

  public boolean pH() {
    return false;
  }
}