public class bqj
{
  private final bXf boY;
  private final String boZ;
  private final bFB[] bpa;
  private boolean fLn;

  public bqj(cp paramcp, bXf parambXf, String paramString, bFB[] paramArrayOfbFB, boolean paramBoolean)
  {
    this.boY = parambXf;
    this.boZ = paramString;
    this.bpa = paramArrayOfbFB;
    this.fLn = paramBoolean;
  }

  public boolean bzs() {
    return this.fLn;
  }

  public int uN() {
    return this.boY.getId();
  }

  public void fa(boolean paramBoolean) {
    this.fLn = paramBoolean;
  }

  public boolean a(dPJ paramdPJ)
  {
    this.boY.a(this.boZ, this.bpa, new cIG[] { paramdPJ.pk() });
    return false;
  }
}