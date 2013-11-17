public class dMm extends dkV
{
  private String eoE;
  private String eoF;

  public void setFrom(String paramString)
  {
    this.eoE = paramString;
  }

  public void setTo(String paramString)
  {
    this.eoF = paramString;
  }

  public String dR(String paramString)
  {
    if (this.eoE == null) {
      throw new cJ("Missing from in stringreplace");
    }
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    int j = paramString.indexOf(this.eoE);
    while (j >= 0)
    {
      if (j > i) {
        localStringBuffer.append(paramString.substring(i, j));
      }

      if (this.eoF != null) {
        localStringBuffer.append(this.eoF);
      }

      i = j + this.eoE.length();
      j = paramString.indexOf(this.eoE, i);
    }

    if (paramString.length() > i) {
      localStringBuffer.append(paramString.substring(i, paramString.length()));
    }

    return localStringBuffer.toString();
  }
}