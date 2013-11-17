public class czx
{
  private final String ioD;
  private final int aRR;

  public czx(String paramString, int paramInt)
  {
    this.ioD = paramString;
    this.aRR = paramInt;
  }

  public String getTarget() {
    return this.ioD;
  }

  public int uK() {
    return this.aRR;
  }

  public boolean c(czx paramczx) {
    if (this.ioD == null)
      return false;
    return (this.aRR == paramczx.uK()) && (this.ioD.equals(paramczx.getTarget()));
  }
}