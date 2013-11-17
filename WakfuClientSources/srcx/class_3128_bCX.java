public class bCX
{
  String gxS;
  String value;

  public bCX(String paramString1, String paramString2)
  {
    jG(paramString1);
    setValue(paramString2);
  }

  public bCX()
  {
  }

  public void jG(String paramString)
  {
    this.gxS = paramString;
  }

  public void setValue(String paramString)
  {
    this.value = paramString;
  }

  public String bI()
  {
    return this.gxS;
  }

  public String getValue()
  {
    return this.value;
  }
}