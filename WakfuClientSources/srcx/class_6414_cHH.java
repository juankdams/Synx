public class cHH
  implements dpf
{
  private Class fHK;
  private String m_name;
  private String esb;
  private boolean iCG;

  public cHH(Class paramClass, String paramString1, String paramString2)
  {
    this(paramClass, paramString1, paramString2, false);
  }

  public cHH(Class paramClass, String paramString1, String paramString2, boolean paramBoolean) {
    this.fHK = paramClass;
    this.m_name = paramString1;
    this.esb = paramString2;
    this.iCG = paramBoolean;
  }

  public Class bya()
  {
    return this.fHK;
  }

  public String a(bUk parambUk)
  {
    StringBuilder localStringBuilder = new StringBuilder();

    if ((!this.iCG) && (!parambUk.ks(this.m_name))) {
      parambUk.kt(this.m_name);
      localStringBuilder.append(this.fHK.getSimpleName()).append(" ");
    }

    localStringBuilder.append(this.m_name).append(" = ");

    localStringBuilder.append("(").append(this.fHK.getSimpleName()).append(") ");

    localStringBuilder.append(this.esb).append(";");

    return localStringBuilder.toString();
  }
}