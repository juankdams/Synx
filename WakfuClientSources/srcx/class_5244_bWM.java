public final class bWM extends awa
{
  private final cpy hjf = new cpy();

  public cdO au(int paramInt1, int paramInt2) {
    byte b = as(paramInt1, paramInt2);
    if (b < 0) {
      return null;
    }
    if (this.hjf.contains(b)) {
      return null;
    }
    return au(b);
  }

  public void aJ(Su paramSu) {
    if (paramSu == null)
      return;
    this.hjf.dP(paramSu.cgE());
  }

  public void aK(Su paramSu) {
    if (paramSu == null)
      return;
    this.hjf.dQ(paramSu.cgE());
  }
}