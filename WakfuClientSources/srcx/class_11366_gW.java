import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

public class gW extends DefaultHandler
{
  private Stack aGc = new Stack();
  private djs aGd = null;
  private dlW aGe;

  public gW(dlW paramdlW, djs paramdjs)
  {
    this.aGd = paramdjs;
    this.aGc.push(this.aGd);
    this.aGe = paramdlW;
  }

  public djs pg()
  {
    return this.aGd;
  }

  public InputSource resolveEntity(String paramString1, String paramString2)
  {
    this.aGe.Ga().d("resolving systemId: " + paramString2, 3);

    if (paramString2.startsWith("file:")) {
      String str = dEL.dgv().aV(paramString2);

      File localFile = new File(str);
      if (!localFile.isAbsolute()) {
        localFile = dEL.dgv().e(this.aGe.cTH(), str);
        this.aGe.Ga().d("Warning: '" + paramString2 + "' in " + this.aGe.cTG() + " should be expressed simply as '" + str.replace('\\', '/') + "' for compliance with other XML tools", 1);
      }

      this.aGe.Ga().d("file=" + localFile, 4);
      try {
        InputSource localInputSource = new InputSource(new FileInputStream(localFile));
        localInputSource.setSystemId(dEL.dgv().aU(localFile.getAbsolutePath()));
        return localInputSource;
      } catch (FileNotFoundException localFileNotFoundException) {
        this.aGe.Ga().d(localFile.getAbsolutePath() + " could not be found", 1);
      }

    }

    this.aGe.Ga().d("could not resolve systemId", 4);
    return null;
  }

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    djs localdjs = this.aGd.b(paramString1, paramString2, paramString3, paramAttributes, this.aGe);
    this.aGc.push(this.aGd);
    this.aGd = localdjs;
    this.aGd.a(paramString1, paramString2, paramString3, paramAttributes, this.aGe);
  }

  public void setDocumentLocator(Locator paramLocator)
  {
    this.aGe.setLocator(paramLocator);
  }

  public void endElement(String paramString1, String paramString2, String paramString3)
  {
    this.aGd.a(paramString1, paramString2, this.aGe);
    djs localdjs = (djs)this.aGc.pop();
    this.aGd = localdjs;
    if (this.aGd != null)
      this.aGd.a(paramString1, paramString2, paramString3, this.aGe);
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.aGd.a(paramArrayOfChar, paramInt1, paramInt2, this.aGe);
  }

  public void startPrefixMapping(String paramString1, String paramString2)
  {
    this.aGe.startPrefixMapping(paramString1, paramString2);
  }

  public void endPrefixMapping(String paramString)
  {
    this.aGe.endPrefixMapping(paramString);
  }
}