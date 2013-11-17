public class cee extends ciW
{
  private static final String hyr = "accountPreferences%d.properties";

  public cee(long paramLong)
  {
    super(String.format("accountPreferences%d.properties", new Object[] { Long.valueOf(paramLong) }));
    hc(false);
    hb(true);
  }
}