import java.io.File;
import java.util.Enumeration;

public class czH extends MS
{
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (lT()) {
      localStringBuilder.append("{orselect: ");
      localStringBuilder.append(super.toString());
      localStringBuilder.append("}");
    }
    return localStringBuilder.toString();
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();
    Enumeration localEnumeration = lV();

    while (localEnumeration.hasMoreElements()) {
      if (((ank)localEnumeration.nextElement()).a(paramFile1, paramString, paramFile2)) {
        return true;
      }
    }
    return false;
  }
}