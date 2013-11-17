public class cVA extends ciW
{
  private static final String hyr = "characterPreferences-%s.properties";

  public cVA(String paramString)
  {
    super(String.format("characterPreferences-%s.properties", new Object[] { paramString }));
    hc(false);
    hb(true);
  }
}