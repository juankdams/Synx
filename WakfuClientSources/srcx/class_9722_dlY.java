public abstract class dlY
{
  protected aNL gKm;

  public dlY(aNL paramaNL)
  {
    this.gKm = paramaNL;
    bTS();
  }

  public void beL() {
    cpa localcpa = this.gKm.getElementMap();
    if (localcpa == null) {
      return;
    }
    String str1 = localcpa.getId();
    String str2 = this.gKm.getId();

    if (str1 == null) {
      return;
    }

    ak(str1, str2);
  }

  public void beM() {
    cpa localcpa = this.gKm.getElementMap();
    if (localcpa == null) {
      return;
    }
    String str1 = localcpa.getId();
    String str2 = this.gKm.getId();

    if (str1 == null) {
      return;
    }

    al(str1, str2);
  }

  protected abstract void ak(String paramString1, String paramString2);

  protected abstract void al(String paramString1, String paramString2);

  public abstract void bTR();

  public abstract void bTS();

  public abstract boolean bTT();
}