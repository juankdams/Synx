import java.io.Serializable;
import org.xml.sax.Locator;

public class aaA
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private final String fileName;
  private final int lineNumber;
  private final int columnNumber;
  public static final aaA cOW = new aaA();

  private static final wh aIk = wh.Fo();

  private aaA()
  {
    this(null, 0, 0);
  }

  public aaA(String paramString)
  {
    this(paramString, 0, 0);
  }

  public aaA(Locator paramLocator)
  {
    this(paramLocator.getSystemId(), paramLocator.getLineNumber(), paramLocator.getColumnNumber());
  }

  public aaA(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramString != null) && (paramString.startsWith("file:")))
      this.fileName = aIk.aV(paramString);
    else {
      this.fileName = paramString;
    }
    this.lineNumber = paramInt1;
    this.columnNumber = paramInt2;
  }

  public String getFileName()
  {
    return this.fileName;
  }

  public int getLineNumber()
  {
    return this.lineNumber;
  }

  public int getColumnNumber()
  {
    return this.columnNumber;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();

    if (this.fileName != null) {
      localStringBuffer.append(this.fileName);

      if (this.lineNumber != 0) {
        localStringBuffer.append(":");
        localStringBuffer.append(this.lineNumber);
      }

      localStringBuffer.append(": ");
    }

    return localStringBuffer.toString();
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (paramObject.getClass() != getClass()) {
      return false;
    }
    return toString().equals(paramObject.toString());
  }

  public int hashCode()
  {
    return toString().hashCode();
  }
}