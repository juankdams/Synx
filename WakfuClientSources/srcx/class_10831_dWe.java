public class dWe
  implements bPz
{
  private static final dWe mvo = new dWe();
  private bPz mvp;

  public static dWe dvA()
  {
    return mvo;
  }

  public void a(bPz parambPz)
  {
    this.mvp = parambPz;
  }

  public void a(dBv paramdBv, String[] paramArrayOfString)
  {
    if (this.mvp != null)
      this.mvp.a(paramdBv, paramArrayOfString);
  }

  public void t(String paramString, Object paramObject)
  {
    if (this.mvp != null)
      this.mvp.t(paramString, paramObject);
  }
}