import java.util.HashMap;

public enum TD
{
  public static final TD cwB;
  private static final HashMap cwC;
  private final String m_name;

  private TD(String arg3)
  {
    Object localObject;
    this.m_name = localObject;
  }

  public String getName() {
    return this.m_name;
  }

  public static TD dE(String paramString) {
    return (TD)cwC.get(paramString.toLowerCase());
  }

  static
  {
    cwB = cwy;

    cwC = new HashMap();

    for (TD localTD : values())
      cwC.put(localTD.getName().toLowerCase(), localTD);
  }
}