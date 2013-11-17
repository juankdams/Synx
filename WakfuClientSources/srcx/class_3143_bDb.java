import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class bDb extends bFe
{
  private static final int gxZ = bFe.aj("StringResource".getBytes());
  private static final String DEFAULT_ENCODING = "UTF-8";
  private String encoding = "UTF-8";

  public bDb()
  {
  }

  public bDb(String paramString)
  {
    this(null, paramString);
  }

  public bDb(FF paramFF, String paramString)
  {
    b(paramFF);
    setValue(paramFF == null ? paramString : paramFF.bH(paramString));
  }

  public synchronized void setName(String paramString)
  {
    if (getName() != null) {
      throw new cJ(new dEJ());
    }
    super.setName(paramString);
  }

  public synchronized void setValue(String paramString)
  {
    setName(paramString);
  }

  public synchronized String getName()
  {
    return super.getName();
  }

  public synchronized String getValue()
  {
    return getName();
  }

  public boolean TY()
  {
    return getValue() != null;
  }

  public void addText(String paramString)
  {
    cuv();
    setValue(Ga().bH(paramString));
  }

  public synchronized void setEncoding(String paramString)
  {
    cuu();
    this.encoding = paramString;
  }

  public synchronized String getEncoding()
  {
    return this.encoding;
  }

  public synchronized long getSize()
  {
    return cum() ? ((bFe)cup()).getSize() : getContent().length();
  }

  public synchronized int hashCode()
  {
    if (cum()) {
      return cup().hashCode();
    }
    return super.hashCode() * gxZ;
  }

  public String toString()
  {
    return String.valueOf(getContent());
  }

  public synchronized InputStream getInputStream()
  {
    if (cum()) {
      return ((bFe)cup()).getInputStream();
    }
    String str = getContent();
    if (str == null) {
      throw new IllegalStateException("unset string value");
    }
    return new ByteArrayInputStream(this.encoding == null ? str.getBytes() : str.getBytes(this.encoding));
  }

  public synchronized OutputStream getOutputStream()
  {
    if (cum()) {
      return ((bFe)cup()).getOutputStream();
    }
    if (getValue() != null) {
      throw new dEJ();
    }
    return new HU(this);
  }

  public void a(cxK paramcxK)
  {
    if (this.encoding != "UTF-8") {
      throw cuq();
    }
    super.a(paramcxK);
  }

  protected synchronized String getContent()
  {
    return getValue();
  }

  private void jH(String paramString)
  {
    String str;
    if (Ga() != null)
      str = Ga().bH(paramString);
    else {
      str = paramString;
    }
    setValue(str);
  }
}