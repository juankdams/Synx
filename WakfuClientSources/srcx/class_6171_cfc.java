public class cfc
{
  private final int aRQ;
  private final int hAa;
  private final String aRT;
  private final String[] hAb;

  public cfc(int paramInt1, int paramInt2, String paramString, String[] paramArrayOfString)
  {
    this.aRQ = paramInt1;
    this.hAa = paramInt2;
    this.aRT = paramString;
    this.hAb = paramArrayOfString;
  }

  public int eo() {
    return this.aRQ;
  }

  public int chY() {
    return this.hAa;
  }

  public String uL() {
    return this.aRT;
  }

  public String[] chZ() {
    return this.hAb;
  }

  public dGX cia() {
    return dGX.CG(chY());
  }
}