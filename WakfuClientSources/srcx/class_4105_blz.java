import java.util.zip.ZipException;

public class blz extends ZipException
{
  private static final long serialVersionUID = 20110809L;
  static final String fCD = "archive's size exceeds the limit of 4GByte.";
  static final String fCE = "archive contains more than 65535 entries.";

  static String a(dPL paramdPL)
  {
    return paramdPL.getName() + "'s size exceeds the limit of 4GByte.";
  }

  public blz(String paramString)
  {
    super(paramString);
  }
}