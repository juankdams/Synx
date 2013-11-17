public class dou
{
  private String m_name = "";

  public dou(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Nom de paramètre ne peut être null.");
    }

    this.m_name = paramString;
  }

  public final String getName()
  {
    return this.m_name;
  }
}