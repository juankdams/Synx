import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;

public class bBp extends djs
{
  public djs b(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
    if ((paramString2.equals("project")) && ((paramString1.equals("")) || (paramString1.equals("antlib:org.apache.tools.ant"))))
    {
      return dEL.dgw();
    }
    if (paramString2.equals(paramString3)) {
      throw new SAXParseException("Unexpected element \"{" + paramString1 + "}" + paramString2 + "\" {" + "antlib:org.apache.tools.ant" + "}" + paramString2, paramdlW.getLocator());
    }

    throw new SAXParseException("Unexpected element \"" + paramString3 + "\" " + paramString2, paramdlW.getLocator());
  }
}