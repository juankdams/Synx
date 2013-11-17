import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;

public class djs
{
  public void a(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
  }

  public djs b(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
    throw new SAXParseException("Unexpected element \"" + paramString3 + " \"", paramdlW.getLocator());
  }

  public void a(String paramString1, String paramString2, String paramString3, dlW paramdlW)
  {
  }

  public void a(String paramString1, String paramString2, dlW paramdlW)
  {
  }

  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2, dlW paramdlW)
  {
    String str = new String(paramArrayOfChar, paramInt1, paramInt2).trim();

    if (str.length() > 0)
      throw new SAXParseException("Unexpected text \"" + str + "\"", paramdlW.getLocator());
  }

  protected void hB(String paramString)
  {
  }
}