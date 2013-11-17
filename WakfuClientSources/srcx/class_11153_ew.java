public class ew extends dDv
{
  protected bSD aAI = bSD.hdG;

  public void a(bSD parambSD)
  {
    if (parambSD == null)
      this.aAI = bSD.hdG;
    else
      this.aAI = parambSD;
  }

  public void setDirection(String paramString) {
    a(bSD.valueOf(paramString));
  }

  public void clear() {
    this.cHC = null;
  }

  public void a(bSr parambSr) {
  }

  protected final boolean lF() {
    return this.aAI.lF();
  }

  protected final boolean lG() {
    return this.aAI.lG();
  }
}