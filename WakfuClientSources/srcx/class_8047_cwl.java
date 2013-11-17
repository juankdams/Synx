public enum cwl
{
  private static cwl ihM;
  private final String m_name;

  private cwl(String arg3)
  {
    Object localObject;
    this.m_name = localObject;
  }

  public static cwl ctO()
  {
    return ihM;
  }

  public static boolean ctP() {
    return ihM == ihJ;
  }

  public static boolean bPY() {
    return ihM == ihI;
  }

  public String getName() {
    return this.m_name;
  }

  static
  {
    String str = System.getProperty("os.name").toLowerCase();
    for (cwl localcwl : values()) {
      if (str.startsWith(localcwl.getName())) {
        ihM = localcwl;
      }
    }
    if (ihM == null)
      ihM = ihH;
  }
}