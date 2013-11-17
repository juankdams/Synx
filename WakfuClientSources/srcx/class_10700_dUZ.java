import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.xml.sax.AttributeList;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;

class dUZ extends HandlerBase
{
  si iGV;

  public dUZ(si paramsi)
  {
    this.iGV = paramsi;
  }

  public InputSource resolveEntity(String paramString1, String paramString2)
  {
    si.c(this.iGV).d("resolving systemId: " + paramString2, 3);

    if (paramString2.startsWith("file:")) {
      String str = si.yH().aV(paramString2);

      File localFile = new File(str);
      if (!localFile.isAbsolute()) {
        localFile = si.yH().e(si.d(this.iGV), str);
        si.c(this.iGV).d("Warning: '" + paramString2 + "' in " + si.e(this.iGV) + " should be expressed simply as '" + str.replace('\\', '/') + "' for compliance with other XML tools", 1);
      }

      try
      {
        InputSource localInputSource = new InputSource(new FileInputStream(localFile));
        localInputSource.setSystemId(si.yH().aU(localFile.getAbsolutePath()));
        return localInputSource;
      } catch (FileNotFoundException localFileNotFoundException) {
        si.c(this.iGV).d(localFile.getAbsolutePath() + " could not be found", 1);
      }

    }

    return null;
  }

  public void startElement(String paramString, AttributeList paramAttributeList)
  {
    if (paramString.equals("project"))
      new zN(this.iGV, this).a(paramString, paramAttributeList);
    else
      throw new SAXParseException("Config file is not of expected XML type", si.b(this.iGV));
  }

  public void setDocumentLocator(Locator paramLocator)
  {
    si.a(this.iGV, paramLocator);
  }
}