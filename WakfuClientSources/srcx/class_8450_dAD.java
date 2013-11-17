import org.apache.log4j.Logger;

public abstract class dAD
  implements dBv
{
  public static final String aIE = "type";
  public static final String[] bF = { "type" };
  protected Logger K;

  public dAD()
  {
    this.K = Logger.getLogger(dAD.class);
  }

  public abstract cHJ sh();

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("type")) {
      return Integer.valueOf(sh().ordinal());
    }

    return null;
  }

  public void update()
  {
    dLE.doY().a(this, getFields());
  }
}