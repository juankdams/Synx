import java.util.Arrays;

public class aer extends bxd
{
  private static final String[] aUE = { "equal", "greater", "less", "ne", "ge", "le", "eq", "gt", "lt", "more" };

  public static final aer cVs = new aer("equal");

  public static final aer cVt = new aer("ne");

  public static final aer cVu = new aer("greater");

  public static final aer cVv = new aer("less");

  public static final aer cVw = new aer("ge");

  public static final aer cVx = new aer("le");

  private static final int[] cVy = { 0, 4, 5, 6 };
  private static final int[] cVz = { 2, 3, 5, 8 };
  private static final int[] cVA = { 1, 3, 4, 7, 9 };

  public aer()
  {
  }

  public aer(String paramString)
  {
    setValue(paramString);
  }

  public String[] wp()
  {
    return aUE;
  }

  public boolean hN(int paramInt)
  {
    if (getIndex() == -1) {
      throw new cJ("Comparison value not set.");
    }
    int[] arrayOfInt = paramInt > 0 ? cVA : paramInt < 0 ? cVz : cVy;

    return Arrays.binarySearch(arrayOfInt, getIndex()) >= 0;
  }
}