public class Rz extends bxd
{
  public static final int FAIL = 0;
  public static final int crl = 1;
  public static final int IGNORE = 2;
  public static final int crm = 3;
  public static final String crn = "fail";
  public static final String cro = "report";
  public static final String crp = "ignore";
  public static final String crq = "failall";

  public Rz()
  {
  }

  public Rz(String paramString)
  {
    setValue(paramString);
  }

  public String[] wp()
  {
    return new String[] { "fail", "report", "ignore", "failall" };
  }
}