import java.text.MessageFormat;
import java.util.HashMap;

public class cFR extends bxd
{
  private static HashMap iAR = new HashMap();
  private static final String iAS = "CHECKSUM";
  private static final String iAT = "MD5SUM";
  private static final String iAU = "SVF";

  public static cFR cBi()
  {
    cFR localcFR = new cFR();
    localcFR.setValue("CHECKSUM");
    return localcFR;
  }

  public MessageFormat cBj()
  {
    return (MessageFormat)iAR.get(getValue());
  }

  public String[] wp()
  {
    return new String[] { "CHECKSUM", "MD5SUM", "SVF" };
  }

  static
  {
    iAR.put("CHECKSUM", new MessageFormat("{0}"));
    iAR.put("MD5SUM", new MessageFormat("{0} *{1}"));
    iAR.put("SVF", new MessageFormat("MD5 ({1}) = {0}"));
  }
}