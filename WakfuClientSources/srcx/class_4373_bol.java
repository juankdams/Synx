import java.util.ArrayList;

public class bol
  implements dpf
{
  private final String fHI;
  private final String fHJ;
  private final Class fHK;
  private final ArrayList fHL = new ArrayList();

  public bol(Class paramClass, String paramString1, String paramString2)
  {
    this.fHI = paramString1;
    this.fHJ = paramString2;
    this.fHK = paramClass;
  }

  public bol(Class paramClass, String paramString1, String paramString2, String[] paramArrayOfString) {
    this.fHI = paramString1;
    this.fHJ = paramString2;
    this.fHK = paramClass;

    for (int i = 0; i < paramArrayOfString.length; i++)
      this.fHL.add(paramArrayOfString[i]);
  }

  public void addParam(String paramString)
  {
    this.fHL.add(paramString);
  }

  public Class bya()
  {
    return this.fHK;
  }

  public String a(bUk parambUk)
  {
    StringBuilder localStringBuilder = new StringBuilder();

    if (this.fHJ != null) {
      if (this.fHK != null) {
        localStringBuilder.append("((").append(this.fHK.getSimpleName()).append(")");
      }

      localStringBuilder.append(this.fHJ);

      if (this.fHK != null) {
        localStringBuilder.append(")");
      }
      localStringBuilder.append(".");
    }

    localStringBuilder.append(this.fHI).append("(");

    int i = 1;
    for (String str : this.fHL) {
      if (i == 0)
        localStringBuilder.append(", ");
      else {
        i = 0;
      }
      localStringBuilder.append(str);
    }

    localStringBuilder.append(");");

    return localStringBuilder.toString();
  }
}