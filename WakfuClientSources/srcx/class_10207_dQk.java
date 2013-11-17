import org.apache.log4j.Logger;

public abstract class dQk extends cGj
{
  private static final Logger K = Logger.getLogger(dQk.class);
  public static final String bDL = "item";
  public static final String bsS = "quantity";
  public static final String dwF = "xp";
  public static final String gSj = "kama";
  public static final String mkx = "xpIconUrl";
  public static final String iLj = "rankDescription";
  public static final String[] bF = { "item", "quantity", "xpIconUrl", "xp", "kama", "rankDescription" };

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("item")) {
      return ajR();
    }
    if (paramString.equals("quantity")) {
      return Integer.valueOf(ajS());
    }
    if (paramString.equals("xp")) {
      return Integer.valueOf(IT());
    }
    if (paramString.equals("kama")) {
      return Integer.valueOf(IQ());
    }
    if (paramString.equals("xpIconUrl")) {
      return ajT();
    }
    if (paramString.equals("rankDescription")) {
      return ajU();
    }
    return null;
  }

  protected abstract bBn ajR();

  protected abstract int ajS();

  protected abstract int IT();

  protected abstract int IQ();

  protected abstract String ajT();

  protected abstract String ajU();
}