import java.util.BitSet;

public final class cFy
{
  private static final BitSet iAa = new BitSet();

  public static boolean f(BitSet paramBitSet)
  {
    return iAa.intersects(paramBitSet);
  }

  static
  {
    iAa.set(1028);
    iAa.set(1003);
    iAa.set(1001);
    iAa.set(1002);
  }
}