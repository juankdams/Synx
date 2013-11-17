public class cRC extends bxd
{
  private static final String[] aUE = { "fail", "warn", "ignore" };

  public static final cRC kDP = new cRC("fail");

  public static final cRC kDQ = new cRC("warn");

  public static final cRC kDR = new cRC("ignore");
  private static final int kDS = 0;
  private static final int kDT = 1;
  private static final int kDU = 2;

  public cRC()
  {
  }

  public cRC(String paramString)
  {
    setValue(paramString);
  }

  public String[] wp()
  {
    return aUE;
  }
}