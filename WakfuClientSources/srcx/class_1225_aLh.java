public class aLh extends bfJ
{
  public aLh(int paramInt, String paramString1, float[] paramArrayOfFloat, String paramString2, boolean paramBoolean)
  {
    super(paramInt, paramString1, paramArrayOfFloat, paramString2, paramBoolean);
  }

  public void a(aEe paramaEe)
  {
    f(paramaEe);
    super.a(paramaEe);
  }

  public void a(aEe paramaEe, String paramString)
  {
    f(paramaEe);
    super.a(paramaEe, paramString);
  }

  private void f(aEe paramaEe) {
    String str = paramaEe.getSourceName();
    if (oF(str) == null)
      gT(str);
  }

  public void gT(String paramString)
  {
    bfJ localbfJ = new bfJ(-1, "subPipe".concat(paramString), this.bRQ, null, false);
    a(paramString, localbfJ);
  }
}