import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class duo extends bik
{
  public int dwLowDateTime;
  public int dwHighDateTime;
  private static final long lyi = 11644473600000L;

  protected List aR()
  {
    return Arrays.asList(new String[] { "dwLowDateTime", "dwHighDateTime" });
  }

  public duo(Date paramDate)
  {
    long l = i(paramDate);
    this.dwHighDateTime = ((int)(l >> 32 & 0xFFFFFFFF));
    this.dwLowDateTime = ((int)(l & 0xFFFFFFFF));
  }

  public duo() {
  }

  public duo(axA paramaxA) {
    super(paramaxA);
    hb();
  }

  public static Date eW(int paramInt1, int paramInt2)
  {
    long l1 = paramInt1 << 32 | paramInt2 & 0xFFFFFFFF;
    long l2 = l1 / 10000L;
    long l3 = l2 - 11644473600000L;
    return new Date(l3);
  }

  public static long i(Date paramDate)
  {
    long l1 = paramDate.getTime();
    long l2 = l1 + 11644473600000L;
    return l2 * 1000L * 10L;
  }

  public Date toDate() {
    return eW(this.dwHighDateTime, this.dwLowDateTime);
  }

  public long rP() {
    return toDate().getTime();
  }

  public String toString() {
    return super.toString() + ": " + toDate().toString();
  }
}