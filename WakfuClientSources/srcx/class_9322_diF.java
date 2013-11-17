import java.io.File;
import java.util.Enumeration;

public class diF extends MS
{
  private boolean leT = true;

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (lT()) {
      localStringBuilder.append("{majorityselect: ");
      localStringBuilder.append(super.toString());
      localStringBuilder.append("}");
    }
    return localStringBuilder.toString();
  }

  public void jr(boolean paramBoolean)
  {
    this.leT = paramBoolean;
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();
    int i = 0;
    int j = 0;
    Enumeration localEnumeration = lV();

    while (localEnumeration.hasMoreElements()) {
      if (((ank)localEnumeration.nextElement()).a(paramFile1, paramString, paramFile2))
      {
        i++;
      }
      else j++;
    }

    if (i > j)
      return true;
    if (j > i) {
      return false;
    }

    return this.leT;
  }
}