import java.io.File;
import java.util.Enumeration;

public class bQW extends MS
{
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (lT()) {
      localStringBuilder.append("{andselect: ");
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
      if (!((ank)localEnumeration.nextElement()).a(paramFile1, paramString, paramFile2)) {
        return false;
      }
    }
    return true;
  }
}